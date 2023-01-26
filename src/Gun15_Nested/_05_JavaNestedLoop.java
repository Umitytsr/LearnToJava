package Gun15_Nested;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        //Aşağıda ki görüntüyü veren programı yazınız(yalnızca 1 yıldız ile)
        //*
        //**
        //***
        //****
        //*****
        //****
        //***
        //**
        //*


        for(int i=1;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k=5;k>0;k--){
            for (int l=0;l<k;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
