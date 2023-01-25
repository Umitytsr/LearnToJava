package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //kullanıcıdan 2 kex gireceği şifrenin aynı olduğunu
        //AYNI veya DEĞİL şeklinde cevaplayınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifrenizi giriniz:");
        String ilkGirilen= oku.nextLine();
        System.out.print("Tekrar giriniz:");
        String ikinciGirilen= oku.nextLine();

        if (ilkGirilen.equals(ikinciGirilen)){
            System.out.println("AYNI");
        }
        if (!ilkGirilen.equals(ikinciGirilen)){
            System.out.println("DEĞİL");
        }
    }
}
