package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 6 elemanlı dizinin
        //sadece tek sayı olan elemanlarını ayrı diziye(ArrayList)
        //atayarak yazdırınız.

        int[] dizi=new int[6];
        Scanner oku=new Scanner(System.in);
        ArrayList<Integer> tekSayilar=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".sayıyı giriniz:");
            dizi[i]= oku.nextInt();
            if (dizi[i]%2!=0){
                tekSayilar.add(dizi[i]);
            }
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        System.out.println("tekSayilar = " + tekSayilar);
    }
}
