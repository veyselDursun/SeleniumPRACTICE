package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01_Exercise_1 {
    //....Exercise-1:...
    //Create a new class with main method
    public static void main(String[] args) throws InterruptedException {

        //Set Path
        System.setProperty("WebDriver.chrome.driver","src/resources/chromedriver.exe");

        //Create a chrome driver
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Maximize window
        driver.manage().window().maximize();    //driver.manage().window().fullscreen();

        //Open google home page https://www.google.com
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();

        //On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();

        //Wait about 4 sn
        Thread.sleep(3000);

        //Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(3000);

        //Refresh page
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Close/quit the browser
        driver.close();  //driver.quit(); Acilan tum pencereleri kapatir

        //And Last step print "All is well" on console
        System.out.println("All is well");
        System.err.println("ALL IS WELL");

    }
}
