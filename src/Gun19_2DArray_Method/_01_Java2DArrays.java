package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo= {    {3,4,55}    ,      {234,22,33}     };//2 satır,3sütun

        System.out.println("satır uzunluğu= "+tablo.length); //2 //satır sayısı
        System.out.println("0.satırı sütun uzunluğu= "+tablo[0].length);//3,sütun uzunluğu
        System.out.println("1.satırı sütun uzunluğu= "+tablo[1].length);//3,sütun uzunluğu

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
