package Gun04_Donusumler;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=98;
        byte ogrNot4=98;

        int toplam=ogrNot1; //byte -> atınca problem çıkmaz
                            //çünkü byte için hafızada ayrılan alan inte sığar
                            //çünkü veri kaybı ihtimali yok



        ogrNot1=(byte)toplam ; //int-> byte atınca dur bakalım dedi
                          //büyük hafızada ayrılmış bir alanı küçük hafızada ayrılmış alana atma işlemi var
                         //veri kaybı ihtimal, olduğu için olmaz

        //NOT!! Genişletme yapılabilir ama daraltma yapılamaz.
        //NOT2!! btye->short->int->long->float->double yapılabilir.

    }
}
