package Gun20_Method;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayıdan büyük olanı bulma işlemini
        //bir method içinde yaptıktan sonra main de yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayı= ");
        int a= oku.nextInt();
        System.out.print("2.sayı= ");
        int b= oku.nextInt();

        int enb=enbBul(a,b);
        System.out.println("enb= "+enb);
    }

    public static int enbBul(int a,int b){
        //1.yol
//        int donecek;
//        if (a>b){
//            donecek=a;
//        }else{
//            donecek=b;
//        }//
//        return donecek;

        //2. yol
//        return a > b ? a : b;

        //3.yöntem
        if (a>b){
            return a;
        }else {
            return b;
        }

    }
}
