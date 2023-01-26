package Gun37_Interface._01_Soru;

import java.util.ArrayList;

public class Vehicle {
    private String model;
    private double engine;

    public Vehicle(String model, double engine) {
        setModel(model);
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public static void yazdir(ArrayList<Vehicle> carList){
        for (Vehicle c:carList) {
            System.out.println(c.getClass().getSimpleName());//class'ın ismini verir.


            System.out.println("Model: "+c.getModel()+"\n"
                    +"Engine: "+c.getEngine());
            if (c instanceof TeslaCar){
                System.out.println(((TeslaCar)c).changeBatery());
                System.out.println(((TeslaCar)c).drive());
                System.out.println("*********");
            } else if (c instanceof ToyotaPrius) {
                System.out.println(((ToyotaPrius)c).changeBatery());
                System.out.println(((ToyotaPrius)c).drive());
                System.out.println(((ToyotaPrius)c).changeOil());
                System.out.println("*********");
            } else if (c instanceof Bus) {
                System.out.println(((Bus)c).changeDeisel());
                System.out.println(((Bus)c).drive());
                System.out.println("*********");
            }
        }
    }
}
