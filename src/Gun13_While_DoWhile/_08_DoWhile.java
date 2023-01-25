package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        //kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazdırınız

        Scanner oku=new Scanner(System.in);
        String harf;

        do {
            System.out.print("Harf giriniz:");
            harf= oku.next();
            if (!harf.equalsIgnoreCase("x"))
                System.out.println("Program çalışıyor");

        }while (!harf.equalsIgnoreCase("x"));

        System.out.println("Program Bitti");
    }

    //NOT!! kontrol işlemleri en son yapılacaksa doWhile kullanılır
    //      eğer başta yapılıyorsa normal while kullanılacak
}
