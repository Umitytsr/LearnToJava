package Gun26._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person call1=new Person();
        call1.name="Hatice";
        call1.surName="Demir";
        call1.age=30;

        Person call2=new Person();
        call2.name="Muhammet";
        call2.surName="Gürdal";
        call2.age=35;

        //1.Yöntem
        System.out.println("call1.name = " + call1.name);
        System.out.println("call1.surName = " + call1.surName);
        System.out.println("call1.age = " + call1.age);

        System.out.println("call2.name = " + call2.name);
        System.out.println("call2.surName = " + call2.surName);
        System.out.println("call2.age = " + call2.age);

        System.out.println("***********************");

        //2.Yöntem normal metod
        BilgiYazdir(call1);
        BilgiYazdir(call2);

        System.out.println("***********************");

        //3.Yöntem -> metodu ait olduğu class'dan çağırıyoruz
        call1.bilgiYazdir();
        call2.bilgiYazdir();

        System.out.println("***********************");

        //4.Yöntem -> Person class'ında toString metodu oluşturduk
        System.out.println("call1 = " + call1);
        System.out.println("call2 = " + call2);
            //NOT!! Yazdırma işlemlerinde bu yöntemi kullan

        System.out.println("***********************");

        //ADIM 4

        call1.getBirthYear();
        call2.getBirthYear();



        //veya
        System.out.println(call1.getBirthYear2());
        System.out.println(call2.getBirthYear2());

        //ADIM 5

        call1.getInitials();
        call2.getInitials();

    }
    public static void BilgiYazdir(Person cal){
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surName = " + cal.surName);
        System.out.println("cal.age = " + cal.age);
    }
}
