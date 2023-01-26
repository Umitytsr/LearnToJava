package Gun37_Interface._02_Soru;

import java.util.ArrayList;

public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void yazdir(ArrayList<Animal> animalList){
        for (Animal a:animalList){
            System.out.println(a.getClass().getSimpleName());
            System.out.println("Adı: "+a.getName());

            if (a instanceof Cat){

                System.out.println(((Cat)a).food());
                System.out.println("**********");

            } else if (a instanceof Duck) {

                System.out.println(((Duck)a).food());
                System.out.println("**********");

            } else if (a instanceof Shark) {

                System.out.println(((Shark)a).food());
                System.out.println("**********");

            } else if (a instanceof Swallow) {

                System.out.println(((Swallow)a).food());
                System.out.println("**********");

            }
        }
    }
}
