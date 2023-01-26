package Gun28_Constructor._04_Constructor;

public class Bank {
    String name;
    int subeSayisi;
    int kurulusYili;

    public Bank() {
    }

    public Bank(String name, int subeSayisi, int kurulusYili) {
        this.name = name;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Bank(String name, int subeSayisi) {
        this.name = name;
        this.subeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili;
    }
}
