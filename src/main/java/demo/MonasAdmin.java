package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonasAdmin {
    private WebDriver driver;

//    @BeforeMethod
    public ILoginInput setUp(String email, String password) throws InterruptedException {
        System.out.println(email + ":" + password);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://admin.staging.dr-cex.sotatek.works/admin/site-setting");
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(500);

        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(500);
        return new ILoginInput(email, password);
    }

}
