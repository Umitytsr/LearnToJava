package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        //kullanıcıdan Cadde,sokak,postakodu(int) ve ülke alın
        //adres bilgisini yazdırın

        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        System.out.print("Caddenizi giriniz:");
        String cad=oku.nextLine();

        System.out.print("Sokağınızı giriniz:");
        String sok= oku.nextLine();

        System.out.print("Posta kodunuzu giriniz:");
        int posta= okuInt.nextInt();

        System.out.print("Ülkenizi giriniz:");
        String ulke=oku.nextLine();

        System.out.println("Adresiniz = " +cad+" "+sok+" "+posta+" "+ulke);


        //NOT!! String için ayrı, int için ayrı SCANNER oluştur.
    }
}
