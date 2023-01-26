package Gun04_Donusumler;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        String isim= "Ümit";
        double kilo=72;
        int boy=178;
        double vucutKitleEndeksi=kilo/(boy*boy);

        System.out.println(isim+" "+kilo+" "+boy+" "+vucutKitleEndeksi);
    }
}
