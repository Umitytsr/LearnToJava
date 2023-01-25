package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayı negatif mi pozitif mi old. yazdırın
        //sıfır ise sıfır yazdır

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi>0){
            System.out.println("POZİTİF");
        }
        if (sayi==0){
            System.out.println("SIFIR");
        }
        if (sayi<0){
            System.out.println("NEGATİF");
        }
    }
}