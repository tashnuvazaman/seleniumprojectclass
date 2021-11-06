package clickacademy;

import init.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTable extends SetUp {
    @Test
    public void webTableTest(){
        WebElement table = driver.findElement(By.id("product"));

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.println("content >>   " + cell.getText());
            }
        }
    }
}
