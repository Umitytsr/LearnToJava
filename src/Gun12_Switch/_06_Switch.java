package Gun12_Switch;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //Girilen bir sayının birler basamağındaki değerini yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();
        int birlerBas=sayi%10;

        System.out.print("Birler basamağında ki sayı: ");
        switch (birlerBas){
            case 0: System.out.print("SIFIR");break;
            case 1: System.out.print("BİR");break;
            case 2: System.out.print("İKİ");break;
            case 3: System.out.print("ÜÇ");break;
            case 4: System.out.print("DÖRT");break;
            case 5: System.out.print("BEŞ");break;
            case 6: System.out.print("ALTI");break;
            case 7: System.out.print("YEDİ");break;
            case 8: System.out.print("SEKİZ");break;
            case 9: System.out.print("DOKUZ");break;
        }
    }
}
