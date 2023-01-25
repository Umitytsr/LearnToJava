package Gun28._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        //Book class yazınız. fields: name,publishYear, author
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Book kitap1=new Book("Tutunamayanlar",1980,"Oğuz Atay");

        Book kitap2=new Book("Harry Potter",1995);

        Book kitap3=new Book();
        kitap3.name="Yüzükler";
        kitap3.publishYear=2022;
        kitap3.author="Üzümler";

        System.out.println("kitap = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);


    }
}
