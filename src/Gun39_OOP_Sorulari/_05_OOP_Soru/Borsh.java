package Gun39_OOP_Sorulari._05_OOP_Soru;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("Sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 40;
    }

    void boil(){
        System.out.println("Kısık ateşte pişirildi");
    }
    void eatTomorrow(){
        System.out.println("Bir gün sonra servis edilir");
    }
}
