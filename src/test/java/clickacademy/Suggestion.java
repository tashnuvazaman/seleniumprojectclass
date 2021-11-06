package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;

public class Suggestion extends SetUp {
    @Test
    public void suggestionTest(){
        driver.findElement(By.id("autocomplete")).sendKeys("Bangladesh");
    }

}
