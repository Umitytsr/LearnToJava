package Gun33_Inheritance._03_Inheritance;

public class SirketMain {
    public static void main(String[] args) {
        Calisan calisan1=new Calisan("Ahmet",10000,1.2);
        calisan1.maasHesapla();
        System.out.println("calisan1 = " + calisan1);

        GenelMudur genelMudur=new GenelMudur("Ali",12000,1.5,1000);
        genelMudur.maasHesapla();
        System.out.println("genelMudur = " + genelMudur);
    }
}
