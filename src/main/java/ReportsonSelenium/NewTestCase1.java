package ReportsonSelenium;
import org.testng.annotations.*;
public class NewTestCase1 {
    


        @BeforeClass
        void beforeclass()
        {
            System.out.println("Before class to be executed");
        }

        @AfterClass
        void afterclass()
        {
            System.out.println("After class to be executed");
        }
        @BeforeMethod
        void beforemethod()
        {
            System.out.println("Before test to be executed");
        }

        @AfterMethod
        void aftermethod()
        {
            System.out.println("After test to be executed");
        }

        @Test
        void test1()
        {
            System.out.println("First test to be executed");
        }
        @Test
        void test2()
        {
            System.out.println("Second test to be executed");
        }

        @BeforeTest
        void beforetest()
        {
            System.out.println("Before test to be executed");
        }

        @AfterTest
        void aftertest()
        {
            System.out.println("After test to be executed");

        }

    }


