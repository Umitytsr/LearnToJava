package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran= 3.2;
        int sayi=5;

        sayi=(int) oran; //büyük bir alanı küçük bir alana atıyosun
                         //tehlikeli işlem yapıyosun,bundan dolayı challanger patladı
                         //değerlere bak, eğer oluşan veri kaybını anladıysan ve kabulse bana bunu bilerek yaptığını göster
                         //parantez içerisinde değeri göstermemiz lazım


        System.out.println("sayi = " + sayi);


        //Örnek

        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre=(byte) (2*kisaKenar+2*uzunKenar);
        //toplam değer normalde int durumunda ama biz byte'ı kontrol ettik ve sıkıntı çıkmadı
        //o yüzden (byte) olarak tanımlayabildik.

        System.out.println("cevre = " + cevre);

    }
}
