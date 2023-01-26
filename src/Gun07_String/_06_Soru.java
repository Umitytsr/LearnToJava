package Gun07_String;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //tek seferde girilen bir ad soyadın adını ve soyadını ayırıp,
        //ayrı ayrı yazdırınız.(sadece ad ve soyad)

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınızı ve soyadınızı giriniz:");
        String parca1=oku.nextLine();
        int bosluk=parca1.indexOf(" ");
        System.out.println("ad = " + parca1.substring(0,bosluk));
        System.out.println("soyad = " + parca1.substring(bosluk+1));
    }
}
