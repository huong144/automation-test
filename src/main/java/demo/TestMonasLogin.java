package demo;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestMonasLogin extends MonasAdmin {
    public IResponseApi getUrlApi(String email, String password) throws IOException, InterruptedException, ParseException {
        ILoginInput input = setUp(email, password);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpGet = new HttpPost("https://api.staging.dr-cex.sotatek.works/admin/login");
        List<NameValuePair> params = new ArrayList<NameValuePair>(2);
        params.add(new BasicNameValuePair("email", input.getEmail()));
        params.add(new BasicNameValuePair("password", input.getPassword()));
        httpGet.setEntity(new UrlEncodedFormEntity(params));
        CloseableHttpResponse response = httpClient.execute(httpGet);
        int statusCode = response.getCode();
        String responseMessage = EntityUtils.toString(response.getEntity());
        response.close();
        httpClient.close();
        return new  IResponseApi(statusCode, responseMessage);
    }

    @Test
    public void monasAdminLogin() throws IOException, ParseException, InterruptedException {
        IResponseApi responseApi = getUrlApi("admin@monas.exchange", "123123");
        if (responseApi.getStatusCode() == 422) {
            Assert.fail("login false");
        } else {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void validateEmail() throws InterruptedException, IOException, ParseException {
        IResponseApi responseApi  = getUrlApi("", "123123");
        if (!responseApi.getResponseMessage().contains("email.required") ) {
            Assert.fail("login false");
        } else {
            Assert.assertTrue(true);
        }
    }
}
