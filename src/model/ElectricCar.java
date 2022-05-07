package model;

public class ElectricCar extends Automobile implements BatteryCosumer{
	
	private boolean chargerType;
	
	private double batteryDuration;
	
	public ElectricCar(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int numberOfDoor, boolean tintedWindows, AType automobileType, boolean chargerType, double batteryDuration){
		
		super(basePrice, sellPrice, brand, cylinderCapacity, mileage, vehicleState, plate, numberOfDoor, tintedWindows, automobileType);
		
		this.chargerType = chargerType;
		
		this.batteryDuration = batteryDuration;
		
	}
	
	
	@Override
	public double batteryCosume(){
		
		double consume = 0;
		
		return consume;
	}
	
	
	
	public boolean getChargerType(){
		
		return chargerType;
	}
		
	public double getBatteryDuration(){
		
		return batteryDuration;	
	}
	
	
	public String toString() {

		return "**** Electric Car information ****\n" + 
		"Base price: " + super.getBasePrice() + "\n" +
		"Sell price: " + super.getSellPrice() + "\n" +
		"Brand: " + super.getBrand() + "\n" +
		"Cylinder Capacity: " + super.getCylinderCapacity() + "\n" +
		"Mileage: " + super.getMileage() + "\n" +
		"The vehicle is new: " + super.getVehicleState() + "\n" +	
		"Plate" + super.getPlate() + "\n" +
		"Number of doors " + super.getNumberOfDoor() + "\n" +
		"The vehicle has tinted windows " + super.getTintedWindows() + "\n" +
		"Automobile type " + super.getAutomobileType() + "\n" +
		"The vehicle has a fast charger " + chargerType + "\n" +
		"Battery Duration " + batteryDuration + "\n";
		//"Species in wetland\n " + addSpecieToString();
	}

	
}