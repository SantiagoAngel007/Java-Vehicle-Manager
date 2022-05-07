package model;
import java.util.ArrayList;

public class CarPark{
	
	private ArrayList<Vehicle> vehicles;
	
	
	public CarPark(){
		this.vehicles = new ArrayList<Vehicle>();
	}
	
	public CarPark(ArrayList<Vehicle> vehicles){
        this.vehicles = vehicles;
    }
	
	
	public void addVehicle(Vehicle vehicle){
		vehicles.add(vehicle);
	}
	
	public void setVehicles(ArrayList<Vehicle> vehicles){
		this.vehicles = vehicles;
	}
	
	
	public void addVehicle(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int numberOfDoor, int tintedWindows, int automobileType, double tankCapacity, int gasolineType) {
		
		
		boolean state = false;
		
		if(vehicleState == 1){
			state = true;
		}
		
		boolean windows = false;
		
		if(tintedWindows == 1){
			windows = true;
		}
		
		
		
		
		AType aType = null;
		
		switch (automobileType){
			
			case 1:
			aType = AType.VAN;
			break;
			
			case 2:
			aType = AType.SEDAN;
			break;
			
			default:
			System.out.println("Error, wrong option");
		
			
		}
		
		GType gType = null;
		
		switch (gasolineType){
			
			case 1:
			gType = GType.EXTRA;
			break;
			
			case 2:
			gType = GType.REGULAR;
			break;
			
			case 3:
			gType = GType.DISEL;
			break;
			
			default:
			System.out.println("Error, wrong option");
		
			
		}
		
		
		Vehicle gasCar = new GasolineCar (basePrice, sellPrice, brand, cylinderCapacity, mileage, state, plate, numberOfDoor, windows, aType,  tankCapacity, gType);
		
		vehicles.add(gasCar);
		
		
	}
	
	
	
	
	public void addVehicle(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int numberOfDoor, int tintedWindows, int automobileType, int chargerType, double batteryDuration){
		
		
		boolean state = false;
		
		if(vehicleState == 1){
			state = true;
		}
		
		boolean windows = false;
		
		if(tintedWindows == 1){
			windows = true;
		}
		
		boolean charger = false;
		
		if(chargerType == 1){
			charger = true;
		}
		
		
		AType aType = null;
		
		switch (automobileType){
			
			case 1:
			aType = AType.VAN;
			break;
			
			case 2:
			aType = AType.SEDAN;
			break;
			
			default:
			System.out.println("Error, wrong option");
		
		}	
		
		Vehicle elecCar = new ElectricCar (basePrice, sellPrice, brand, cylinderCapacity, mileage, state, plate, numberOfDoor, windows, aType, charger, batteryDuration);
		
		vehicles.add(elecCar);
		
	}
	
	
	
	
	public void addVehicle(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int numberOfDoor, int tintedWindows, int automobileType, double tankCapacity, int gasolineType, int chargerType, double batteryDuration){
	
	
	
		boolean state = false;
		
		if(vehicleState == 1){
			state = true;
		}
		
		boolean windows = false;
		
		if(tintedWindows == 1){
			windows = true;
		}
		
		boolean charger = false;
		
		if(chargerType == 1){
			charger = true;
		}
	
	
	
		AType aType = null;
		
		switch (automobileType){
			
			case 1:
			aType = AType.VAN;
			break;
			
			case 2:
			aType = AType.SEDAN;
			break;
			
			default:
			System.out.println("Error, wrong option");
		
			
		}
		
		GType gType = null;
		
		switch (gasolineType){
			
			case 1:
			gType = GType.EXTRA;
			break;
			
			case 2:
			gType = GType.REGULAR;
			break;
			
			case 3:
			gType = GType.DISEL;
			break;
			
			default:
			System.out.println("Error, wrong option");
		
			
		}
		
		Vehicle hybiCar = new Hybrid (basePrice,  sellPrice,  brand,  cylinderCapacity,  mileage,  state,  plate,  numberOfDoor,  windows,  aType,  tankCapacity,  gType,  charger,  batteryDuration);
		
		vehicles.add(hybiCar);
		
		
	}
	
	
	public void addVehicle(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int motorcycleType, double gasolineCapacity){
		
		
		boolean state = false;
		
		if(vehicleState == 1){
			state = true;
		}
		
		
		MType mType = null;
		
		switch (motorcycleType){
			
			case 1:
			mType = MType.STANDARD;
			break;
			
			case 2:
			mType = MType.SPORT;
			break;
			
			case 3:
			mType = MType.SCOOTER;
			break;
			
			case 4:
			mType = MType.CROSS;
			break;
			
			default:
			System.out.println("Error, wrong option");
		
			
		}
		
		Vehicle motoCar = new Motorcycle (basePrice, sellPrice, brand, cylinderCapacity, mileage, state, plate, mType, gasolineCapacity);
		
		vehicles.add(motoCar);
		
	}
	
	
	public String showVehicles() {
		
		String gasCar = "";
		String elecCar = "";
		String hybiCar = "";
		String motoCar = "";
		
		
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof GasolineCar){
					gasCar += ((GasolineCar)vehicles.get(i)).toString();
					gasCar += "\n";
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof ElectricCar){
					elecCar += ((ElectricCar)vehicles.get(i)).toString();
					elecCar += "\n";
					//elecCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof Hybrid){
					hybiCar += ((Hybrid)vehicles.get(i)).toString();
					hybiCar += "\n";
					//hybiCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
		
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof Motorcycle){
					motoCar += ((Motorcycle)vehicles.get(i)).toString();
					motoCar += "\n";
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
			
			
		
		
		String out = "\n" + gasCar  + "\n" + elecCar  + "\n" + hybiCar + "\n" + motoCar + "\n";
		
		return out;
	}
	
	
	
	
	public String showVehiclesByType(int typeNum) {
		
		String gasCar = "";
		String elecCar = "";
		String hybiCar = "";
		String motoCar = "";
		
		
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof GasolineCar){
					gasCar += ((GasolineCar)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof ElectricCar){
					elecCar += ((ElectricCar)vehicles.get(i)).toString();
					//elecCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof Hybrid){
					hybiCar += ((Hybrid)vehicles.get(i)).toString();
					//hybiCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
		
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof Motorcycle){
					motoCar += ((Motorcycle)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                }
			}
		}
			
		String out = null;
		
		switch (typeNum){
			
			case 1:
			out = "**** Gas Car information ****\n" + 
				": " + gasCar + "\n";
			break;
			
			case 2:
			out = "**** Electric Car information ****\n" + 
				": " + elecCar + "\n";
			break;
			
			case 3:
			out = "**** Hybrid Car information ****\n" + 
				": " + hybiCar + "\n";
			break;
			
			case 4:
			out = "**** Motorcycle information ****\n" + 
				": " + motoCar + "\n";
			break;
			
			default:
			System.out.println("Error, wrong option");
		
			
		}	
		
		/*
		String out =  "**** Gas Car information ****\n" + 
		"Base price: " + gasCar + "\n" +
		"**** Electric Car information ****\n" + 
		"Sell price: " + elecCar + "\n" +
		"**** Gas Car information ****\n" + 
		"Brand: " + hybiCar + "\n" +
		"**** Gas Car information ****\n" + 
		"Gasoline capacity " + motoCar + "\n";
		*/
		
		
		return out;
	}
	
	
	public String showVehiclesByFuel(int fueltypeNum){
		
		String extra = "";
		String regular = "";
		String disel = "";
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof GasolineCar){
					if(((GasolineCar)vehicles.get(i)).getGasolineType() == GType.EXTRA){
					extra += ((GasolineCar)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
					}
				}
			}
		}
		
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof GasolineCar){
					if(((GasolineCar)vehicles.get(i)).getGasolineType() == GType.REGULAR){
					regular += ((GasolineCar)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
					}
				}
			}
		}
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof GasolineCar){
					if(((GasolineCar)vehicles.get(i)).getGasolineType() == GType.DISEL){
					disel += ((GasolineCar)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
					}
				}
			}
		}
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof Hybrid){
					if(((Hybrid)vehicles.get(i)).getGasolineType() == GType.EXTRA){
					extra += ((Hybrid)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
					}
				}
			}
		}
		
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof Hybrid){
					if(((Hybrid)vehicles.get(i)).getGasolineType() == GType.REGULAR){
					regular += ((Hybrid)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
					}
				}
			}
		}
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if (vehicles.get(i) instanceof Hybrid){
					if(((Hybrid)vehicles.get(i)).getGasolineType() == GType.DISEL){
					disel += ((Hybrid)vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
					}
				}
			}
		}
		
		
		
		String out = null;
		
		switch (fueltypeNum){
			
			case 1:
			out = "**** Extra fuel Car information ****\n" + 
				": " + extra + "\n";
			break;
			
			case 2:
			out = "**** Regular fuel Car information ****\n" + 
				": " + regular + "\n";
			break;
			
			case 3:
			out = "**** Disel fuel Car information ****\n" + 
				": " + disel + "\n";
			break;
			
			default:
			System.out.println("Error, wrong option");
		
			
		}
		
		
		return out;
	}
	
	
	public String prueba(){
		
		String prueba = "";
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
					prueba += (vehicles.get(i)).toString();
					//gasCar += " |Area : " + String.valueOf(figures[i].calculateArea());
                
			}
		}
		
		return prueba;
		
	}
	
	
	
	
}