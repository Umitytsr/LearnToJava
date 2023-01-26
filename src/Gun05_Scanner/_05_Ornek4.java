package Gun05_Scanner;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 2 tam sayıyı toplayınız ve ekrana yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("ilk sayı:");
        int sayi1=oku.nextInt();

        System.out.print("ikinci sayı:");
        int sayi2=oku.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println("Toplamları:"+toplam);
    }
}
