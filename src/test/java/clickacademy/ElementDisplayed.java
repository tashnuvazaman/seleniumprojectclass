package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

public class ElementDisplayed extends SetUp {
    @Test
    public void elementDisplayedTest(){
        driver.findElement(By.id("show-textbox")).click();
        if (driver.findElement(By.id("displayed-text")).isDisplayed()){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }


}
