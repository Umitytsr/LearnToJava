package Gun30;

public class GununSorusu {

    int a;
    static int b=0; //sen bitanesin. Zaten static olunca 2 tane olamaz.

    void artir(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;
        
        
        // a'nın değeri kaç oldu? -> Burada verilecek cevao hangi a'yı soruyosunuz olmalı.
        // Burada her nesnenin a'sı var ve gs1'in 5, gs2'nin 7 değeri var

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);

        // Soru: b'nin değeri kaçtır? -> tek bir değeri vardır.
        System.out.println("GununSorusu.b = " + GununSorusu.b);

        System.out.println();
        System.out.println("**************");
        System.out.println();

        //Soru : a ve b'nin en son değeri kaçtır?
        gs1.artir(); // gs1.a'nın en son değeri ->6 , b=1 
        gs2.artir(); // gs2.a'nin en son değeri ->8 , b=2

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);
    }
}
