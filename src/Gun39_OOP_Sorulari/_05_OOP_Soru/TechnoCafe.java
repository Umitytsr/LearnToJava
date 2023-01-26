package Gun39_OOP_Sorulari._05_OOP_Soru;

import Utility.MyFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> siparisler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int secim;
        do {
            menu();
            secim= oku.nextInt();
            switch (secim){
                case 1:
                    IFood ak=new AdanaKebab();
                    siparisler.add(ak);
                    break;

                case 2:
                    IFood lah=new Lahmacun();
                    siparisler.add(lah);
                    break;

                case 3:
                    IFood borsh=new Borsh();
                    siparisler.add(borsh);
                    break;

                case 4:
                    IFood palov=new Palov();
                    siparisler.add(palov);
                    break;

            }

        }while (secim <5 );

        System.out.println("Siparişiniz hazırlanıyor..");
        System.out.println();
        MyFunc.bekle(2);

        int toplam=0;
        for (IFood sp:siparisler){
            System.out.println(sp.getClass().getSimpleName());
            TechnoKitchen.hazirla(sp);
            toplam+=sp.ucret();
            MyFunc.bekle(2);
        }
        System.out.println("toplam = " + toplam);

    }


    public static void menu(){
        System.out.print("*** Menu ***" +
                "\n1-Adana Kebap (75 TL)" +
                "\n2-Lahmacun (20 TL)" +
                "\n3-Borsh (40 TL)" +
                "\n4-Palov (20 TL)" +
                "\n5-Tamam" +
                "\nSeçiminiz=");
    }
}
