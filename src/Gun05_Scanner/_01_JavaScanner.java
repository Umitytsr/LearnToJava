package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tip   adı   ilk değeri   işlem tamam bu adımı çalıştır
          int  sayi=   5           ;

        //tipi   adı     yeni okuyucu(klavyeden-konsoldan)
        Scanner okuyucu= new Scanner(System.in);//kursor bekliyor sayı girişi için
                                                //sayı girilip enter'a basıldığında değeri alıp sayi'ya atıyor.


        System.out.print("Sayı Giriniz=");

        sayi=okuyucu.nextInt();
        System.out.println("sayi = " + sayi);

        /*
            okuyucu.next();         -> bir kelime okur
            okuyucu.nextLine();     -> satırın tümünü okur

            okuyucu.nextInt();      -> int değerini okur
            okuyucu.nextShort();    -> short değerini okur
            okuyucu.nextByte();     -> byte değerini okur
            okuyucu.nextLong();     -> long değerini okur

            okuyucu.nextFloat();    -> float değerini okur
            okuyucu.nextDouble();   -> double değerini okur */

    }
}