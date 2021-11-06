package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

public class SwitchWindow extends SetUp {
    @Test
    public void switchWindowTest(){
        driver.findElement(By.id("openwindow")).click();
    }

}
