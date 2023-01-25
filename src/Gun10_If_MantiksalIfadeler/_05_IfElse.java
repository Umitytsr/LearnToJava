package Gun10_If_MantiksalIfadeler;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle:");
        String cumle= oku.nextLine();

        if (cumle.contains("study") && cumle.length()>10 ) {
            System.out.println("Evet");
        }else {
            System.out.println("Hayır");
        }
    }
}
