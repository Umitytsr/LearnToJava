package Gun14_Break_For_Continue;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1'den 5'e kadar olan sayıları ekrana yazdırınız

        //döngünün kaç kere döneceği belli olmayan durumlarda kullanacağız
        int i=1;
        while (i<=5){
            System.out.println("i = " + i);
            i++;
        }
        System.out.println(" ");
        //for döngüsü için başı, sonu ve artış mikarı belli ise yapılır
        for (i=1 ; i<=5 ; i++){
            System.out.println("i = " + i);
        }

        //NOT!! başı ve sonu belli olan işlemlerde for döngüsü daha kolay olur.

    }
}
