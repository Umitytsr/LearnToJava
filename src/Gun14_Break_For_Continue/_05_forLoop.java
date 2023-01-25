package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //girilen bir sayıya(dahil) kadar olan
        //sayıların çarpımını bulunuz

        //2. bölüm: çarpım değeri 10.000'i geçtiğinde işlem sonlanır.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();

        int carpim=1;
        boolean sinirAsildi=false;

        for (int i=1; i<=sayi; i++){
            carpim*=i;
            if (carpim>10000){
                sinirAsildi=true;
                System.out.println("break çalıştı");
                break;
            }
        }
        if (sinirAsildi==false){
            System.out.println("Çarpımları=" + carpim);
        }
    }
}
