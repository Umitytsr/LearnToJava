package Gun38_Abstract._01_Abstract;

public class Ford extends BinekOto{

    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    int hizlanmaSuresi() {
        return 1000;
    }

}
