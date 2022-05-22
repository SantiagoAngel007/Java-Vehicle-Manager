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

		vehicles.fillingArrayParking();
		
		vehicles.fillingArrayParkingSixLine();

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
				"(9) Show documents information by id \n"+
				"(10) Save a car in a parking lot\n"+
				"(11) TESTS \n"+
				"(12) Show information of vehicles in the parking \n"+
				"(13) Show the oldest and the newest car in the paring \n"+
				"(14) Show the porcentage of the ocupation\n"+
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
			byId();
			break;

		case 10:
			SearchToSave();
		break;

		case 11:
		System.out.println(vehicles.printParkingArray());
		
			//System.out.println(vehicles.printParkingArray());
			//System.out.println(vehicles.showArray(parking_array[][]));
			//System.out.println(parking_array[][]);
			//vehicles.decodingSoat();
			//System.out.println(vehicles.createMatrix());
			//vehicles.decodingMechanicalTechnician();
			//vehicles.decodingPropertyCard();
			break;

		case 12:
			System.out.println(vehicles.showVehiclesMatrix());
		break;

		case 13:
		System.out.println(vehicles.getGreaterAndLower());
		break;

		case 14:
		System.out.println("The porcentaje of the ocupation in the parking lots is " + vehicles.showPorcentajeOfOcupation() + "%");
		break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	

	}

	public void registerGasCar() {
		
		
		double basePrice, cylinderCapacity, mileage, tankCapacity;
		String brand, plate;
		int tintedWindows, automobileType ,numberOfDoor, gasolineType, vehicleState, id;
		double[] docs = new double[9];
		int creation;
		
		
		System.out.println("Registering the gasoline car");
		System.out.println("Insert the base price of the car");
		basePrice= sc.nextDouble();
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
		
		System.out.println("Insert the plate of the car");
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
		
		id = (int)(Math.random()*(1000)+1);


	
		System.out.println("Does this car have SOAT? yes(1) no(0)");
		int confirmation = sc.nextInt();
		if(confirmation==1){
			System.out.println("What is the document price");
			docs[0] = sc.nextDouble();

			System.out.println("year of the document");
			docs[1] = sc.nextDouble();

			System.out.println("Incert the coverage of the car");
			docs[2] = sc.nextDouble();


		}else{
			docs[0] = 0;
			docs[1] = 0;
			docs[2] = 0;
		}

		System.out.println("Does this car have MechanicalTechnician? yes(1) no(0)");
		int confirmation2 = sc.nextInt();
		if(confirmation2==1){
			System.out.println("What is the document price");
			docs[3] = sc.nextDouble();

			System.out.println("year of the document");
			docs[4] = sc.nextDouble();

			System.out.println("Incert the gas levels of the car");
			docs[5] = sc.nextDouble();


		}else{
			docs[3] = 0;
			docs[4] = 0;
			docs[5] = 0;
		}


		System.out.println("Does this car have PropertyCard? yes(1) no(0)");
		int confirmation3 = sc.nextInt();
		if(confirmation3==1){
			System.out.println("What is the document price");
			docs[6] = sc.nextDouble();

			System.out.println("year of the document");
			docs[7] = sc.nextDouble();


		}else{
			docs[6] = 0;
			docs[7] = 0;
		}

		System.out.println("Insert the (1) if the creation date of the car");
		creation= sc.nextInt();
		sc.nextLine();



		
		
		vehicles.addVehicle( basePrice,  brand,  cylinderCapacity,  mileage,  vehicleState,  plate,  numberOfDoor,  tintedWindows,  automobileType,  tankCapacity,  gasolineType, id, docs, creation);
		
		
	}
	
	
	
	public void registerElectricCar() {
		
		
		double basePrice;
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
		int id;
		double[] docs = new double[9];
		int creation;
		
		
		System.out.println("Registering the electric car");
		System.out.println("Insert the base price of the car");
		basePrice= sc.nextDouble();
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
		
		System.out.println("Insert the plate of the car");
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
		
		id = (int)(Math.random()*(1000)+1);


		System.out.println("Does this car have SOAT? yes(1) no(0)");
		int confirmation = sc.nextInt();
		if(confirmation==1){
			System.out.println("What is the document price");
			docs[0] = sc.nextDouble();

			System.out.println("year of the document");
			docs[1] = sc.nextDouble();

			System.out.println("Incert the coverage of the car");
			docs[2] = sc.nextDouble();


		}else{
			docs[0] = 0;
			docs[1] = 0;
			docs[2] = 0;
		}

		System.out.println("Does this car have MechanicalTechnician? yes(1) no(0)");
		int confirmation2 = sc.nextInt();
		if(confirmation2==1){
			System.out.println("What is the document price");
			docs[3] = sc.nextDouble();

			System.out.println("year of the document");
			docs[4] = sc.nextDouble();

			System.out.println("Incert the gas levels of the car");
			docs[5] = sc.nextDouble();


		}else{
			docs[3] = 0;
			docs[4] = 0;
			docs[5] = 0;
		}


		System.out.println("Does this car have PropertyCard? yes(1) no(0)");
		int confirmation3 = sc.nextInt();
		if(confirmation3==1){
			System.out.println("What is the document price");
			docs[6] = sc.nextDouble();

			System.out.println("year of the document");
			docs[7] = sc.nextDouble();


		}else{
			docs[6] = 0;
			docs[7] = 0;
		}


		System.out.println("Insert the (1) if the creation date of the car");
		creation= sc.nextInt();
		sc.nextLine();
		
		
		vehicles.addVehicle( basePrice, brand,  cylinderCapacity,  mileage,  vehicleState,  plate,  numberOfDoor,  tintedWindows,  automobileType,  chargerType,  batteryDuration, id, docs, creation);
		
		
	}
	
	
	public void registerHybirdCar() {
		
		double basePrice;
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
		int id;
		double[] docs = new double[9];
		int creation;
		
		
		
		System.out.println("Registering the hybird car");
		System.out.println("Insert the base price of the car");
		basePrice= sc.nextDouble();
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
		
		System.out.println("Insert the plate of the car");
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
		
		
		id = (int)(Math.random()*(1000)+1);


		System.out.println("Does this car have SOAT? yes(1) no(0)");
		int confirmation = sc.nextInt();
		if(confirmation==1){
			System.out.println("What is the document price");
			docs[0] = sc.nextDouble();

			System.out.println("year of the document");
			docs[1] = sc.nextDouble();

			System.out.println("Incert the coverage of the car");
			docs[2] = sc.nextDouble();


		}else{
			docs[0] = 0;
			docs[1] = 0;
			docs[2] = 0;
		}

		System.out.println("Does this car have MechanicalTechnician? yes(1) no(0)");
		int confirmation2 = sc.nextInt();
		if(confirmation2==1){
			System.out.println("What is the document price");
			docs[3] = sc.nextDouble();

			System.out.println("year of the document");
			docs[4] = sc.nextDouble();

			System.out.println("Incert the gas levels of the car");
			docs[5] = sc.nextDouble();


		}else{
			docs[3] = 0;
			docs[4] = 0;
			docs[5] = 0;
		}


		System.out.println("Does this car have PropertyCard? yes(1) no(0)");
		int confirmation3 = sc.nextInt();
		if(confirmation3==1){
			System.out.println("What is the document price");
			docs[6] = sc.nextDouble();

			System.out.println("year of the document");
			docs[7] = sc.nextDouble();


		}else{
			docs[6] = 0;
			docs[7] = 0;
		}

		System.out.println("Insert the (1) if the creation date of the car");
		creation= sc.nextInt();
		sc.nextLine();
		
		
		vehicles.addVehicle( basePrice,  brand,  cylinderCapacity,  mileage,  vehicleState,  plate,  numberOfDoor,  tintedWindows,  automobileType,  tankCapacity,  gasolineType, chargerType,  batteryDuration, id, docs, creation);
		
		
	}
	
	
	
	public void registerMotorcycle() {
		
		
		double basePrice;
		String brand;
		double cylinderCapacity;
		double mileage;
		int vehicleState;
		String plate;
		int motorcycleType;
		double gasolineCapacity;
		int id;
		double[] docs = new double[9];
		int creation;
		
		
		System.out.println("Registering the motorcycle");
		System.out.println("Insert the base price of the motorcycle");
		basePrice= sc.nextDouble();
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
		
		System.out.println("Insert the plate of the motorcycle");
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
		
		
		id = (int)(Math.random()*(1000)+1);


		System.out.println("Does this car have SOAT? yes(1) no(0)");
		int confirmation = sc.nextInt();
		if(confirmation==1){
			System.out.println("What is the document price");
			docs[0] = sc.nextDouble();

			System.out.println("year of the document");
			docs[1] = sc.nextDouble();

			System.out.println("Incert the coverage of the car");
			docs[2] = sc.nextDouble();


		}else{
			docs[0] = 0;
			docs[1] = 0;
			docs[2] = 0;
		}

		System.out.println("Does this car have MechanicalTechnician? yes(1) no(0)");
		int confirmation2 = sc.nextInt();
		if(confirmation2==1){
			System.out.println("What is the document price");
			docs[3] = sc.nextDouble();

			System.out.println("year of the document");
			docs[4] = sc.nextDouble();

			System.out.println("Incert the gas levels of the car");
			docs[5] = sc.nextDouble();


		}else{
			docs[3] = 0;
			docs[4] = 0;
			docs[5] = 0;
		}


		System.out.println("Does this car have PropertyCard? yes(1) no(0)");
		int confirmation3 = sc.nextInt();
		if(confirmation3==1){
			System.out.println("What is the document price");
			docs[6] = sc.nextDouble();

			System.out.println("year of the document");
			docs[7] = sc.nextDouble();


		}else{
			docs[6] = 0;
			docs[7] = 0;
		}


		System.out.println("Insert the (1) if the creation date of the car");
		creation= sc.nextInt();
		sc.nextLine();
		
		vehicles.addVehicle(basePrice,  brand,  cylinderCapacity,  mileage,  vehicleState,  plate, motorcycleType, gasolineCapacity, id, docs, creation);
		
		
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
	
	
	public void byId(){
		
		int type = 0;
		
		System.out.println("Incert the id of the vehicle");
		
		type = sc.nextInt();
		sc.nextLine();
		
		System.out.println(vehicles.searchById(type));
	}

	public void SearchToSave(){
		
		int type = 0;
		
		System.out.println("Insert the id of the vehicle that you want to save");
		
		type = sc.nextInt();
		sc.nextLine();
		
		vehicles.saveCarInParking(type);
	}
	
	

}