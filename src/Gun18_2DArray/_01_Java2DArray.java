package Gun18;

import java.util.Scanner;

public class _01_Java2DArray {
    public static void main(String[] args) {
        int[][] tumDersNotlari= new int[3][50];//3 tane ders, 50 tane öğrenci
                                               // 3 satır, 50 sütun
                                               //her satır da 50 tane sayı yani 50 sütun
                                               //0. satır, 1. satır, 2.satır
                                               //sütun:0,1,2,...,49
        tumDersNotlari[0][0]=80;//2 boyutlu dizide 0. satırın 0. sütununa 80 değeri atandı

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]= oku.nextInt();
    }
}
