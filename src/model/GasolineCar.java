package model;

public class GasolineCar extends Automobile implements GasolineConsumer{
	
	private double tankCapacity;
	
	private GType gasolineType;
	
	public GasolineCar(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int numberOfDoor, boolean tintedWindows, AType automobileType, double tankCapacity, GType gasolineType){
		
		super(basePrice, sellPrice, brand, cylinderCapacity, mileage, vehicleState, plate, numberOfDoor, tintedWindows, automobileType);
		
		this.tankCapacity = tankCapacity;
		
		this.gasolineType = gasolineType;
		
		
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
	
		
	public String toString() {

		return "**** Gasoline Car  information ****\n" + 
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
		"Gasoline type " + gasolineType + "\n";
		//"Species in wetland\n " + addSpecieToString();
	}
	
	
}