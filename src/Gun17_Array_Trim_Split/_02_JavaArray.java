package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz
        // Bugün hava çok güzel ->5

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz:");
        String cumle= oku.nextLine();
        int kelimeSayisi=1;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' '){
                kelimeSayisi++;
            }
        }
        System.out.println("kelimeSayisi = " + kelimeSayisi);
    }
}
