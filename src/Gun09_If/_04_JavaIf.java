package Gun09_If;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının çift mi tek mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= oku.nextInt();
        if (sayi%2 != 0) {
            System.out.println("TEK");
        }
        if (sayi%2 == 0){
            System.out.println("ÇİFT");
        }
    }
}
