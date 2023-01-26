package Gun07_String;

public class _05_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bölümünü alma işlemi hapar
        // NOT!!çok kullanılan bir komuttur

        //         012345678901234567 
        String s1="Merhaba arkadaşlar";

        String parca1=s1.substring(3,9);
        //3 nolu stringten başlar 9 nolu stringe kadar alır
        //3 dahil, 9 dahil değil
        System.out.println("parca1 = " + parca1);
        
        String parca2=s1.substring(8,15);
        System.out.println("parca2 = " + parca2);
    
        String parca3=s1.substring(8); //verilen stringden başlayıp son stringe kadar alır.
        System.out.println("parca3 = " + parca3);



    }
}
