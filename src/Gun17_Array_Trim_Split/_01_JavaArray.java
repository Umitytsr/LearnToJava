package Gun17_Array_Trim_Split;

public class _01_JavaArray {
    public static void main(String[] args) {
        //50 elemanlı bir dizi tanımlayınız. 10'a kadar olan sayılardan
        //random atayarak doldurunuz. sonrasında ayrı bir döngü ile
        // tek olanlara 1, çift olanlara 0 atayınız.yazdırınız.

        int[] dizi=new int[50];
        for (int i = 0; i < dizi.length ; i++) {
            int randomSayi=(int) (Math.random()*10);
            System.out.println("Random sayı: "+randomSayi);
            dizi[i]=randomSayi;

        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                dizi[i]=0;
                System.out.println((i+1)+".dizi = " + dizi[i]);
            }else {
                dizi[i]=1;
                System.out.println((i+1)+".dizi = " + dizi[i]);
            }
        }
    }
}
