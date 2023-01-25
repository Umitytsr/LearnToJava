package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        //HATIRLATMA!! btye->short->int->long->float->double yapılabilir

        int sayi=9;
        long toplam=6700;
        double oran=3.2;

        oran = sayi; // oran=9 kayıp yok
        System.out.println("oran = " + oran);


        toplam= sayi; // kayıp yok yine
        System.out.println("toplam = " + toplam);

        oran= toplam; //yine bir kayıp yok
        System.out.println("oran = " + oran);



    }
}
