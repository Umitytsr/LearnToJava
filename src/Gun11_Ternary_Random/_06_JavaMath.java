package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a'nın mutlak değeri=" + Math.abs(a) ); //12
        System.out.println("a ve b'den büyük olanı=" + Math.max(a,b));//4
        System.out.println("a ve b'den küçük olanı=" + Math.min(a,b));//-12
        System.out.println("2'nin 3. kuvveti=" + Math.pow(2,3));//3. kuvvetini aldık, cevap 8
        System.out.println("b'nin karekökü=" + Math.sqrt(b));//2
        System.out.println("round 3.1=" + Math.round(3.1));//round yuvarlama işlemi yapıyo, cevap 3
        System.out.println("round 5.5=" + Math.round(5.5));//6
        System.out.println("ceil 3.1=" + Math.ceil(3.1));//en yakın büyük tam sayıyı verir, cevap 4
        System.out.println("floor 4.7=" + Math.floor(4.7));//en yakın küçük tam sayıyı verir, cevap 4


        int enb=Gun20._01_JavaMethod.enbBul(a,b);
        System.out.println(enb);
    }
}
