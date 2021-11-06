package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

public class RadioButton extends SetUp{
    @Test
    public void radioButtonTest(){
    driver.findElement(By.name("radioButton")).click();
    }
}
