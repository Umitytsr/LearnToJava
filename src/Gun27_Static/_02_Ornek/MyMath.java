package Gun27._02_Ornek;

public class MyMath {
    public static int getMin(int a, int b){
        return Math.min(a,b);
    }

    public static int getMax(int a, int b){
        return Math.max(a,b);
    }

    public static int getRandom(int sayi){

        return (int)(Math.random()*sayi);
    }

    public static int getUsAl(int a,int b){
        return (int)Math.pow(a,b);
    }

    public static double gerKarekok(int a){
        return Math.sqrt(a);
    }

}
