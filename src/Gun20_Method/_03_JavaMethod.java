package Gun20_Method;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını
        //(faktöriyel) bir fonksiyonda buldurup, bunun sonucunu main de
        //tek mi çift mi old. yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();

        int carpim=faktoriyel(sayi);
        String sonuc=(carpim%2==0) ? "çift" : "tek";
        System.out.println("sonuc = " + sonuc);
    }

    public static int faktoriyel(int sayi){
        int carpim=1;
        for (int i = 1; i <= sayi; i++) {
            carpim*=i;
        }
        return carpim;
    }
}
