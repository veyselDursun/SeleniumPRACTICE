package tests.day04;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class P13_FakerClass extends TestBase {
    @Test
    public void faker() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
        WebElement isimkutusu= driver.findElement(By.xpath("//input[@name='name']"));
        WebElement emailkutusu= driver.findElement(By.xpath("(//input[@name='email'])[2]"));

        Faker faker=new Faker();
        String isim=faker.name().fullName();
        String email=faker.internet().emailAddress();
        Actions actions=new Actions(driver);
        actions.click(isimkutusu).sendKeys(isim).sendKeys(Keys.TAB).sendKeys(email).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        driver.findElement(By.id("id_gender1")).click();
        WebElement passwordkutusu= driver.findElement(By.id("password"));
        actions.click(passwordkutusu).sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(isim).sendKeys(Keys.TAB).sendKeys(isim).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).perform();
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        String ecpectedword="CREATED";
        WebElement actualword= driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String testWord=actualword.getText();
        Assert.assertTrue(testWord.contains(ecpectedword));

    }
}
