package Gun24_Maps;

import java.util.*;

public class _05_Soru {
    public static void main(String[] args) {
        //Canlı sözlük yapılmak isteniyor.
        //Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- ekleme(bu seçenekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme(bu seçenekte kullanıcının kelimenin manasını düzelttiriniz
        // 3- Listeleme
        // 4- Arama(bu seçenekte verilen bir kelimeyle başlayan tüm kelimelerin manalarını)
        // 5- sileme
        // 6- çıkış

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        TreeMap<String, String> tm = new TreeMap<>();

        boolean a=false;
        do {
            System.out.println("1- ekleme" + "\t"
                    + "2- Düzeltme" + "\t"
                    + "3- Listeleme" + "\t"
                    + "4- Arama" + "\t"
                    + "5- sileme" + "\t"
                    + "6- Çıkış");
            System.out.print("Yapmak istediğiniz işlemin numarasını giriniz:");

            int secim = okuInt.nextInt();

            String kelime ;
            String anlami;
            String duzeltilenKelime;

            switch (secim) {
                case 1:
                    System.out.print("Girilecek kelime:");
                    kelime = okuStr.nextLine();
                    System.out.print("Anlamı:");
                    anlami = okuStr.nextLine();
                    tm.put(kelime, anlami);
                    break;
                case 2:
                    Scanner okuStr2=new Scanner(System.in);
                    System.out.print("Düzeltmek istediğiniz kelimeyi giriniz:");
                    duzeltilenKelime = okuStr2.nextLine();
                    System.out.print("Anlamını değiştiriniz:");
                    String duzeltilenAnlami = okuStr.nextLine();
                    tm.put(duzeltilenKelime, duzeltilenAnlami);

                    break;
                case 3:
                    for (Map.Entry<String, String> listeleme : tm.entrySet()) {
                        System.out.println(listeleme.getKey() + "=" + listeleme.getValue());
                    }
                    break;
                case 4:
                    Scanner okuStr3=new Scanner(System.in);
                    System.out.print("Anlamını bulmak istediğiniz kelime:");
                    String verilenKelime=okuStr3.nextLine();
                    System.out.println("Anlamı="+tm.get(verilenKelime));
                    break;
                case 5:
                    tm.clear();
                    System.out.println("Sözlük = " + tm);
                    break;
                case 6:
                    a=true;
                    break;

                default:
                    System.out.println("Yanlış tercih yaptınız.Tekrar giriniz!!");
            }

        }while (a==false);

    }
}
