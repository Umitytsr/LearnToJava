package Gun35_FINAL._02_Ornek;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("Karabaş");
        kopek1.ses();     // havladı yazar
        kopek1.kokladi(); // kokladı yazar
        System.out.println("**************");

        Kedi kedi1=new Kedi("Köpük");
        kedi1.ses();       // Miyavladı
        kedi1.tirmaladi(); // tırmaladı
        System.out.println("**************");

        kopekSesi(kopek1); // havladı
        kediSesi(kedi1);   // miyavladı
        System.out.println("**************");

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);
    }

    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }

    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();
    }
}
