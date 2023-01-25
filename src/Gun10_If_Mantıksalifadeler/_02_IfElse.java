package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //girilen vize(%50) ve final (%50) notunu okuyarak ortalamayı bulunuz
        //ortalama 60'dan büyük-eşitse geçtiniz değilse büte kaldınızı yazınız

        Scanner okuInt=new Scanner(System.in);
        System.out.print("Vize notunu giriniz:");
        int vize= okuInt.nextInt();
        System.out.print("Final notunu giriniz:");
        int finalOkul=okuInt.nextInt();
        int ortalama=(vize+finalOkul)/2;
        System.out.println("Notunuz:"+ortalama);

        if (ortalama>=60){
            System.out.println("GEÇTİNİZ");
        }else {
            System.out.println("Bütte geçersin inş :)");
        }


    }
}
