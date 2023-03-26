//package demo;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import org.testng.Assert;
//import org.openqa.selenium.interactions.Actions;
//public class SeleniumTest {
//    private WebDriver driver;
//
//    @BeforeClass
//    public void setUp() {
//        // Set the path to the ChromeDriver executable
//        // Create a new ChromeDriver instance
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.youtube.com/watch?v=_TUNVEfyvMY");
//    }
//
////    @AfterClass
////    public void tearDown() {
////        // Quit the driver and close all windows
////        driver.quit();
////    }
//    @Test
//    public void testGoogleSearch() {
//        // Navigate to Google.com
//        driver.get("https://www.google.com");
//        // Enter "TestNG" in the search box
//        driver.findElement(By.name("q")).sendKeys("TestNG");
//        // Submit the search query
//        driver.findElement(By.name("btnK")).click();
//        // Verify that the search results page contains the text "TestNG"
//        Assert.assertTrue(driver.getPageSource().contains("TestNG"));
//    }
//}
