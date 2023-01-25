package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir nota göre 50den büyükse geçtiniz
        //küçükse kaldınız yazınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu giriniz:");
        int not= oku.nextInt();

        if (not>=50){
            System.out.println("GEÇTİNİZ");
        }else{
            System.out.println("KALDINIZ");
        }
    }
}
