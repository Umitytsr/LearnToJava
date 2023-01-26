package Gun07_String;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        // replaceFirst = bir string içindeki karakterleri verilenlerle değiştirir
        // ilk bulduğu yeri değiştiriyor
        
        String text="Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e"));//Merhebe Dünya
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba","de"));//Merhade Dünya
        System.out.println("text.replaceFirst(Dünya,Java) = " + text.replaceFirst("Dünya","Java"));//Merhaba Java
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a",""));//Merhba Dünya, ilk a silindi

    }
}
