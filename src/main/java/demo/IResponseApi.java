package demo;

public class IResponseApi {
    private int statusCode;
    private String responseMessage;

    IResponseApi(int statusCode, String responseMessage) {
        this.statusCode = statusCode;
        this.responseMessage = responseMessage;
    }

    int getStatusCode() {
        return this.statusCode;
    }

    String getResponseMessage() {
        return this.responseMessage;
    }
}
