package Gun20_Method;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=34;
        int s4=43;

        int sonuc1=toplamBul("ismet",s1,s2);
        int sonuc2=toplamBul("ümit",s1,s2,s3);
        int sonuc3=toplamBul("ali",s1,s2,s3,s4);

    }

/*    public static int toplamBul(int s1,int s2){

        return s1+s2;
    }

    public static int toplamBul(int s1,int s2, int s3){

        return s1+s2+s3;
    }

    public static int toplamBul(int s1,int s2, int s3,int s4){

        return s1+s2+s3+s4;
    }

 */

    //yukarıdakileri gibi parametreler aynı tip sadece miktarları farklı ise
    //aşağıdaki yöntemi yapmak büyük bir kolaylık sağlar.

    //...ile ilgili 2 kural var
    //1- Bir metodda parametre olarak sadece 1 tane olabilir
    //2- Her zaman son parametre olmalı
    //   gelen kaç sayı olursa olsun hepsini dizi şeklinde metoda al.
    public static int toplamBul(String isim,int... sayilar){ //kaç sayı gelirse gelsin onları
                                                 //dizi şeklinde alıyor.
        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        return toplam;
    }

    //NOT!!! int'in yanına 3 nokta koyularak bu işlem yapılır.
    //NOT!!! aynı tip parametreleri yazarken(çoklu olanları) en sona yazılır.
    //       Yani toplamBul(int... sayilar, String isim) bu şekilde olmaz.

}
