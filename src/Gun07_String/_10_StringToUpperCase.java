package Gun07_String;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        // toUpperCase = büyük harfe çevirir.

        String text="Merhaba dünya";

        System.out.println("orijinal hali = " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        System.out.println("me veya ME ile başlıyor mu? = " + text.toUpperCase().startsWith("ME"));

    }
}
