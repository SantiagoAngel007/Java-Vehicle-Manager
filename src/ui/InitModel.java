package ui; 

import model.*;

import java.util.ArrayList;

public class InitModel {
    
    public InitModel() { }

	public ArrayList<Vehicle> createVehicles(){
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(new GasolineCar(300000, 4500, "Chevrolet Onix", 250, 12000, false, "7810 PRZ", 2, true, AType.VAN, 100, GType.EXTRA));
		vehicles.add(new GasolineCar(200000, 1234, "Suzuki Swift", 800, 3000, true, "7895 WFS", 4, true, AType.VAN, 200, GType.REGULAR));
        vehicles.add(new GasolineCar(450000, 4455, "Kia Picanto", 120, 50000, false, "3670 RPW", 4, false, AType.SEDAN, 50, GType.DISEL));
        vehicles.add(new ElectricCar(120000, 7853, "Renault Duster", 80, 12500, true, "8994 BNE", 2, true, AType.SEDAN, true, 12));
        vehicles.add(new ElectricCar(500000, 1341, "Renault Logan", 500, 40000, false, "7093 RZR", 4, true, AType.SEDAN, true, 10));
        vehicles.add(new ElectricCar(200100, 5455, "Mazda 2", 250, 45555, false, "0114 FTZ", 2, false, AType.VAN, false, 15)); 
        vehicles.add(new Hybrid(469000, 2443, "Renault Stepway", 400, 7000, true, "2787 AHE", 3, false, AType.VAN, 150, GType.DISEL, false, 10)); 
        vehicles.add(new Hybrid(900000, 1223, "Renault Sandero", 1000, 3009, false, "4104 SOY", 2, true, AType.SEDAN, 60, GType.REGULAR, true, 20));
		vehicles.add(new Hybrid(700000, 4424, "Suzuki Vitara", 521, 2021, true, "4896 MJA", 2, false, AType.VAN, 300, GType.EXTRA, true, 25));
		vehicles.add(new Motorcycle(456600, 3442, "CF Moto", 624, 521, true, "6968 FNN", MType.STANDARD, 200));
		vehicles.add(new Motorcycle(900000, 1344, "Ducati", 162, 521, false, "4757 GNW", MType.SCOOTER, 400));
		vehicles.add(new Motorcycle(123300, 1231, "Honda", 362, 521, false, "9769 BCA", MType.SPORT, 200));

        return vehicles;
		
	}

}