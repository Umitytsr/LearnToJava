package Gun11_Ternary_Random;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math.random() : double sayı üretir. 0 - 0.99999999 arası üretir

        double randSayi=Math.random();
        System.out.println("randSayi = " + randSayi);

        //0-6 arası üretsin
        //6 ile çarparım
        //0-5,9999999... arası sonuç çıkar
        //int çevirirsem 0-5 arası çıkar

        int rndTamSayi=(int) (Math.random()*6);
        System.out.println("rndTamSayi = " + rndTamSayi);
    }
}
