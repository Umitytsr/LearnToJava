package Gun14_Break_For_Continue;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //kullanıcıdan 5 sayı isteyiniz
        //bu sayılardan 6 ile 10 arasındakiler hariç toplasın.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i=0;i<5;i++){
            System.out.print("sayı giriniz:");
            int sayi= oku.nextInt();
            if (6<sayi && sayi<10){
                continue; // çalıştığı anda kendinden sonra gelen komutları
                          //pas geeçiriz
            }
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);
    }

    //NOT!!!!!
    // BREAK ve CONTINUE
    // Döngüleri etkiler
    //if şartı ile çalışır
    //Break döngüyü kırar.
    //Continue ise sadece o adımı
    //pass geçirir.döngü devam eder
}
