package Gun10_If_MantiksalIfadeler;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifrenizi giriniz:");
        String password=oku.next();

        if (password.length()>=8 && !password.toLowerCase().contains("pass")
                && password.length()<=12){
            System.out.println("Kurallara uygun");
        }else {
            System.out.println("kurallara uygun değil");
        }
    }
}
