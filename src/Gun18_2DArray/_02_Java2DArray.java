package Gun18_2DArray;

public class _02_Java2DArray {
    public static void main(String[] args) {
        int[] dizi=new int[10]; // boş default 0 olan
        int[] dizi2={2,3,4,5,6,7,45,67,77};

        int[][] tablo=new int[2][3];//içi boş, 2x3 kadar yani 6 tane verilik yer
        int[][] tablo2={    {2,3,4}     ,    {34,45,5}   };
                            //0.satır       //1.satır

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo2[satir][sutun]+" ");
            }
            System.out.println();
        }
    }
}
