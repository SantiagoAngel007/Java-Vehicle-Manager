package ui; 

import model.*;

import java.util.ArrayList;

public class InitModel {
    
    public InitModel() { }

	public ArrayList<Vehicle> createVehicles(){
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		
		int [][] newMatrix;
		newMatrix= new int[4][4];

		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				//int num = (int)(Math.random()*(100)+1);
				newMatrix[i][j]=j+i;	
		}
	}

		 
		 Document newSoat = new Soat (1111.0, 2014, newMatrix, 3333.0 );
		 Document newTec = new MechanicalTechnician (2222.0, 2000, newMatrix, 4444.0);
		 Document newPro = new PropertyCard (5555.0, 2014, newMatrix);
		
		vehicles.add(new GasolineCar(300000, "Chevrolet Onix", 250, 12000, false, "7810 PRZ", 2, true, AType.VAN, 100, GType.EXTRA, 132, newSoat, newTec, newPro, 2014 ));
		vehicles.add(new GasolineCar(200000, "Suzuki Swift", 800, 3000, true, "7895 WFS", 4, true, AType.VAN, 200, GType.REGULAR, 123, newSoat, newTec, newPro, 2013));
        
        vehicles.add(new ElectricCar(120000, "Renault Duster", 80, 12500, false, "8994 BNE", 2, true, AType.SEDAN, true, 12, 356, newSoat, newTec, newPro, 2012));
        vehicles.add(new ElectricCar(500000, "Renault Logan", 500, 40000, false, "093 RZR", 4, true, AType.SEDAN, true, 10, 686, newSoat, newTec, newPro, 2016));
       
        vehicles.add(new Hybrid(469000, "Renault Stepway", 400, 7000, true, "4787 AHE", 3, false, AType.VAN, 150, GType.DISEL, false, 10, 632, newSoat, newTec, newPro, 2011)); 
        vehicles.add(new Hybrid(900000, "Renault Sandero", 1000, 3009, false, "5104 SOY", 2, true, AType.SEDAN, 60, GType.REGULAR, true, 20, 623, newSoat, newTec, newPro, 2018));
	
		vehicles.add(new Motorcycle(456600, "CF Moto", 624, 521, true, "6968 FNN", MType.STANDARD, 200, 857, newSoat, newTec, newPro, 2020));
		vehicles.add(new Motorcycle(900000, "Ducati", 162, 521, false, "7757 GNW", MType.SCOOTER, 400, 432, newSoat, newTec, newPro, 2013));
		

		vehicles.add(new GasolineCar(450000, "Kia Picanto", 120, 50000, false, "8670 RPW", 4, false, AType.SEDAN, 50, GType.DISEL, 534, newSoat, newTec, null, 2014));
		vehicles.add(new ElectricCar(200100, "Mazda 2", 250, 45555, false, "5114 FTZ", 2, false, AType.VAN, false, 15, 535, newSoat, newTec, null, 2013)); 
		vehicles.add(new Hybrid(700000, "Suzuki Vitara", 521, 2021, false, "3896 MJA", 2, false, AType.VAN, 300, GType.EXTRA, true, 25, 875, newSoat, newTec, null, 2012));
		vehicles.add(new Motorcycle(123300, "Honda", 362, 521, false, "5769 BCA", MType.SPORT, 200, 168, newSoat, newTec, null, 2010));

		vehicles.add(new GasolineCar(300000, "Chevrolet Onix", 250, 12000, false, "7810 PRZ", 2, true, AType.VAN, 100, GType.EXTRA, 132, newSoat, newTec, newPro, 2013 ));

        return vehicles;
		
	}

}