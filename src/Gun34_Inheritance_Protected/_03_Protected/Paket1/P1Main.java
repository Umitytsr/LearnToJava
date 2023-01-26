package Gun34_Inheritance_Protected._03_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="karakedi"; // public erişildi
        p1h.yas=2;         // defauld erişildi
        p1h.cinsi="Tekir"; // protected erişildi
        // p1h.renk ->        private erişilmedi.
    }
}
