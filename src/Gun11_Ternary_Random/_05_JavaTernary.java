package Gun11_Ternary_Random;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //girilen bir sayının sıfır mı negatif mi pozitif mi old.
        //ternary operatörüyle yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi:");
        int sayi= oku.nextInt();

        String sonuc= (sayi>0) ? "pozitif" : ((sayi==0) ? "sıfır" : "negatif");
        System.out.println("sonuc = " + sonuc);
    }
}
