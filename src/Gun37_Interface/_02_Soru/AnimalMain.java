package Gun37_Interface._02_Soru;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animalList=new ArrayList<>();

        Cat cat=new Cat("Boncuk");
        animalList.add(cat);

        Duck duck=new Duck("kar");
        animalList.add(duck);

        Shark shark=new Shark("Büyük Beyaz");
        animalList.add(shark);

        Swallow swallow=new Swallow("Maviş");
        animalList.add(swallow);

        Animal.yazdir(animalList);
    }
}
