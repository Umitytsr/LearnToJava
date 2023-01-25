package Gun16_Array;

public class _03_JavaArray {
    public static void main(String[] args) {
        int[] dizi=new int[5]; //0,1,2,3,4 indexli 5 elemanlı dizi
        int[] dizi2={5,8,24,69,12}; //5 elemanlı bir dizi, hem tanımladım hem de
                                    //ilk değerlerini atadım

        String[] kelimeler=new String[5]; //5 tane kelime/cümle saklayabilen bir dizi
        boolean[] dizi3=new boolean[5]; //5 tane boolean(true/false) saklayabilen bir dizi
        double[] oranlar=new double[5]; //5 tane double saklayabilen bir dizi

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi[i] = " + dizi[i]);
        }

        for (int i = 0; i < kelimeler.length ; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

        for (int i = 0; i < oranlar.length ; i++) {
            System.out.println("oranlar = " + oranlar[i]);
        }

        for (int i = 0; i < dizi3.length ; i++) {
            System.out.println("dizi3 = " + dizi3[i]);
        }
    }
}
