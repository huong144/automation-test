//package demo;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.log4testng.Logger;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class TestAssets {
//    private static final Logger log = Logger.getLogger(TestAssets.class);
//    private WebDriver driver;
//
//    @Test
//    public void RunTestAssert() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        //Khai báo đối tượng của SoftAssert
//        SoftAssert softassert = new SoftAssert();
//
//        driver.get("https://admin.staging.dr-cex.sotatek.works/admin/site-setting");
//        Thread.sleep(500);
//
//        //Login account
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@monas.exchange");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123123");
//        Thread.sleep(500);
//
//        driver.findElement(By.xpath("//button[@type='button']")).click();
//        Thread.sleep(500);
//
//        softassert.assertAll(); //Bắt buộc
//    }
//
//}
