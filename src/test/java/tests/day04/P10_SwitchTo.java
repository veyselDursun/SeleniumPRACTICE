package tests.day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class P10_SwitchTo extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        // gerekli ayarlamalari yapin

        //google.com adresine gidin
        driver.get("https://www.google.com");

        //Google title'nin Google icerdigini test edin
        String ilkSayfaWHD = driver.getWindowHandle();
        System.out.println("ilk sayfanin acildigi yerin handle Degeri: "+ ilkSayfaWHD);
        String expectedWords="Google";
        String actualTitle = driver.getTitle();
        Thread.sleep(3000);
        Assert.assertTrue(actualTitle.contains(expectedWords));

        //Yeni bir pencerede wisequarter sayfasina gidelim
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        driver.get("https://www.wisequarter.com");

        //wisequarter sayfasinin title'nin wise icerdigini test edin
        String ikinciSayfaWHD = driver.getWindowHandle();
        System.out.println("ikinci sayfanin acildigi yerin handle Degeri: "+ ikinciSayfaWHD);
        String expectedWords2="Wise";
        String actualTitle2 = driver.getTitle();
        Thread.sleep(3000);
        Assert.assertTrue(actualTitle2.contains(expectedWords2));
    }
}
