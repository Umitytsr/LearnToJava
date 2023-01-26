package Gun11_Ternary_Random;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının pozitif negatif veya sıfır old. yazdır

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi=oku.nextInt();

        // 1.YOL
        if (sayi>0){
            System.out.println("POZİTİF");
        } else if (sayi == 0) {
            System.out.println("Sıfır");
        }else {
            System.out.println("NEGATİF");
        }

        // 2.YOL
        if (sayi>0){
            System.out.println("pozitif");
        }else {
            if (sayi<0){
                System.out.println("negatif");
            }else {
                System.out.println("sıfır");
            }
        }
    }
}
