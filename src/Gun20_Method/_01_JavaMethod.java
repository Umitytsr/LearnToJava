package Gun20_Method;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); //giden yok,dönen yok
        toplamYaz(4,5); //giden var, dönen yok
        int enb=Math.max(4,5); //giden var, dönen var

        //Özetle!! Fonksiyonu bir şeye eşitleyebiliyosak döneni var,
        //         eşitleyemiyosan döneni yoktur.

        double sayi=Math.random(); //gideni yok, döneni var

        enbYaz(4,5);
        enb=enbBul(4,5);
        System.out.println("enb = " + enb);

        //fonksiyonda return old. için main de yazdırabiliyoruz,
        //yani fonksiyonun sonucunu alabiliyoruz.
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }

    public static void toplamYaz(int a,int b){
        System.out.println(a+b);
    }

    public static void enbYaz(int a,int b){
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static int enbBul(int a,int b){
        int donecek;
        if (a>b){
            donecek=a;
        }else {
            donecek=b;
        }
        return donecek;
    }
}
