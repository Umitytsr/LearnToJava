package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        //Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Ay numarasını giriniz:");
        int num= oku.nextInt();

        switch (num){
            case 1 : System.out.println("31 GÜN"); break;
            case 2 : System.out.println("28 GÜN"); break;
            case 3 : System.out.println("31 GÜN"); break;
            case 4 : System.out.println("30 GÜN"); break;
            case 5 : System.out.println("31 GÜN"); break;
            case 6 : System.out.println("30 GÜN"); break;
            case 7 : System.out.println("31 GÜN"); break;
            case 8 : System.out.println("31 GÜN"); break;
            case 9 : System.out.println("30 GÜN"); break;
            case 10 : System.out.println("31 GÜN"); break;
            case 11 : System.out.println("30 GÜN"); break;
            case 12 : System.out.println("31 GÜN"); break;
            default: System.out.println("hatalı ay no"); //yanlış bilgi girilirse default çalışıyo

        }

        //2. yol
        switch (num){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 : System.out.println("31 GÜN"); break;

            case 2 : System.out.println("28 GÜN"); break;

            case 4 :
            case 6 :
            case 9 :
            case 11 : System.out.println("30 GÜN"); break;

            default : System.out.println("hatalı ay no"); //yanlış bilgi girilirse default çalışıyo

            //NOT!! break yazılmayınca altındaki her şeyi yazacağı için aynı
            // değerli sonuçları bu şekilde de yazabiliriz
        }
    }
}
