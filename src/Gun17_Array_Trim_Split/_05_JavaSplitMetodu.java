package Gun17_Array_Trim_Split;

import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split : bir String'i parçalara ayırmak demek

        //kullanıcıdan alacağınız cümleleri kelimelerine göre alt alta yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle:");
        String cumle= oku.nextLine();

        String[] kelimeler=cumle.split(" ");
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}
