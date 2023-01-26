package Gun26_OOP._04_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int aylikTuketim){
        toplamTuketim+=aylikTuketim;
    }

    public void toplamTuketimYaz(){
        System.out.println("ToplamTüketim: " + toplamTuketim);
    }

    public void faturaYaz(String name){
        double toplamTutar=toplamTuketim*birimFiyat;
        System.out.println("*******************");
        System.out.println("Faturanız");
        System.out.println("*******************");
        System.out.println("Müşteri = " + name);
        System.out.println("Toplam Tüketim= " +toplamTuketim);
        System.out.println("Toplam Tutar = " + Math.round(toplamTutar));
        System.out.println("*******************");

    }
}
