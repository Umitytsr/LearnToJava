package Gun05_Scanner;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        //Girilen bir adı ekrana yazınız.
        System.out.print("İsminizi Giriniz:");

        String isim="";
        Scanner okuyucu=new Scanner(System.in);
        isim=okuyucu.next();
        System.out.println("isim = " + isim);

    }
}
