package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        //günün sorusu: 3x2'lik bir diziyi kullanıcıdan sayı olarak
        //oldurduktan sonra sadece tek elemanlarını tek boyutlu bir
        //diziye atayınız.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[3][2];
        int toplam=0;

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("Sayı giriniz: ");
                tablo[i][j]= oku.nextInt();
                if ( tablo[i][j]%2 !=0 ){
                    toplam++;
                }
            }
            System.out.println();
        }

        int[] dizi=new int[toplam];
        toplam=0;

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]%2!=0){
                    dizi[toplam]=tablo[i][j];
                    toplam++;
                }
            }
        }

        System.out.println(Arrays.toString(dizi));
    }
}
