package Gun31_Enum._04_GununSorusu;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        // Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.

        int secilen;
        ArrayList<Pizza> siparisler=new ArrayList<>();
        do {
            Scanner scanInt=new Scanner(System.in);
            menu();
            secilen= scanInt.nextInt();
            System.out.println();

            switch (secilen){
                case 1:
                    Pizza sp=new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2:
                    Pizza mp=new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3:
                    Pizza lp=new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4:
                    siparisYazdir(siparisler);
                    break;
            }
        }while (secilen<=4);
    }

    public static void menu(){
        System.out.println("1-Small"
                +"\n"+"2-Medium"+
                "\n"+"3-Large"
                +"\n"+"4-Goster"
                +"\n"+"5-Çıkış");
        System.out.print("Seçmek istediğiniz pizza numarasını giriniz:");
    }

    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0, m=0, l=0;
        for (Pizza p: siparisler) {
            if (p.size==PizzaSize.SMALL){
                s++;
            } else if (p.size==PizzaSize.MEDIUM) {
                m++;
            }else{
                l++;
            }
        }
        System.out.println("small = " + s);
        System.out.println("medium = " + m);
        System.out.println("large = " + l);
        System.out.println();
    }
}
