package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program başladı");

        try { // dene, hatanın başladığı yerin üstüne konur

            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        } // hata olduğu zaman programı kırma

        catch (Exception ex)
          // ex isimli değişkende oluşan hataların bilgisini atanıyor
        { // hata olduğunda yapılamsı istenenleri buraya yazıyor
            System.out.println("Hata oluştu. Lütfen tekrar deneyiniz");
            System.out.println("Tüm hata mesajı= " +ex);
            System.out.println("Hatanın açıklanması= " +ex.getMessage());
            // Kendine mesajı mail atabilirsin.
            // log tutma : program nasıl çalışıyor, hata loglarını DB yazabilirsin
        }

        System.out.println("Program bitti");

        try {
            // Java ve toolları çalışmaya devam et
            // konuları öğrenmeye ve çalışmaya devam
        }   // anlamadığın yer mi oldu? kırılmadan devam et:
        catch (Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin, DEVAM
        }

            // sonunda seni güzel bir meslek bekliyor.

    }
}
