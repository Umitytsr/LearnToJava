package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dersinizi ve notunuzu giriniz:");
        String dersVeNotu= oku.nextLine();

        String not=dersVeNotu.replaceAll("[^0-9]","");
        int donusturulenNot=Integer.parseInt(not);

        System.out.print("Harf Notunuz:");
        if (donusturulenNot>=90) {
            System.out.println("A");
        } else if (donusturulenNot>=80) {
            System.out.println("b");
        } else if (donusturulenNot>=70) {
            System.out.println("C");
        } else if (donusturulenNot>=60) {
            System.out.println("D");
        } else if (donusturulenNot>=40) {
            System.out.println("E");
        }else {
            System.out.println("F");
        }
    }
}
