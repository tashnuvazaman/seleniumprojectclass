package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SwitchToAlert extends SetUp {
    @Test
    public void SwitchToAlert(){
        driver.findElement(By.id("name")).sendKeys("abcd");
        driver.findElement(By.id("alertbtn")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
