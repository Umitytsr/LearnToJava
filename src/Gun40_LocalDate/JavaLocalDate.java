package Gun40_LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate Sadece gun ay yıl bilgisini tutar

        LocalDate tarih=LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear()); // YIL
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); // AY
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue()); // AY İSMİ
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth()); // AYIN KAÇINCI GÜNÜ
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek()); // HAFTANIN HANGİ GÜNÜ
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue()); // KAÇINCI HAFTA
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear()); // YILIN KAÇINCI GÜNÜ
        System.out.println("************\n");

        // Kendisinde ki hazır formatlar
        System.out.println("ISO_DATE= "+ tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT   = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDİUM  = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG    = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL    = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("************\n");

        // Localde aldığım tarihi istediğim ülkenin formatına, diline göre nasıl gösteririm?
        // örneğin localdeki saati Almanya'ya göre nasıl gösteririz
        System.out.println("FULL Almanya gösterimi = "+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        // lokalizasyon tanımlaması
        // en-US : birincisi DİLİ, ikincisi ÜLKEYİ temsil ediyor. Amerikan ingilizcesi
        // en-UK : UK(İngiltere) ingilizcesi
        // fr-CA : Kanada fransızcası
        // en-CA : Kanada ingilizcesi
        // tr-TR : Türkiye türkçesi

        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();
        for (Locale l: kullanilabilirLokaller) {
            if (l.getDisplayCountry().toLowerCase().contains("china")) {
                System.out.print("Dil = " + l.getDisplayLanguage());
                System.out.print(", Ülke= " + l.getDisplayCountry());
                System.out.print(", " + l.getLanguage());
                System.out.println("- " + l.getCountry());
            }
        }

        Locale lokalCince=new Locale("zh","CN");
        System.out.println("Full Çince gösterimi =\n " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        System.out.println("\n*************İstediğim formatta gösterme*************");

        // İstediğim formatta gösterme
        System.out.println("tarih = " + tarih);
        
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("tarih.format(ozelFormat1) = " + tarih.format(ozelFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("oz2 = " + tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("EEEE dd.MM.yyyy = " + tarih.format(oz3.withLocale(Locale.UK)));

        System.out.println("************\n");

        // Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5;
        
        LocalDate tarih1=LocalDate.of(2000,5,20);
        LocalDate tarih2=LocalDate.of(1999, Month.MARCH,12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));

    }
}
