package Gun11_Ternary_Random;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //girilen sayı 50'den büyükse 1,değilse 0 yazdırınız
        //Ternary operatörüyle yapınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi:");
        int sayi= oku.nextInt();

        String sonuc= (sayi>50) ? "1" : "0";
        System.out.println("sonuc = " + sonuc);
    }
}
