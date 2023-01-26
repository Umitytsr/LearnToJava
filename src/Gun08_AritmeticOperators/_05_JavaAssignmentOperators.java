package Gun08_AritmeticOperators;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {

        int a=10;
        // a=a+5;  // a 15 olur
        a+=5;      //yine aynı 15 olur
                   //a'nın artış miktarı 5'tir
        System.out.println("a = " + a);

        int b=10;

        //b=b-5; // b 5 olur
        b-=5;    // yine 5 olur
                 // b'nin azalış miktarı 5'tir.

        System.out.println("b = " + b);

        int c=10;
        //c=c/5; //c 2 olur
        c/=5;    //c'nin bölün ndeğeri 5
        System.out.println("c  " + c);

        int d=10;
        //d=d*5; // d 2 olur
        d*=5;    // d'nin çarpan değeri 5
        System.out.println("d = " + d);


    }
}
