package Gun25_OOP;

//class - tiplerin tanımlandığı yer

public class _01_JavaClassAndObject {

    //metodların yazıldığı yer
    public static void main(String[] args) {
        //ana programın başladığı yer
        int sayi=5;

        Araba benimArabam=new Araba();//Araba tür, tip adı, benimArabam nesne
        benimArabam.marka="ferrari";
        benimArabam.renk="kırmızı";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2022;

        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);

    }   //dur

    //metodların yazıldığı yer

}

//class - tiplerin tanımlandığı yer

class Araba{
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}