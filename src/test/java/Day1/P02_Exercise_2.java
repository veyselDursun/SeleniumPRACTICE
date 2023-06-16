package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_Exercise_2 {
    public static void main(String[] args) {

//1-Driver oluşturalim
        System.setProperty("Webdriver.chrome.driver","resources/chromedriver.exe");

//2-Java class'imiza chnomedriver.exet i tanitalim
        WebDriver driver=new ChromeDriver();

//3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();

//4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
// Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//5-"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        driver.findElement(By.xpath("//button[@class='p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton']")).click();
//6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim

        String ottoTitle = driver.getTitle();
        System.out.println("ottoTitle=" + ottoTitle);

        String ottoURL = driver.getCurrentUrl();
        System.out.println("ottoURL=" + ottoURL);

//7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim

        if (ottoTitle.contains("OTTO") && ottoURL.contains("OTTO")){
            System.out.println("Hem Title hemde Url OTTO kelimesi iceriyor.\ntest PASSED");
        }else{
            System.out.println("Hem Title hemde Url OTTO kelimesi icermiyor.\ntest FAILED");
        }

//8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");

//9-Bu adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String wiseTitle = driver.getTitle();
        System.out.println("wiseTitle=" + wiseTitle);

        if (wiseTitle.contains("wisequarter")){
            System.out.println("");
        }else{
            System.out.println("");
        }

//10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

//11-Sayfayı yenileyelim
        driver.navigate().refresh();

//12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
       driver.navigate().forward();
       driver.close();

//13- En son adim olarak butun sayfalarimizi kapatmis olalim

      driver.quit();

    }
}
