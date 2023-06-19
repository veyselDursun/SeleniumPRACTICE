package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03_Exercise_3 {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

   //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

   //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest"));

   //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("12");

   //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("8");

   //Click on Calculate
        driver.findElement(By.id("calculate")).click();

   //Get the result
        String result = driver.findElement(By.xpath("//*[@id='answer']")).getText();

   //Print the result
        System.out.println("RESULT = " + result);
        driver.close();

    }
}
