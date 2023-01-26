package Gun35_Final_Polymorphism._02_Polymorphism;

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
        System.out.println("**************");

        // Referans tipi / nesne tipi
        Hayvan hayvan1=new Hayvan("ördek"); // hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("Kangal"); // hayvanlardan 1 köpek
        Hayvan hayvan3=new Kedi("boncuk");  // hayvanlardan 1 kedi

        System.out.println("--------------");

        hayvan1.ses(); // genel hayvan , ses çıkardı
        hayvan2.ses(); // köpek hayvan , havladı
        hayvan3.ses(); // kedi hayvan , miyavladı

        System.out.println("--------------");

        // hayvan2.kokladi(); // referans sebebilye hayvan kılasında ki kokladı kullanılmaz.
                              // Yani metodları kısıtlı

        ((Kopek)hayvan2).kokladi(); // dönüşüm yaptığımız için artık kokladı fonksiyonu
                                    // kullanılabilir
                                    // ((int)(Math.random()) ile aynı dönüşüm.

        ((Kedi)hayvan3).tirmaladi();

        // Polymorphism -
        // çok formluluk  - Çok çeşitlilik
        // şizofren bir konu
        // Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        // ve bu şekilde kullanılabilmesine Polymorphism denir.


    }

    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }

    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();

        if (hayvan instanceof Kopek){ // Hayvan aslında Köpek mi
            ((Kopek)hayvan).kokladi();
        }
        else if (hayvan instanceof Kedi) { // Hayvan aslında Kedi mi
            ((Kedi)hayvan).tirmaladi();
        }

    }
}

//  Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız.
