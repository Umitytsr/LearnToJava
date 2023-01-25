package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="İsmet Temur";

        //1.Yöntem
        ogr.okulu=new Okul();//tanımlama ve atama aynı anda.
        ogr.okulu.adi="Mehmet Akif Ersoy";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucreti=50000;

        //2.Yöntem
        Okul ok=new Okul();//önce tanımlama yaparız,
        ok.adi="Mehmet Akif Ersoy";
        ok.mudurAdi="Merve Aslan";
        ok.ucreti=50000;
        ogr.okulu=ok;//atama işlemi en son


        System.out.println("OkunNO = " + ogr.okulNo);
        System.out.println("tamAd = " + ogr.tamAd);
        System.out.println("Okul adı = " + ogr.okulu.adi);
        System.out.println("mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ücreti = " + ogr.okulu.ucreti);

        ogr.BilgiYazdir();

    }
}
