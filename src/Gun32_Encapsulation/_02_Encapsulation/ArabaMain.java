package Gun32_Encapsulation._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        // Bir araba nesnesi oluşturulmak isteniyor.
        // fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun
        // olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol
        // ediniz.

        Araba car1=new Araba();
        car1.setRenk("beyaz");
        car1.setModel(1902);
        car1.setMotorHacmi(100.20);
        car1.setKapiSayisi(5);

        System.out.println("car1 = " + car1);

        //* -> Araba class'ına bak
        Araba car2=new Araba("mavi",2008,2444,5);
        System.out.println("car2 = " + car2);

        // GET'i sonradan kullanmak için Araba
        // class'ında açtık. Örneğin;
        int arabaModeli=car1.getModel();
        System.out.println("arabaModeli = " + arabaModeli);




        // KURAL : Genel yazılım kuralıdır.
        //         Bütün değişkenler private yapılır.
        //         Yani kapsulleme ile kullanılır.
        //         Eğer gerekiyorsa private kaldırılır.
    }
}
