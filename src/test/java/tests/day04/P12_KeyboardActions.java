package tests.day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P12_KeyboardActions extends TestBase {
    @Test
    public void AmazonArama(){
        driver.get("https://www.amazon.com");

        //Amazonda iPhone XR araması yaptıralaım

        Actions actions=new Actions(driver);
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        actions.click(searchBox)
                .keyUp(Keys.SHIFT).sendKeys("i").keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("hone ").keyDown(Keys.SHIFT).sendKeys("XR").sendKeys(Keys.ENTER).perform();
        WebElement sonuckelimesi= driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedWords="iPhone XR";
        String actualWords=sonuckelimesi.getText();
        Assert.assertTrue(actualWords.contains(expectedWords));

    }
}
