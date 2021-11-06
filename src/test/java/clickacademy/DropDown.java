package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends SetUp {
    @Test
    public void dropDownTest(){
        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText("Option1");
    }



}
