package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06 {
    public static void main(String[] args) throws InterruptedException {
        //    1-Driver oluşturalim
        //    2-Java class'imiza chnomedriver. exetyi tanitalim
        //    3-Driver'in tum ekranı kaplamasini sagu ayalim
        //    4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        //      Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.

        System.setProperty("Webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    5-Navigate to http://www.babayigit.net/murat/testpage.html
        driver.get("http://www.babayigit.net/murat/testpage.html");

        //    6-first name, surname, age, Your Job, Birth Palace, Last graduated school,
        //      Number of Childre alanlarına gerekli bilgileri yazsın
        driver.findElement(By.id("ad")).sendKeys("Veysel");
        driver.findElement(By.id("soyad")).sendKeys("Dursun");
        driver.findElement(By.id("yas")).sendKeys("44");
        driver.findElement(By.id("meslek")).sendKeys("Ogretmen");
        driver.findElement(By.id("dogum_yeri")).sendKeys("Malatya");
        driver.findElement(By.id("mezun_okul")).sendKeys("HTTU");
        driver.findElement(By.id("cocuk_sayisi")).sendKeys("2");

        //    7-Submit tuşuna bassın
        driver.findElement(By.xpath("(//input[@type='submit'])")).click();

        //    8- All information was entered correctly.. yazısının göründüğünü test etsin

        if (driver.findElement(By.id("uyari")).isDisplayed()){
            System.out.println("All information was entered correctly.. Uyarisi Görüntülendi");
            System.out.println("TEST BASARILI");
        }else {
            System.out.println("All information was entered correctly...yazısı Görüntülenemedi.\n Test Failed");
            System.out.println("TEST BASARISIZ");
        }

        //    9- Clear butonu ile tüm butonları temizlesin
        driver.findElement(By.xpath("(//input[@type='reset'])")).click();

        //    10- Manuel olarak temizlendiğini görecek kadar beklesin
        Thread.sleep(1000);

        //    11- Sayfayı kapatsın
        driver.close();
    }
}
