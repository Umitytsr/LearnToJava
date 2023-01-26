package Gun27_Static._02_Ornek;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        double kareKok=MyMath.gerKarekok(10);
        int random=MyMath.getRandom(10);
        int max=MyMath.getMax(4,5);
        int min=MyMath.getMin(8,15);
        int usAlma=MyMath.getUsAl(2,5);

        System.out.println("kareKok = " + kareKok);
        System.out.println("random = " + random);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("usAlma = " + usAlma);
    }
}
