package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Java2DArray {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        int[][] tablo = new int[2][3];
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Sayı giriniz= ");
                tablo[i][j]=oku.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }

        int enb=tablo[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (enb<tablo[i][j]){
                    enb=tablo[i][j];
                }
            }
        }
        System.out.println("enb = " + enb);
    }
}
