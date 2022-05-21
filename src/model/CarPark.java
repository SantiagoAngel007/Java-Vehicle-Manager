package model;
import java.util.ArrayList;


public class CarPark{

	private static final int MAX_ROWS =  10;
	
	private static final int MAX_COLUMNS =  6;
	
	private ArrayList<Vehicle> vehicles;

	private Vehicle savinParking_array[][];

	public String parking_array[][];
	

	
	
	
	public CarPark(){
		this.vehicles = new ArrayList<Vehicle>();

		savinParking_array = new Vehicle[MAX_ROWS][MAX_COLUMNS] ;

		parking_array = new String[MAX_ROWS][MAX_COLUMNS];

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
	
	
	public void addVehicle(double basePrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int numberOfDoor, int tintedWindows, int automobileType, double tankCapacity, int gasolineType, int id, double[] docs, int creation) {
		

		int [][] newMatrix = createMatrix();


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


		int a = (int)(docs[1]);
		int b = (int)(docs[4]);
		int c = (int)(docs[7]);

		Document soat = new Soat (docs[0], a, newMatrix, docs[2]);

		if(docs[0] == 0){
			soat = null;
		}

		newMatrix = createMatrix();

		Document mechaniclaTechnician = new MechanicalTechnician (docs[3], b, newMatrix, docs[5]);

		if(docs[3] == 0){
			mechaniclaTechnician = null;
		}

		newMatrix = createMatrix();

		Document propertyCard = new PropertyCard (docs[6], c, newMatrix);

		if(docs[6] == 0){
			propertyCard = null;
		}
		
		
		Vehicle gasCar = new GasolineCar (basePrice, brand, cylinderCapacity, mileage, state, plate, numberOfDoor, windows, aType,  tankCapacity, gType, id, soat, mechaniclaTechnician, propertyCard, creation);
		
		vehicles.add(gasCar);
		
		
	}
	
	
	
	
	public void addVehicle(double basePrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int numberOfDoor, int tintedWindows, int automobileType, int chargerType, double batteryDuration, int id, double[] docs, int creation){
		
		int [][] newMatrix = createMatrix();

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
		
		
		int a = (int)(docs[1]);
		int b = (int)(docs[4]);
		int c = (int)(docs[7]);

		Document soat = new Soat (docs[0], a, newMatrix, docs[2]);

		if(docs[0] == 0){
			soat = null;
		}

		newMatrix = createMatrix();

		Document mechaniclaTechnician = new MechanicalTechnician (docs[3], b, newMatrix, docs[5]);

		if(docs[3] == 0){
			mechaniclaTechnician = null;
		}

		newMatrix = createMatrix();

		Document propertyCard = new PropertyCard (docs[6], c, newMatrix);

		if(docs[6] == 0){
			propertyCard = null;
		}

		
		Vehicle elecCar = new ElectricCar (basePrice, brand, cylinderCapacity, mileage, state, plate, numberOfDoor, windows, aType, charger, batteryDuration, id, soat, mechaniclaTechnician, propertyCard, creation);
		
		vehicles.add(elecCar);
		
	}
	
	
	
	
	public void addVehicle(double basePrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int numberOfDoor, int tintedWindows, int automobileType, double tankCapacity, int gasolineType, int chargerType, double batteryDuration, int id, double[] docs, int creation){
	
		int [][] newMatrix = createMatrix();

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


		int a = (int)(docs[1]);
		int b = (int)(docs[4]);
		int c = (int)(docs[7]);

		Document soat = new Soat (docs[0], a, newMatrix, docs[2]);

		if(docs[0] == 0){
			soat = null;
		}

		newMatrix = createMatrix();

		Document mechaniclaTechnician = new MechanicalTechnician (docs[3], b, newMatrix, docs[5]);

		if(docs[3] == 0){
			mechaniclaTechnician = null;
		}

		newMatrix = createMatrix();

		Document propertyCard = new PropertyCard (docs[6], c, newMatrix);

		if(docs[6] == 0){
			propertyCard = null;
		}
		
		Vehicle hybiCar = new Hybrid (basePrice,  brand,  cylinderCapacity,  mileage,  state,  plate,  numberOfDoor,  windows,  aType,  tankCapacity,  gType,  charger,  batteryDuration, id, soat, mechaniclaTechnician, propertyCard, creation);
		
		vehicles.add(hybiCar);
		
		
	}
	
	
	public void addVehicle(double basePrice, String brand, double cylinderCapacity, double mileage, int vehicleState, String plate, int motorcycleType, double gasolineCapacity, int id, double[] docs, int creation){
		
		int [][] newMatrix = createMatrix();
		
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


		int a = (int)(docs[1]);
		int b = (int)(docs[4]);
		int c = (int)(docs[7]);

		Document soat = new Soat (docs[0], a, newMatrix, docs[2]);

		if(docs[0] == 0){
			soat = null;
		}

		newMatrix = createMatrix();

		Document mechaniclaTechnician = new MechanicalTechnician (docs[3], b, newMatrix, docs[5]);

		if(docs[3] == 0){
			mechaniclaTechnician = null;
		}

		newMatrix = createMatrix();

		Document propertyCard = new PropertyCard (docs[6], c, newMatrix);

		if(docs[6] == 0){
			propertyCard = null;
		}

		
		Vehicle motoCar = new Motorcycle (basePrice, brand, cylinderCapacity, mileage, state, plate, mType, gasolineCapacity, id, soat, mechaniclaTechnician, propertyCard, creation);
		
		vehicles.add(motoCar);
		
	}



	public String showVehiclesMatrix(){

		String out = "";
		
			for(int i=0; i<savinParking_array.length; i++){
				for(int j=0; j<savinParking_array[0].length; j++){
					if(savinParking_array[i][j] != null ){
						out += vehicles.get(i).toString();
						out += "\n";
				}
			}
		}
		return out;
	}
	

	public double showPorcentajeOfOcupation(){
		
		double counter = 0.0;

		for(int i=0; i<savinParking_array.length; i++){
			for(int j=0; j<savinParking_array[0].length; j++){
				if(savinParking_array[i][j] != null ){
					counter++;
			}
		}
	}

	double porcentage = (counter/50)*100;
		
		
		return porcentage;
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
					extra += "\n";
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
					regular += "\n";
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
					disel += "\n";
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
					extra += "\n";
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
					regular += "\n";
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
					disel += "\n";
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
	
	
	public String showVehiclesByState(int stateTypeNum){
		
		
		String used = "";
		String news = "";
		
		
		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if((vehicles.get(i)).getVehicleState() == true){
					news += (vehicles.get(i)).toString();
					news += "\n";
				}
			}
		}

		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if((vehicles.get(i)).getVehicleState() == true){
					used += (vehicles.get(i)).toString();
					used += "\n";
				}
			}
		}

	
		
		String out = null;
		
		switch (stateTypeNum){
			
			case 1:
			out = "**** Used Car information ****\n" + 
				": " + used + "\n";
			break;
			
			case 2:
			out = "**** New Car information ****\n" + 
				": " + news + "\n";
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


	private String printString(int[][] matrix) {
		String print ="";
		for (int i=0; i< matrix.length; i++ ) { 
			for (int j = 0; j < matrix[0].length; j++) { 
				print += matrix[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}

	public String showArray(String[][] array) {
		String print ="";
		for (int i=0; i< array.length; i++ ) { 
			for (int j = 0; j < array[0].length; j++) { 
				print += array[i][j] + " ";
			}
			print += "\n";
		}

		return print;
	}
	
	public int[][] createMatrix(){

		int [][] matrix= new int[4][4];

		for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					int num = (int)(Math.random()*(100)+1);
					matrix[i][j]=num;
			}
		}

		return matrix;
	}

	public String[][] createArray(){

		String [][] array= new String[MAX_ROWS][MAX_COLUMNS];

		for(int i=0; i<MAX_ROWS; i++){
				for(int j=0; j<MAX_COLUMNS; j++){
					String car = "Car";
					array[i][j]= car;
			}
		}

		return array;
	}



	public String printMatrix(int[][] matrix){

		String out = "";

		out = printString(matrix);

		return out;
	}

	public String printArray(String[][] array){

		String out = "";

		out = showArray(array);

		return out;
	}





	public void decodingSoat(int[][] newMatrix){
		
		System.out.println("Soat Decodification\n");

		
		
		String code = "";


      for(int i = 0; i<newMatrix.length; i++){
        code += newMatrix[i][0];
      }

    	
      for (int i = 1; i < newMatrix[0].length; i++){
        code += newMatrix[newMatrix.length-1][i];
      } 

	  	System.out.println("Image:");
		System.out.println(printString(newMatrix));
				
		System.out.println("Code: " + code);
		System.out.println( "");
	
	}

	
	public void decodingMechanicalTechnician(int[][] newMatrix){
		
		System.out.println("MechanicalTechnician Decodification\n");

		
		
		String code = "";



	  System.out.println("Image:");
		System.out.println(printString(newMatrix));
		

		
		for(int i = 0; i<newMatrix.length; i++ ){
			code += (newMatrix[0][i]);
		}

		code += newMatrix[1][2];
		code += newMatrix[2][1];

		for(int i = 0; i<newMatrix.length; i++ ){
			code += (newMatrix[3][i]);
		}

		System.out.println("Code: " +code);
		System.out.println( "");
	
	}


	public void decodingPropertyCard(int[][] newMatrix){
		
		System.out.println("PropertyCard Decodification\n");
		
		String code = "";

	
	
      for(int i = newMatrix.length-1; i>=0; i--){
        for(int j= newMatrix[0].length-1; j>=0;j--){
           if((i+j)%2==0 && (i+j)!=0){
            code += newMatrix[i][j];
            }
        }
      }
 
  
  
  		System.out.println("Image:");
		System.out.println(printString(newMatrix));

		System.out.println("Code: " + code);
		System.out.println( "");
	
	}
	
	
	public String searchById(int id){
		
		System.out.println("Documents of the vehicle\n");

		String message = "";

		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if((vehicles.get(i)).getId() == id){	
					if((vehicles.get(i)).getSoat()!=null){
						message += ((vehicles.get(i)).getSoat()).toString();
						decodingSoat(((vehicles.get(i)).getSoat()).getImage());
						message += "\n";
					}else{
						message += "There is no Soat";
						message += "\n";
					}
					if((vehicles.get(i)).getMechanicalTechnician()!=null){
					message += ((vehicles.get(i)).getMechanicalTechnician()).toString();
					decodingMechanicalTechnician(((vehicles.get(i)).getMechanicalTechnician()).getImage());
					message += "\n";
					}else{
						message += "There is no MechanicalTechnician";
						message += "\n";
					}
					if((vehicles.get(i)).getPropertyCard()!=null){
					message += ((vehicles.get(i)).getPropertyCard()).toString();
					decodingPropertyCard(((vehicles.get(i)).getPropertyCard()).getImage());
					message += "\n";
					}else{
						message += "There is no PropertyCard";
						message += "\n";
					}
				}
			}
		}

		return message;

	}

	
	public int firstNullSpaceCero(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (parking_array[i][0] == "|DESOCUPADO|"){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}

	public int firstNullSpaceOne(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (parking_array[i][1] == "|DESOCUPADO|"){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}

	public int firstNullSpaceTwo(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (parking_array[i][2] == "|DESOCUPADO|"){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}

	public int firstNullSpaceTree(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (parking_array[i][3] == "|DESOCUPADO|"){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}


	public int firstNullSpaceFour(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (parking_array[i][4] == "|DESOCUPADO|"){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}


	public int firstNullSpaceCeroNull(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (savinParking_array[i][0] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}

	public int firstNullSpaceOneNull(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (savinParking_array[i][1] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}

	public int firstNullSpaceTwoNull(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (savinParking_array[i][2] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}

	public int firstNullSpaceTreeNull(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (savinParking_array[i][3] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}


	public int firstNullSpaceFourNull(){
		
		boolean emptyposition1 = false;
		int position = -1;
		for (int i=0; i<MAX_ROWS && !emptyposition1; i++){
			
			if (parking_array[i][4] == null){
				emptyposition1 = true;
				position = i;
				
			}
		}
		return position;
	}


	


	public void fillingArrayParking(){
		
		for(int i=0; i<MAX_ROWS;  i++){
			for(int j=0; j<	MAX_COLUMNS; j++){
				
				if (parking_array[i][j] == null){
					parking_array[i][j] = "|DESOCUPADO|";
				}


			}
		}
				
	}


	public void fillingArrayParkingSixLine(){
		
		for(int i=0; i<MAX_ROWS;  i++){
			for(int j=0; j<	MAX_COLUMNS; j++){
				
				if (parking_array[i][5] == "|DESOCUPADO|"){
					parking_array[i][5] = "";
				}


			}
		}
				
	}



	public void saveCarInParking(int id){
		

		if(vehicles != null){
			for(int i=0; i< vehicles.size(); i++){
				if(vehicles.get(i).getId() == id){

					

					boolean isOld = vehicles.get(i).getVehicleState() == false;
					boolean isUnder15 = vehicles.get(i).getDateOfCreation()<2015;
					boolean hasCard = vehicles.get(i).getPropertyCard() != null;

					if(isOld && isUnder15 && !hasCard){

						switch(vehicles.get(i).getDateOfCreation()){

							case 2014:
								parking_array[firstNullSpaceCero()][0] = "| " + (vehicles.get(i)).getPlate() + " |" ;
								savinParking_array[firstNullSpaceCeroNull()][0] = vehicles.get(i);
							break;

							case 2013:
								parking_array[firstNullSpaceOne()][1] = "| " + (vehicles.get(i)).getPlate() + " |" ;
								savinParking_array[firstNullSpaceOneNull()][1] = vehicles.get(i);	
							break;

							case 2012:
								parking_array[firstNullSpaceTwo()][2] = "| " + (vehicles.get(i)).getPlate() + " |" ;
								savinParking_array[firstNullSpaceTwoNull()][2] = vehicles.get(i);
							break;

							case 2011:
								parking_array[firstNullSpaceTree()][3] = "| " + (vehicles.get(i)).getPlate() + " |" ;
								savinParking_array[firstNullSpaceTreeNull()][3] = vehicles.get(i);
							break;

							default:
								parking_array[firstNullSpaceFour()][4] = "| " + (vehicles.get(i)).getPlate() + " |" ;
								savinParking_array[firstNullSpaceFourNull()][4] = vehicles.get(i);
							break;


						}
					}
				}
			}
		}
	}



	


	
	public String printParkingArray() {
		
		showArray(parking_array);

		return showArray(parking_array);

	}
	






}