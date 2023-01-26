package Gun34_Inheritance_Protected._02_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("İsmet temur",OgrTip.LISE,"SAY");
        LiseOgrencisi lo2=new LiseOgrencisi("Ümit Yetişir",OgrTip.LISE,"SÖZ");
        IlkOgrencisi io=new IlkOgrencisi("Ayşe Bayrak",OgrTip.ILK,"Santranç");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);
    }
}
