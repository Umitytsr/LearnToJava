package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //otopark ücretleri
        //3 saate kadar 10tl,5 saate kadar 15tl, 5den büyükse 20tl'dir
        //kullanıcıdan kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç saat kaldığınızı giriniz:");
        int saat= oku.nextInt();

        if (saat<=3 && saat>=0){
            System.out.println("5 tl ücretiniz bulunmaktadır");
        } else if (saat<=5) {
            System.out.println("10 tl ücretiniz bulunmaktadır");
        }else {
            System.out.println("20 tl ücretiniz bulunmaktadır");
        }
    }
}
