package Gun36_Interface._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz();
        System.out.println("************");

        Dikdortgen d=new Dikdortgen();
        d.ciz();
        System.out.println("************");

        // interface'lerden nesne üretme fakat referans tipi
        // oluşturulabilir. bu bize Polymorhism sağladı.
        ICizdir c2=new Cember();
        c2.ciz();
        System.out.println("************");
        // direkt olarak sadece Interface'deki
        // ismi verilmiş olanlar metodlara erişebilir

        cizdirme(c);
        cizdirme(d);

    }

    public static void cizdirme(ICizdir iciz){
        iciz.ciz();
    }
}
