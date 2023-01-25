package Gun29.Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    public void paraYatirma(int yatirilanMiktar){
        yatan+=yatirilanMiktar;
        bakiye+=yatirilanMiktar;
    }

    public void paraCekme(int cekilenPara){
        cekilen-=cekilenPara;
        bakiye-=cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
