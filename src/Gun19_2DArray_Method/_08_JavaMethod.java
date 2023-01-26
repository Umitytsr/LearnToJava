package Gun19_2DArray_Method;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {
        //main'de 20 elemanlı bir diziyi tanımlayınız,daha sonra bir fonksiyona
        //göndererek random 100e kadar olan sayılarla doldurunuz ve aynı
        //fonksiyonda yazdırınız.

        int[] dizi=new int[20];

        yirmiElemanliDizi(dizi);
    }

    public static void yirmiElemanliDizi(int[] sayilar){
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int) (Math.random()*100);

        }
        System.out.println(Arrays.toString(sayilar));
    }
}
