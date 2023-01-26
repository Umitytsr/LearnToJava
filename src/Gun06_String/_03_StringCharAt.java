package Gun06_String;

public class _03_StringCharAt {
    public static void main(String[] args) {
        //İstenilen noktada ki karakteri verir
        // karakterlerin sırası 0(sıfır)'dan başlar ve buna index denir

        String cumle="Merhaba dünya";
        //M->0,e->1,r->2,....,a->12
        //length 13 ama karakter odası 12

        char ilkHarf=cumle.charAt(0); //sıfırıncı indexteki karakteri ver
        System.out.println("ilkHarf = " + ilkHarf);

    }
}
