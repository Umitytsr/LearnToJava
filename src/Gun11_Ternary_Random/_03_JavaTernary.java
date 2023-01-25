package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //kullanıcının girdiği sayı çift mi tek mi yazdır

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi:");
        int sayi= oku.nextInt();

        //Asıl yol
        if (sayi%2 == 0){
            System.out.println("çift");
        }else {
            System.out.println("tek");
        }

        //kolaylaştırılmış yol
        String sonuc= (sayi%2 == 0) ? "ÇİFT" : "TEK";
        System.out.println("sonuc = " + sonuc);
            //? işareti if, : ise else anlamına gelir.
    }
}
