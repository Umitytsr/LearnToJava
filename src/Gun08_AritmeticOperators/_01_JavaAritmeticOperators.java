package Gun08_AritmeticOperators;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
        
        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b = " + (a+b));//14

        System.out.println("Çıkarma işlemi");
        System.out.println("a-b = " + (a-b));//4

        System.out.println("Çarpma işlemi");
        System.out.println("a*b = " + (a*b));//45

        System.out.println("Bölme işlemi");
        System.out.println("a/b = " + (a/b));//1
        //normal sonuç 1.8 fakat tam sayının tam sayıya bölümünde küsürat atılır
        //bu sebeple sonuç 1 olur, yuvarlama yapmaz. çünkü int/int

        //tam sonuç istersen bir tanesini double'a çevirmen yeterli
        System.out.println("a/b sonucu(küsüratlı) = " + ((double)a/b));//1.8

        System.out.println("Modül işlemi işlemi");
        System.out.println("a%b = " + (a%b));
        System.out.println("b%a = " + (b%a));
        //NOT!! Modüller(%) de sol büyük ise kalanı, sol küçük ile solundakini al
    }
}
