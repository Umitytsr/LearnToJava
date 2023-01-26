package Gun30_Final._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        Scanner scanInt=new Scanner(System.in);
        System.out.print("Gün:");
        int gun= scanInt.nextInt();

        System.out.print("saat:");
        int girilenSaat= scanInt.nextInt();

        System.out.print("dakika:");
        int girilenDakika=scanInt.nextInt();

        int toplamSaniye=gun*Sabitler.saat*Sabitler.dakika*Sabitler.saniye
                +girilenSaat*Sabitler.dakika*Sabitler.saniye
                +girilenDakika*Sabitler.saniye;

        System.out.println("toplamSaniye = " + toplamSaniye);
    }
}
