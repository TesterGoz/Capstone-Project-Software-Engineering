package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class Driver {

        private static WebDriver driver;

        public static WebDriver getDriver() {
            if (driver == null) {
                setUpDriver();
            }
            return driver;
        }

        private static void setUpDriver() {
            if (driver == null) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            System.out.println(driver.getTitle());
        }

        public static void closeDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }


