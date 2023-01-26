package Gun07_String;

public class _07_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith = bununla başlıyor mu? diye soruyor
        //sonuç true veya false

        String text="HCL Teknoloji";

        System.out.println("text.startsWith(\"HC\") = " + text.startsWith("HC"));//true
        System.out.println("text.startsWith(\"te\") = " + text.startsWith("te"));//false
        System.out.println("text.startsWith(\"h\") = " + text.startsWith("h"));//Büyük küçük harfe duyarlu old. için false

    }
}
