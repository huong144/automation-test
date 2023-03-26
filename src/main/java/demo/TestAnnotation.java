//package demo;
//
//import org.testng.annotations.*;
//
//public class TestAnnotation {
//
//    @BeforeSuite // chạy trước khi tất cả các @Test chạy
//    public void beforeSuite() {
//        System.out.println("Before Suite");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("After Suite");
//    }
//
//    @BeforeTest //chú thích sẽ dc chạy trc khi bất kỳ 1 @Test nào trong cùng 1 class dc gọi để chạy
//    public void beforeTest() {
//        System.out.println("Before Test");
//    }
//
//    @AfterTest // chú thích sẽ dc chạy sau khi tất cả các @Test thuộc cùng class đã chạy xong
//    public void afterTest() {
//        System.out.println("After Test");
//    }
//
//    @BeforeClass //chú thích dc chạy TRƯỚC khi @Test đầu tiên trong class dc gọi, sau beforeTest
//    public void beforeClass() {
//        System.out.println("Before Class");
//    }
//
//    @AfterClass // chú thích sẽ dc chạy SAU khi tất cả các @Test trong class đc chạy hết, đóng trc AfterTest
//    public void afterClass() {
//        System.out.println("After Class");
//    }
//
//    @BeforeGroups(groups = {"testOne"})
//    public void beforeGroupOne() {
//        System.out.println("Before Group testOne");
//    }
//
//    @AfterGroups(groups = {"testOne"})
//    public void afterGroupOne() {
//        System.out.println("After Group testOne");
//    }
//
//    @BeforeGroups(groups = {"testTwo"})
//    public void beforeGroupTwo() {
//        System.out.println("Before Group testTwo");
//    }
//
//    @AfterGroups(groups = {"testTwo"})
//    public void afterGroupTwo() {
//        System.out.println("After Group testTwo");
//    }
//
//    @BeforeMethod // chú thích sẽ dc chạy trc mỗi test
//    public void beforeMethod() {
//        System.out.println("Before Method");
//    }
//
//    @AfterMethod //chú thích sẽ dc chạy sau mỗi test
//    public void afterMethod() {
//        System.out.println("After Method");
//    }
//
//    @Test(groups = {"testOne"}) // test : đại diện cho 1 test case
//    public void testOneMethod() {
//        System.out.println("Test method One");
//    }
//
//    @Test(groups = {"testTwo"})
//    public void testTwoMethod() {
//        System.out.println("Test method Two");
//    }
//
//}
