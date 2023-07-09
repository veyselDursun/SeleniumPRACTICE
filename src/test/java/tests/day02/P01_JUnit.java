package tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01_JUnit {

    static WebDriver driver;
    WebElement searchbox;
    WebElement result;

        /*
    BeforeClass ile driver'i oluşturun ve class icinde static yapin
    Maximize edin ve 10 sn bekletin
    http://www.qooqle.com adresine gidin
    1-arama kutusuna "12 Angry Men" yaz ip, cikan sonuc sayisini yazdinin
    2-arama kutusuna "Vizontele" yaz ip, cikan sonuc sayisini yazdirin
    3-arama kutusuna "Saving Private Ryan" yazıp, cikan sonuc sayisini yazdirin
    AfterClass ile kapatin.
         */

    @BeforeClass //tüm testlerden önce sadece bir kere çalışır
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass //Tüm testler bittikten sonra bir kere çalışır
    public static void tearDown(){driver.quit();}

    @Before //Her testten önce bir kere çalışır
    public void before(){
        driver.get("https://www.google.com");
        searchbox= driver.findElement(By.xpath("//*[@id='APjFqb']"));
    }

    @After //Her testten sonra bir kere çalışıyor
    public void after(){
        result= driver.findElement(By.xpath("//*[@id='result-stats']"));
        System.out.println(result.getText());
    }

    @Test
    public void test01(){
        searchbox.sendKeys("12 Angry Men"+ Keys.ENTER);
    }

    @Test
    public void test02(){
        searchbox.sendKeys("Vizontele" + Keys.ENTER);
    }

    @Test
    public void test03(){
        searchbox.sendKeys("Saving Private Ryan"+Keys.ENTER);

    }
}
