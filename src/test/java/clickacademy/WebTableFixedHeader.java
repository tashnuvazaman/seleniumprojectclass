package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

public class WebTableFixedHeader extends SetUp {
    @Test
    public void webTableFixedHeaderTest(){
        driver.findElement(By.name("radioButton")).click();

    }
}
