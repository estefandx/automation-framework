package cucumber.stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Links;

import java.io.IOException;


public class Hooks {

    public static WebDriver driver;



    @Before
    public void initDriver() throws IOException {
        setChromeDriverProperty();
        driver = new ChromeDriver();
        driver.get(Links.SHOP);
        driver.manage().window().maximize();



    }

    @After
    public void embedscreenshot() throws IOException{

        driver.quit();
    }

    private static void setChromeDriverProperty(){
        if(System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        }
        else{
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        }
    }

}
