package Gun29_Erisimler._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan call1=new Calisan();
        call1.id=1;
        call1.name="Ümit";
        call1.surname="Yetişir";
        //call1.password="1234";
        // private kendi paketinden bile çağırılamaz.

        call1.sifreAtama("1234");
        call1.sifreAtama("Umit123456789");

        call1.sifreGoster();
    }
}
