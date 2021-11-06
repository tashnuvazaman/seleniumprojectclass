package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

public class CheckedBox extends SetUp {
    @Test
    public void checkedBoxTest(){
        driver.findElement(By.id("checkBoxOption1")).click();
    }



}
