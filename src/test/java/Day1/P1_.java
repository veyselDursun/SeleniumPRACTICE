package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_ {
    //....Exercise-1:...
    //Create a new class with main method
    public static void main(String[] args) throws InterruptedException {
        //Set Path
        System.setProperty("WebDriver.chrome.driver","src/resources/chromedriver.exe");
        //Create a chrome driver
        WebDriver driver= new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();    //driver.manage().window().fullscreen();
        //Open google home page https://www.google.com
        driver.get("https://www.google.com");
        Thread.sleep(4000);
        //On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(4000);
        driver.navigate().back();
        //Wait about 4 sn
        Thread.sleep(4000);
        //Navigate forward to amazon
        driver.navigate().forward();
        //Refresh page
        //Close/quit the browser
        //And Last step print "All is well" on console



    }
}
