package model;

public class Hybrid extends Automobile implements BatteryCosumer, GasolineConsumer{
	
	private double tankCapacity;
	
	private GType gasolineType;
	
	private boolean chargerType;
	
	private double batteryDuration;
	
	public Hybrid(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int numberOfDoor, boolean tintedWindows, AType automobileType, double tankCapacity, GType gasolineType, boolean chargerType, double batteryDuration){
		
		super(basePrice, sellPrice, brand, cylinderCapacity, mileage, vehicleState, plate, numberOfDoor, tintedWindows, automobileType);
		
		this.tankCapacity = tankCapacity;
		
		this.gasolineType = gasolineType;
		
		this.chargerType = chargerType;
		
		this.batteryDuration = batteryDuration;
		
	}
	
	@Override
	public double batteryCosume(){
		
		double consume = 0;
		
		return consume;
	}
	
	@Override
	public double gasolineConsume(){
		
		double consume = 0;
		
		return consume;
	}
	
	
	
	
	public double getTankCapacity(){
		
		return tankCapacity;
	}
		
	public GType getGasolineType(){
		
		return gasolineType;
	}
		
	public boolean getChargerType(){
		
		return chargerType;
	}
		
	public double getBatteryDuration(){
		
		return batteryDuration;	
	}
	
	
	public String toString() {

		return "**** Hybrid Car information ****\n" + 
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
		"Tank capacity " + tankCapacity + "\n" +
		"Gasoline type " + gasolineType + "\n"+
		"The vehicle has a fast charger " + chargerType + "\n" +
		"Battery Duration " + batteryDuration + "\n";
		//"Species in wetland\n " + addSpecieToString();
	}
	
	
}