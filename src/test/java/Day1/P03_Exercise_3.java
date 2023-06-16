package Day1;

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
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

   //Click on  Calculater under Micro Apps

   //Type any number in the first input

   //Type any number in the second input

   //Click on Calculate

   //Get the result

   //Print the result

    }
}
