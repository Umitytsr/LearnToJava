package Gun07_String;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty = bir stringin içinde bir şey var mı yok mu 
        //boolean olarak verir
        //kısaca dolu mu boş mu diye soruyo
        
        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); //boş olmadığı için false

        String s2=" "; // boşluk karakteri A gibi bir karakterdir
        System.out.println("s2.isEmpty() = " + s2.isEmpty());//false

        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());//boş olduğu için true


    }
}
