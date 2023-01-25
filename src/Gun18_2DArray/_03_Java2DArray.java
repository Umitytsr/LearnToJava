package Gun18;

public class _03_Java2DArray {
    public static void main(String[] args) {
        //2'ye 3^lük bir tabloyu 100e kadar random sayılarla doldurunuz
        //bütün doldurma işlemi bittikten sonra
        //yazdırınız ve kaç tan tek sayı olduğunu bulunuz.

        int[][] dizi=new int[2][3];
        int toplam=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j]=(int)(Math.random()*100);
                System.out.print(dizi[i][j]+" ");
                if (dizi[i][j]%2 != 0){
                    toplam++;
                }
            }
            System.out.println();
        }
        System.out.println("toplam tek sayı= "+toplam);
    }
}
