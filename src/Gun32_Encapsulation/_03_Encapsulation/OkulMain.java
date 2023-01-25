package Gun32._03_Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu",3);
        do {
            System.out.print("Öğrenci Adı:");
            String ogr=scanStr.nextLine();

        }while (yeniOkul.getOgr().size()<yeniOkul.getKontenjan());
    }
}
