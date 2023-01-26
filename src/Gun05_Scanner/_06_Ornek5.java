package Gun05_Scanner;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        //bir karenin kenarını kullanıcıdan isteyip alanı ve çevresini ekrana yazdır

        Scanner oku =new Scanner(System.in);

        System.out.print("karenin kenar uzunluğunu giriniz:");

        int kenar=oku.nextInt();
        int alan=kenar*kenar;
        int cevre=kenar+kenar+kenar+kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
