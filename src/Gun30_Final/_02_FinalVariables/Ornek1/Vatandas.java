package Gun30_Final._02_FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo;
    //private erişimle ilgiliydi
    //değiştirilemezlik için FİNAL kullanılır

    static int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo=tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
