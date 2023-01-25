package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        //ekrana 5 kez merhaba yazdırınız

        int sayac=1;
        while (sayac<6) //dönme şartını yazıyoruz
        {   //tekrarlanacak şeyler parantez içine yazılır.
            //her döndükçe yapılacaklar
            System.out.println(sayac+".Merhaba");

            sayac++;
        }

        System.out.println("Program bitti");
    }
}
