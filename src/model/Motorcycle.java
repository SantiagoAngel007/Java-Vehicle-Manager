package model;

public class Motorcycle extends Vehicle implements GasolineConsumer, CalculatePrice{
	
	private MType motorcycleType;
	
	private double gasolineCapacity;
	
	public Motorcycle (double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, MType motorcycleType, double gasolineCapacity){
		
		super(basePrice, sellPrice, brand, cylinderCapacity, mileage, vehicleState, plate);
		
		this.motorcycleType = motorcycleType;
		
		this.gasolineCapacity = gasolineCapacity;
		
    }
	
	@Override
	public double calculatePrice(){
		
		double calculate = super.getBasePrice();
		
		calculate = calculate + (super.getBasePrice()*0.04);
		
		if(super.getVehicleState() == false){
			
			calculate = calculate -(super.getBasePrice()*0.02);
			
		}
		
		calculate = calculate + 500000;
		
		
		return calculate;
	}
	
	
	@Override
	public double gasolineConsume(){
		
		double consume = gasolineCapacity * (super.getCylinderCapacity()/75);
		
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
		"Sell price: " + calculatePrice() + "\n" +
		"Brand: " + super.getBrand() + "\n" +
		"Cylinder Capacity: " + super.getCylinderCapacity() + "\n" +
		"Mileage: " + super.getMileage() + "\n" +
		"The vehicle is new: " + super.getVehicleState() + "\n" +	
		"Plate: " + super.getPlate() + "\n" +
		"Motorcycle type: " + motorcycleType + "\n" +
		"Gasoline capacity: " + gasolineCapacity + "\n"+
		"Gasoline Consume: " + gasolineConsume() + "\n";
	}
	
	
	
}