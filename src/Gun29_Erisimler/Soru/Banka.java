package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int))
        // Musteri (musteriNo(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.

        Musteri must1=new Musteri();
        must1.ad="Ümit";
        must1.soyad="Yetişir";
        must1.musteriNo=1;

        must1.musteriHesap.paraYatirma(100);
        must1.musteriHesap.paraYatirma(200);
        must1.musteriHesap.paraCekme(50);

        System.out.println(must1.musteriHesap);
    }
}
