package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

public class SwitchTab extends SetUp {
    @Test
    public void switchTabTest(){
        driver.findElement(By.id("opentab")).click();
    }
}
