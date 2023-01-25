package Gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {
        // EndsWith = verilen karakteler bununla bitiyor mu? diye soruyor
        // sonuç true veya false yani boolean ile döner

        String text="Merhaba Dünya";
        System.out.println("text.endsWith(ya) = " + text.endsWith("ya"));//true
        System.out.println("text.endsWith(n) = " + text.endsWith("n"));//false
        System.out.println("text.endsWith(A) = " + text.endsWith("A"));//false
        System.out.println("text.endsWith(Dünya) = " + text.endsWith("Dünya"));//true

        int a=1234564655;
        String b=Integer.toString(a);
        System.out.println("a = " + b.endsWith("55"));
    }
}
