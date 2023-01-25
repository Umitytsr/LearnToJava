package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    Ogrenci(){ // İlk oluşturma anında çalışır.
               // Bunlara yapıcı metodlar deniz
               // Yapıcı metodlar -> Constructor metodlar demek.
        System.out.println("Nesne oluşturuldu");
    }


    Ogrenci(int id1, String ad1, String soyad1,int sinifi1){
        this.id=id1;
        this.ad=ad1;
        this.soyad=soyad1;
        this.sinifi=sinifi1;
    }

    Ogrenci(int id1, String ad1, String soyad1){

        this(id1, ad1, soyad1, 0);
    }

}
