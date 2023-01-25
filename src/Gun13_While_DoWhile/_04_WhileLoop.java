package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //Girilen 20 sayıdan sadece pozitif olanların
        //toplamını bulunuz

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        int sayac=1;
        while (sayac<=20){
            System.out.print("pozitif sayı giriniz:");
            int sayi= oku.nextInt();
            if (sayi>0){
                toplam=toplam+sayac;
            }

            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
