package Gun31_Enum._03_Enum;

public class AylarMain {
    public static void main(String[] args) {

        System.out.println("Aylar.AGUSTOS = " + Aylar.AGUSTOS);

        // ayın kaç gün sürdüğünü görmek için metod gerekiyor
        // ayın türkçe yazılışını görmek için metod gerekiyor
        // ayın gerçek sıra numarasını görmek için metod gerekiyor

        // Java diyor ki bu şekilde tek bir kelime veya
        // sayı olan değerleri olacaksa, sana bir kolaylık vereyim


        Aylar ay=Aylar.AGUSTOS;

        System.out.println("ay= "+ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);

        //toString kullanarak
        //NOT!! toString yerine yukarıda ki özelliği kullanmak daha faydalıymış.
        System.out.println(ay);

        //foreach ile
        for (Aylar a: Aylar.values()){
            System.out.println(a.ayNo+" "+a.gunMiktar+" "+a.ayAd);
        }
    }
}
