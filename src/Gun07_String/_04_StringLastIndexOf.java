package Gun07_String;

public class _04_StringLastIndexOf {
    public static void main(String[] args) {
        //lastIndexOf = indexOf gibi çalışır ama aramaya sondan başlar

        //         0123456
        String s1="Merhaba";

        //karşılaştırması
        System.out.println("s1.indexOf(a) = " + s1.indexOf("a"));//4
        System.out.println("s1.lastIndexOf(\"a\") = " + s1.lastIndexOf("a"));//6

        //intex her zaman tek. Sadece arama yönü değişir.

    }
}
