package Gun39_OOP_Sorulari._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);

        B b=new B();// constructor çalıştı.
        System.out.println("A.mesaj = " + A.mesaj);

        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj);

        // Burada A clasında ki mesaj String'i static olduğu için ve staticler
        // sadece bir tane olabildiği için ; 8. satırda B sınıfını çağırdık ve
        // orada mesaj'ı bir defa değiştirdik. O yüzden 11. satırda bile B class'ında ki
        // mesajı aldı.

    }
}
