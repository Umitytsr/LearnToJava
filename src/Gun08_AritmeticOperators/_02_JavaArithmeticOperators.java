package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1; //sayacın değerini 1 tane arttırır : 1
        sayac++; //sayacın değeriniz 1 tane arttırır : 2
        ++sayac; //sayacın değerini 1 tane arttırır : 3

        sayac=sayac-1; //sayacın değerini 1 tane azaltır : 2
        sayac--;       //sayacın değerini 1 tane azaltır : 1
        --sayac;       //sayacın değerini 1 tane azaltır : 0

        System.out.println("sayac = " + sayac); //0

        /***************************************/
        int toplam=5+sayac; //5
        System.out.println("toplam = " + toplam);//5
        System.out.println("sayac = " + sayac);//0

        toplam = 5 + sayac++; // toplam = 5+sayaç ve sayac=sayac+1
        //sonuç 5, sayaç=1 oldu. !!işlemi yaparken sayaç=0'dı
        System.out.println("toplam = " + toplam);//5
        System.out.println("sayac = " + sayac);//1

        toplam = 5 + ++sayac; // sayac=sayac+1 oldu sonra toplama işlemi yapıldı
        //sonuç 7, sayaç=2
        System.out.println("toplam = " + toplam);//7
        System.out.println("sayac = " + sayac);//2

        /*KISACA!! -> ++'lar sağda ise önce işlem sonra sayacın artışı
                   -> ++'lar solda ise önce sayacın artışı sonra işlem yapılır. */



    }
}
