package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        merhabaYazIsmet("ismet");

        cokMerhabaYaz(5);
    }


    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIsmet(String isim){

        System.out.println(isim+" merhaba");

    }

    public static void cokMerhabaYaz(int miktar){
        for (int i = 0; i < miktar; i++) {
            System.out.println("merhaba");
        }
    }
}
