package Gun05_Scanner;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {
        //kullanıcıdan ağırlığını ve boyunu double alarak yazınız
        //ayrı satırlarda boyunu ve kilosunu yazdırın
        //vücut kitle indeksini bularak yazdırınız(kg/boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("kilonuz:");
        double kilo= oku.nextDouble(); //int kilo=(int) oku.nextDouble(); veya int kilo=oku.nextInt();
        System.out.print("boyunuz:");
        double boy= oku.nextDouble();

        double kitleIndex=kilo/(boy*boy);

        System.out.println("kitleEndex = " + kitleIndex);
        System.out.println("boyunuz:"+boy+" kilonuz:"+kilo);

    }
}
