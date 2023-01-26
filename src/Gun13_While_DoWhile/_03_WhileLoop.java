package Gun13_While_DoWhile;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayının toplamının sonucunu yazdırınız

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;
        while (sayac<=5){
            System.out.print("Sayı giriniz:");
            int sayi= oku.nextInt();
            toplam=toplam+sayi;

            sayac++;

        }
        System.out.println("toplam = " + toplam);//en son sonuç while süslü parantezinin
                                                 //dışına yapılır çünkü döngü bitmiş olur



        //UNUTMA!! tekrarlanan şeyler WHİLE ile yapılır
    }
}
