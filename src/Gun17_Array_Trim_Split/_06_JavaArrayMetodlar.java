package Gun17_Array_Trim_Split;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {
        String[] isimler={"ahmet","zeynep","roman","cihan"};

        //diziyi string olarak direkt yazdırır
        //dizinin içine bakmak için en kolay yöntem. 
        //dizinin içinde ki tüm verileri gösterir.
        System.out.println("isimler = " + Arrays.toString(isimler));
        
        //diziyi sıralama
        //diziyi harflerine göre sıralar(a'dan z'ye)
        Arrays.sort(isimler);
        System.out.println("A'dan Z'ye sıralı dizi = " + Arrays.toString(isimler));

        //Diziler eşit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("diziler eşit mi: "+Arrays.equals(a,b));
        System.out.println("diziler eşit mi: "+Arrays.equals(a,c));

        //Sayıların sıralanması
        Arrays.sort(c);
        System.out.println("Küçükten büyüğe sıralama:" +Arrays.toString(c));

        //Dizi içinde şu index var mı diye bulmak için;
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));
            //b dizisinin için de 3 var ancak sıralı olmadığı için -(eksi) cevap verecek
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));
            //Not!!contains gibi çalışır, var ise pozitif, yok ise negatif değer döndürür.


    }
}
