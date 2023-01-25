package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi();
        //kisi1.ad="Ümit";
        //kisi1.soyad="Yetisir";
        //kisi1.yas=-25;

        kisi1.setAd("Ümit");
        kisi1.setSoyad("Yetişir");
        kisi1.yasAta(-25);

        System.out.println(kisi1.yasVer());

        System.out.println("kisi1 = " + kisi1);

        // değişkene direkt erişimi kapatıp
        // bir metod ile korumalı ver gönderme ve alma
        // işlemine Encapsulation denir.
    }
}
