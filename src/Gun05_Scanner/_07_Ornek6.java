package Gun05_Scanner;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        //bir dikdörtgenin uzun ve kısa kenar uzunluklarını kullanıcıdan iste
        //çevresini ve alanını bulup yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Uzun kenarı giriniz:");
        int a=oku.nextInt();

        System.out.print("Kısa kenarı giriniz:");
        int b= oku.nextInt();

        int cevre=2*a+2*b;
        int alan=a*b;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
