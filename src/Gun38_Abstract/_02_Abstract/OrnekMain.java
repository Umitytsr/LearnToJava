package Gun38_Abstract._02_Abstract;

public class OrnekMain {
    public static void main(String[] args) {
        Dikdortgen dik=new Dikdortgen(5,15);
        dik.setName("Dikdörtgen");
        dik.Ciz();
        System.out.println(dik);

        System.out.println("**************");

        Daire daire=new Daire(5);
        daire.setName("Daire");
        daire.Ciz();
        System.out.println(daire);
    }
}
