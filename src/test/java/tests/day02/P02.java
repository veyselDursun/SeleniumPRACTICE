package tests.day02;

import org.junit.*;

public class P02 {
    @BeforeClass
    public static void beforeClass(){System.out.println("Test Süreci Başlıyor. Before Class çalıştı");}

    @AfterClass
    public static void afterClass(){System.out.println("Tüm testler koşuldu.After Class çalıştı");}

    @Before
    public void before(){System.out.println("---Yeni Bir Test Çalışıyor---");}

    @After
    public void after(){System.out.println("---Test Sonlandırıldı. Sıradaki teste geçiliyor----");}

    @Test
    public void zest01(){
        System.out.println("1 Numaralı test çalıştırılıyor");
    }
    @Test
    public void test02(){
        System.out.println("2 Numaralı test çalıştırılıyor");
    }
}
