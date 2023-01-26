package Gun37_Interface._01_Soru;

import java.util.ArrayList;

public class VehicleMain {
    public static void main(String[] args) {
        ArrayList<Vehicle> carList=new ArrayList<>();

        TeslaCar tesla=new TeslaCar("Model 5",310);
        carList.add(tesla);

        ToyotaPrius toyota=new ToyotaPrius("Sedan",1200);
        carList.add(toyota);

        Bus bus=new Bus("IVECO",7000);
        carList.add(bus);

        Vehicle.yazdir(carList);

    }
}
