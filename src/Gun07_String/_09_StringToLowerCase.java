package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase = stringi küçük harfe çevirir
        // tüm büyük harfleri küçüğe çevirir.

        String text="Merhaba DÜNYA";
        System.out.println("orijinal hali = " + text);
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        System.out.println("me veya ME ile başlıyor mu = " + text.toLowerCase().startsWith("me"));
    }
}
