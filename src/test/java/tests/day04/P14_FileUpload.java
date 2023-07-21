package tests.day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P14_FileUpload extends TestBase {
    @Test
    public void fileUpload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseButton= driver.findElement(By.id("file-upload"));
        String dosyaYolu="C:/Users/murat/IdeaProjects/Team116_Selenium_JUnit/src/test/java/practice/wise1.jpg";

        chooseButton.sendKeys(dosyaYolu);
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
        bekle(2);
        WebElement UploadedYazisi= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(UploadedYazisi.isDisplayed());
        bekle(2);
    }

}
