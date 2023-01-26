package Gun06_String;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin son harfini yazdırın

        System.out.print("Bir String giriniz:");
        Scanner oku=new Scanner(System.in);

        String cumle=oku.nextLine();
        int uzunluk=cumle.length();
        char sonHarf=cumle.charAt(uzunluk-1);
        System.out.println("Son karakter = " + sonHarf);

    }
}