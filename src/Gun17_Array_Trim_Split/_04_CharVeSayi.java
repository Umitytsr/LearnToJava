package Gun17;

public class _04_CharVeSayi {
    public static void main(String[] args) {
        //A -> bilgisayar saklarken A
        //Harf ve rakam eşleştirme tablosuna ascii tablosu
        //0 - >
        //1 - >
        //
        //(char)65  -> A

        //65 -> A
        //66 -> B

        //97 -> a
        //98 -> b
        //....
        //...
        //255 ->

        for (int i = 0; i < 256; i++) {
            char harf=(char) i;
            System.out.println((i+1)+"harf = " + harf);
        }
    }
}
