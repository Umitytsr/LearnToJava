package Gun21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        //bir öğretmen girmek istediği kadar notu alınız.
        //öğretmene devam etmek istiyor musun (e/h) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();

        int toplam=0;
        String cevap;

        do {
            System.out.print("Not giriniz:");
            int not= okuInt.nextInt();
            notlar.add(not);
            toplam+= not;

            System.out.print("Devam etmek istiyor musunuz?(e or h):");
            cevap= okuStr.next();

        }while (cevap.equalsIgnoreCase("e"));

        int ortalama=toplam/notlar.size();
        int gecenOgrSayisi=0;

        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>=ortalama){
                gecenOgrSayisi++;
            }
        }
        System.out.println("gecenOgrSayisi = " + gecenOgrSayisi);
    }
}
