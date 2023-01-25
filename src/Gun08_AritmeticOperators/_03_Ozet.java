package Gun08;

public class _03_Ozet {
    public static void main(String[] args) {
        int sayac=0;
        int toplam=0;

        /*
        sayac=sayac+1; // 1
        toplam=toplam+sayac; // 0+1
        */

        toplam = toplam + ++sayac; // önce sayacı 1 arttırdı,sonra işlemi yaptı. üsttekiyle aynı işlem

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        int sayac2=0;
        int toplam2=0;

        /*
        toplam2=toplam2+sayac2;
        sayac2=sayac2+1;
        */

        toplam2=toplam2+ sayac2++; // önce işlem, sonra sayac 1 arttırılır

        System.out.println("toplam2 = " + toplam2);
        System.out.println("sayac2 = " + sayac2);



    }
}
