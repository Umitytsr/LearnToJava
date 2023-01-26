package Gun13_While_DoWhile;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //kullanıcı 0 değeri girene kadar girdiği
        //sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int sayi;
        int toplam=0;

        do {//döngü arası şart başta olmadığından en az bir kere
            //çalışır, kontrolü en son yapar.
            System.out.print("Sayı giriniz:");
            sayi= oku.nextInt();

            toplam=toplam+sayi;
        }while (sayi !=0);

        System.out.println("toplam = " + toplam);
    }

    //KISACA NOT!! doWhile işlemleri normal while işlemine göre
    //             döngüyü tersten başlatıyor.
}
