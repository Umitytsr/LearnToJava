package Gun04_Donusumler;

public class _08_Ornek3 {
    public static void main(String[] args) {
        //String olarak verilen 2 adet bağış parasının toplamını yazdırınız

        String bagis1="1000";
        String bagis2="20153";

        int deger1=Integer.parseInt(bagis1);
        int deger2=Integer.parseInt(bagis2);

        int toplam=deger1+deger2;

        System.out.println("toplam = " + toplam);

        String strToplam=Integer.toString(toplam);

        System.out.println("strToplam = " + strToplam);

    }
}
