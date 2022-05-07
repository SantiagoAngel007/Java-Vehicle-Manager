package ui;

import java.util.Scanner;

import model.CarPark;

public class MainPark {
	
	private Scanner sc;
	private CarPark vehicles;
	
	public MainPark(){
		sc= new Scanner(System.in);
		InitModel init = new InitModel();
		
		vehicles = new CarPark();
		
		vehicles.setVehicles(init.createVehicles());
		
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Car Machine");
		MainPark ppal= new MainPark();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Main menu, please pick an option\n" +
				"(1) To register a gas car \n" +
				"(2) To register an electric car \n"+
				"(3) To register a hybird car car \n"+
				"(4) To register a motorcycle car\n" +  
				"(5) Show information of all vehicles \n"+
				"(6) Show information by type of vehicles \n"+
				"(7) Show information by type of fuel \n"+
				"(8) Show information by type state \n"+
				"(9) Show all vehicles \n"+
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerGasCar();
			break;
		case 2:
			registerElectricCar();
			break;
	
		case 3:
			registerHybirdCar();
			break;

		case 4:
			registerMotorcycle();
			break;
			
		case 5:
			System.out.println(vehicles.showVehicles());
			//System.out.println(vehicles.prueba());
			break;
			
		case 6:
			byType();
			break;
			
		case 7:
			byFuelType();
			break;
			
		case 8:
			byStatesType();
			break;
			
		case 9:
			//registerMotorcycle();
			break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}

	public void registerGasCar() {
		
		
		double basePrice, cylinderCapacity, sellPrice, mileage, tankCapacity;
		String brand, plate;
		int tintedWindows, automobileType ,numberOfDoor, gasolineType, vehicleState;
		
		
		System.out.println("Registering the gasoline car");
		System.out.println("Insert the base price of the car");
		basePrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert any number");
		sellPrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the brand of the car");
		brand= sc.next();
		
		
		System.out.println("Insert the cylinder capacity of the car");
		cylinderCapacity= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the mileage of the car");
		mileage= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the (1) if the vehicle is new and (0) if the vehicle is old");
		vehicleState= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the brand of the car");
		plate= sc.next();
		
		System.out.println("Insert the number of doors of the car");
		numberOfDoor= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the (1) if the vehicle has tinted windows and (0) if the vehicle has not");
		tintedWindows= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the automobile type of the car if \n"+ 
		                    "(1) Van\n" +
		                    "(2) Sedan"
	
		);
		automobileType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the tank capacity of the car");
		tankCapacity= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the gasoline type of the car if \n"+ 
		                    "(1) Extra\n" +
		                    "(2) Regular\n" +
		                    "(3) Disel"
	
		);
		gasolineType= sc.nextInt();
		sc.nextLine();
		
		
		
		
		vehicles.addVehicle( basePrice,  sellPrice,  brand,  cylinderCapacity,  mileage,  vehicleState,  plate,  numberOfDoor,  tintedWindows,  automobileType,  tankCapacity,  gasolineType);
		
		
	}
	
	
	
	public void registerElectricCar() {
		
		
		double basePrice;
		double sellPrice;
		String brand ;
		double cylinderCapacity;
		double mileage;
		int vehicleState;
		String plate;
		int numberOfDoor;
		int tintedWindows;
		int automobileType;
		int chargerType;
		double batteryDuration;
		
		
		System.out.println("Registering the electric car");
		System.out.println("Insert the base price of the car");
		basePrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert any number");
		sellPrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the brand of the car");
		brand= sc.next();
		
		
		System.out.println("Insert the cylinder capacity of the car");
		cylinderCapacity= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the mileage of the car");
		mileage= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the (1) if the vehicle is new and (0) if the vehicle is old");
		vehicleState= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the brand of the car");
		plate= sc.next();
		
		System.out.println("Insert the number of doors of the car");
		numberOfDoor= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the (1) if the vehicle has tinted windows and (0) if the vehicle has not");
		tintedWindows= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the automobile type of the car if \n"+ 
		                    "(1) Van\n" +
		                    "(2) Sedan"
	
		);
		automobileType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert (1) if the charger type is fast or (0) if si normal");
		chargerType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the battery duration of the car");
		batteryDuration= sc.nextDouble();
		sc.nextLine();
		
		
		
		
		vehicles.addVehicle( basePrice,  sellPrice,  brand,  cylinderCapacity,  mileage,  vehicleState,  plate,  numberOfDoor,  tintedWindows,  automobileType,  chargerType,  batteryDuration);
		
		
	}
	
	
	public void registerHybirdCar() {
		
		double basePrice;
		double sellPrice;
		String brand;
		double cylinderCapacity;
		double mileage;
		int vehicleState;
		String plate;
		int numberOfDoor;
		int tintedWindows;
		int automobileType;
		double tankCapacity;
		int gasolineType;
		int chargerType;
		double batteryDuration;
		
		
		
		System.out.println("Registering the hybird car");
		System.out.println("Insert the base price of the car");
		basePrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert any number");
		sellPrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the brand of the car");
		brand= sc.next();
		
		
		System.out.println("Insert the cylinder capacity of the car");
		cylinderCapacity= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the mileage of the car");
		mileage= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the (1) if the vehicle is new and (0) if the vehicle is old");
		vehicleState= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the brand of the car");
		plate= sc.next();
		
		System.out.println("Insert the number of doors of the car");
		numberOfDoor= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the (1) if the vehicle has tinted windows and (0) if the vehicle has not");
		tintedWindows= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the automobile type of the car if \n"+ 
		                    "(1) Van\n" +
		                    "(2) Sedan"
	
		);
		automobileType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the tank capacity of the car");
		tankCapacity= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the gasoline type of the car if \n"+ 
		                    "(1) Extra\n" +
		                    "(2) Regular\n" +
		                    "(3) Disel"
	
		);
		gasolineType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert (1) if the charger type is fast or (0) if si normal");
		chargerType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the battery duration of the car");
		batteryDuration= sc.nextDouble();
		sc.nextLine();
		
		
		
		
		vehicles.addVehicle( basePrice,  sellPrice,  brand,  cylinderCapacity,  mileage,  vehicleState,  plate,  numberOfDoor,  tintedWindows,  automobileType,  tankCapacity,  gasolineType, chargerType,  batteryDuration);
		
		
	}
	
	
	
	public void registerMotorcycle() {
		
		
		double basePrice;
		double sellPrice;
		String brand;
		double cylinderCapacity;
		double mileage;
		int vehicleState;
		String plate;
		int motorcycleType;
		double gasolineCapacity;
		
		
		System.out.println("Registering the motorcycle");
		System.out.println("Insert the base price of the motorcycle");
		basePrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert any number");
		sellPrice= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the brand of the motorcycle");
		brand= sc.next();
		
		
		System.out.println("Insert the cylinder capacity of the motorcycle");
		cylinderCapacity= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the mileage of the motorcycle");
		mileage= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insert the (1) if the vehicle is new and (0) if the vehicle is old");
		vehicleState= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the brand of the motorcycle");
		plate= sc.next();
		
		
		System.out.println("Insert the motorcycle type if \n"+ 
		                    "(1) STANDARD\n" +
							"(2) SPORT\n" +
							"(3) SCOOTER\n" +
		                    "(4) CROSS"
	
		);
		motorcycleType= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert the tank capacity of the motorcycle");
		gasolineCapacity= sc.nextDouble();
		sc.nextLine();
		
		
		
		
		vehicles.addVehicle(basePrice,  sellPrice,  brand,  cylinderCapacity,  mileage,  vehicleState,  plate, motorcycleType, gasolineCapacity);
		
		
	}
	
	
	public void byType(){
		
		int type = 0;
		
		System.out.println("By which type would you like to get the information \n"+ 
		                    "(1) GAS CAR\n" +
							"(2) ELECTRIC CAR \n" +
							"(3) HYBIRD\n" +
		                    "(4) MOTORCYCLE"
	
		);
		
		type = sc.nextInt();
		sc.nextLine();
		
		System.out.println(vehicles.showVehiclesByType(type));
	}
	
	
	
	public void byFuelType(){
		
		int type = 0;
		
		System.out.println("By which type would you like to get the information \n"+ 
		                    "(1) EXTRA\n" +
							"(2) REGULAR \n" +
							"(3) DISEL\n" 
		                    
	
		);
		
		type = sc.nextInt();
		sc.nextLine();
		
		System.out.println(vehicles.showVehiclesByFuel(type));
	}
	
	
	
	public void byStatesType(){
		
		int type = 0;
		
		System.out.println("What type of state would you like to search \n"+ 
		                    "(1) Used\n" +
							"(2) New\n" 
		                    
	
		);
		
		type = sc.nextInt();
		sc.nextLine();
		
		System.out.println(vehicles.showVehiclesByState(type));
	}
	
	
	
	

}