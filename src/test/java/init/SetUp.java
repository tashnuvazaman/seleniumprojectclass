package init;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SetUp {
    public WebDriver driver;
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasnu\\IdeaProjects\\SeleniumProject\\src\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
    }

    //@After
    //public void after(){
        //driver.quit();
    //}
}
