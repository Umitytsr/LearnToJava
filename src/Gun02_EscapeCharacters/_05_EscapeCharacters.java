package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        /* Escape Character ->
                \n = alt satıra geçirir
                \t = boşuk bıraktırır
                \b = back-space bir karakter geri siler
                \" = çift tırnak yazmak için kullanılır
                \\ = \ yazılacak ekrana
                \r = satırı başına geri ve satırı silip tekrar baştan yazıyomuş gibi yapar
        */
                                                //Çıktıları
        System.out.println("Merhaba\tDünya");   //Merhaba   Dünya
        System.out.println("Merhaba\bDünya");   //merhabDünya
        System.out.println("Merhaba\"Dünya");   // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya");   //Merhaba\Dünya
        System.out.println("Merhaba\rDünya");   //Dünya
    }
}
