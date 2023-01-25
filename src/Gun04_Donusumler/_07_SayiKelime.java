package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //yazıların sayıya,sayıların yazıya çevirilmesi


        String ad="Ümit";
        String kelimeSayi="25";//string halde olduğu için işlem yapılamaz

        int sayiDeger=Integer.parseInt(kelimeSayi);

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        //toplam şuan int yani sayıdır, bunu Stringe dönüştürmek için;
        String strToplam= Integer.toString(toplam);
        System.out.println("strToplam = " + strToplam);
    }
}
