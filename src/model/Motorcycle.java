package model;

public class Motorcycle extends Vehicle implements GasolineConsumer{
	
	private MType motorcycleType;
	
	private double gasolineCapacity;
	
	public Motorcycle (double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, MType motorcycleType, double gasolineCapacity){
		
		super(basePrice, sellPrice, brand, cylinderCapacity, mileage, vehicleState, plate);
		
		this.motorcycleType = motorcycleType;
		
		this.gasolineCapacity = gasolineCapacity;
		
    }
	
	@Override
	public double gasolineConsume(){
		
		double consume = 0;
		
		return consume;
	}
	
	public MType getMotorcicleType(){
		
		return motorcycleType;
	}
		
	public double getGasolineCapacity(){
		
		return gasolineCapacity;
	}
	
	
	public String toString() {

		return "**** Motorcycle  information ****\n" + 
		"Base price: " + super.getBasePrice() + "\n" +
		"Sell price: " + super.getSellPrice() + "\n" +
		"Brand: " + super.getBrand() + "\n" +
		"Cylinder Capacity: " + super.getCylinderCapacity() + "\n" +
		"Mileage: " + super.getMileage() + "\n" +
		"The vehicle is new: " + super.getVehicleState() + "\n" +	
		"Plate" + super.getPlate() + "\n" +
		"Motorcycle type " + motorcycleType + "\n" +
		"Gasoline capacity " + gasolineCapacity + "\n";
		//"Species in wetland\n " + addSpecieToString();
	}
	
	
	
}