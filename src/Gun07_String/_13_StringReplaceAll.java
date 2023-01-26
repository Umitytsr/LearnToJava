package Gun07_String;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll = replace gibi çalışır.farkı kriter(regex) verilebiliyor
        // regex
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak

        String text="Merhaba Dünya123";

        System.out.println("text = " + text);
        System.out.println("text.replaceAll([abn],_) = " + text.replaceAll("[abn]","_"));
        //a veya b veya n'leri _ yap -> Merh___ Dü_y_123

        System.out.println("text.replaceAll([A-Z],_) = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye büyük harfleri _ yap -> _erhaba _ünya123

        System.out.println("text.replaceAll([0-9],*) = " + text.replaceAll("[0-9]","*"));
        // 0 ile 9 arasında ki rakamları * yapar ->Merhaba Dünya***

        System.out.println("text.replaceAll([0-9],*) = " + text.replaceAll("[^0-9]","*"));
        // rakamlar hariç her şeyi * yapar -> ****** *****123
    }
}
