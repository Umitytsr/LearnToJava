package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program başladı");

        for (int i = 0; i < 3; i++) {


            try { // hata bölgesini try{}'ın içine aldık

                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi1 :");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2 :");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);

            } catch (Exception hata) { // hata mesajlarını hata isimli exception cinsinden değişkene attım
                System.out.println("Hata: " + hata.getMessage());
                System.out.println("Lütfen tekrar deneyiniz");
                i--;
            }

        }

        System.out.println("Program bitti");

    }
}
