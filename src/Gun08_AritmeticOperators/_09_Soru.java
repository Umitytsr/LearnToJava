package Gun08_AritmeticOperators;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        //girilen bir cümledeki ilk kelimeyi yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz:");
        String a=oku.nextLine();
        int b=a.indexOf(" ");
        System.out.println("İlk Kelime = " + a.substring(0,b));


        //Bunu split'i öğrendikten sonra kendim ekledim
        String[] c=a.split(" ");
        System.out.println("c[0] = " + c[0]);
    }
}
