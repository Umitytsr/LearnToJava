package Gun08_AritmeticOperators;

public class _04_Soru {
    public static void main(String[] args) {
        // 2022(dahil) yılına kadar geçen gün miktarınızı bulunuz
        // 0'dan 2022 yılına
        // 1 yılda 365 gün
        // 4 yılda 1 gün ekstra

        int gecenGunMiktari=2022*365+(2022/4);
        System.out.println("gecenGunMiktarı = " + gecenGunMiktari);

    }
}
