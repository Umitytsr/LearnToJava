package Gun38_Abstract._01_Abstract;

public class OtoMain {
    public static void main(String[] args) {
        Ford fr=new Ford("Mustang",1969,6);
        System.out.println(fr);
        System.out.println(fr.hizlanmaSuresi());

        // NOT!!
        // Interface ve Abstract classlardan nesne oluşturulamaz.
    }
}
