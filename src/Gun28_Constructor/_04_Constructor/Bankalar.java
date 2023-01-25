package Gun28._04_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.

        Bank bank1=new Bank();
        bank1.name="Akbank";
        bank1.subeSayisi=2000;
        bank1.kurulusYili=1960;

        Bank bank2=new Bank("Ziraat",10000,1920);

        Bank bank3=new Bank("Halk",4500);

        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);
    }
}
