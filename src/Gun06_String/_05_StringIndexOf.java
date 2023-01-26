package Gun06_String;

public class _05_StringIndexOf {
    public static void main(String[] args) {

        String cumle="Merhaba Dünya";

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));//0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a"));//4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha"));//3
        System.out.println("cumle.indexOf() = " + cumle.indexOf(" "));//7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A"));//-1 yok demek
        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5));//a'yı 5(dahil)'den sonra aramaya başlıyor
    }
}
