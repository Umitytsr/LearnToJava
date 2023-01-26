package Gun15_Nested;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        //Aşağıda ki görüntüyü veren programı yazınız(yalnızca 1 yıldız ile)
        //*****
        //****
        //***
        //**
        //*

        for (int i=1;i<=5;i++){
            for (int j=6;i<j;j--){
                System.out.print("*");
            }
            System.out.println();
        }


        //veya(hocanın çözümü)
        for (int satir=5;satir>0;satir--){
            for (int l=0;l>satir;l++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
