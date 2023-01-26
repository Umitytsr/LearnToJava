package Gun38_Abstract._003_Abstract;

public class YemekDunyasiMain {
    public static void main(String[] args) {
        Baklava bak=new Baklava();
        bak.setName("Baklava");
        System.out.println(bak);
        System.out.println("*************");

        CheeseCake kek=new CheeseCake();
        kek.setName("Cheese Cake");
        System.out.println(kek);
        System.out.println("*************");

        GreekSlad salad=new GreekSlad();
        salad.setName("Greek Salad");
        System.out.println(salad);
        System.out.println("*************");

        SezarSalad salata=new SezarSalad();
        salata.setName("Sezar Salad");
        System.out.println(salata);
    }
}
