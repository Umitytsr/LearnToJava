package Gun10_If_MantiksalIfadeler;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        //Mantıksal İfadeler
        // && ve işaretimiz
        // || veya işaretimiz

        //Girilen sayı pozitif ve tek ise ekrana uygun sayı girildi
        //değilse uygun sayı girilmedi yazınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Pozitif ve tek bir sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi>0){
            System.out.println("Uygun sayı girildi");
        }else {
            System.out.println("Uygun sayı girilmedi");
        }
    }
}
