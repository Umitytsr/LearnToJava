package Gun07_String;

public class _01_StringEquals {
    public static void main(String[] args) {
        // equals = iki stringin birbirine eşit olup olmadığını kontrol eder
        // sonuç booelan

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi);

        //veya
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        //veya
        System.out.println("s1.equals(\"Merhaba\") = " + s1.equals("Merhaba"));

        //NOT!! girilen şifre ile gerçek şifremizi kontrol etmek gibi işlemlerde kullanılır

    }
}
