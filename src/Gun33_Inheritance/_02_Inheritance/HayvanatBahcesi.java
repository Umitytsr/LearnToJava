package Gun33._02_Ornek;

public class HayvanatBahcesi {
    // Bir hayvanat bahçesi için bir program yazılmak isteniyor.
    // Kediler için (renk,kilo,cinsi)
    // kopekler için (renk,kilo, cinsi)
    // yılanlar için renk, kilo, cinsi, uzunluk)
    // ordek için (renk, kilo, cinsi, kanatAcikligi)
    // bütün hayvanların konustu metodu vardır.

    public static void main(String[] args) {
        Kopek kopek1=new Kopek("Siyah",45,"Pitbul");
        kopek1.konustu();

        Kedi kedi1=new Kedi("Beyaz",4,"British");
        kedi1.konustu();

        Ordek ordek1=new Ordek("beyaz",5,"gövel",90);
        ordek1.konustu();

        Yilan yilan1=new Yilan("siyah",2,"engerek",300);
        yilan1.konustu();
    }
}
