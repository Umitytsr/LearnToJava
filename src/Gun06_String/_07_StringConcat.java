package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        // concat: bir string diğerine birleştiriyor

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("birleşik hali = " +s1+s2);

        //veya
        System.out.println("birleşik hali = " +s1.concat(s2));//birleşmiş ve boşluksuz hali
        System.out.println("birleşik hali = " +s1.concat(" ").concat(s2)); //birleşmiş ve boşluklu hali
        System.out.println("birleşik hali = " +s1.concat(" "+s2));//bir üst satırın farklı yazım tarzı



    }
}
