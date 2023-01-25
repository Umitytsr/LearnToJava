package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //girilen bir stringin harflerini teker teker alt alta
        // olacak şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle yazınız:");
        String cumle= oku.nextLine();
        int uzunluk=cumle.length();

        for (int i=0;i<uzunluk;i++){
            if (cumle.charAt(i)==' ')
                continue;

            System.out.println(cumle.charAt(i));
        }
    }
}
