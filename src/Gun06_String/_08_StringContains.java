package Gun06_String;

public class _08_StringContains {
    public static void main(String[] args) {
        // contains : bir stringin içerisinde karakterlerin var olup
        // olmadığını boolean cinsinden söyle true veya false

        String cumle="Merhaba Dünya";

        boolean varMi=cumle.contains("a");
        System.out.println("varMi = " + varMi);

        //veya
        System.out.println("cümle = " + cumle.contains("a"));

        System.out.println("cumle = " + cumle.contains("ya"));
        System.out.println("cumle = " + cumle.contains("rha"));
    }
}
