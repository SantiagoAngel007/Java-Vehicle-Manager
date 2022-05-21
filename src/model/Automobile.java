package model;

public abstract class Automobile extends Vehicle{
	
	private int numberOfDoor;
	
	private boolean tintedWindows;
	
	private AType automobileType;
	
	public Automobile(double basePrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int numberOfDoor, boolean tintedWindows, AType automobileType, int id, Document soat, Document mechanicalTechnician, Document propertyCard, int dateOfCreation ){
		
		super(basePrice, brand, cylinderCapacity, mileage, vehicleState, plate, id,  soat, mechanicalTechnician, propertyCard, dateOfCreation);
		
		this.numberOfDoor =  numberOfDoor;
		
		this.tintedWindows =  tintedWindows;
		
		this.automobileType = automobileType;
		
	}
	
	public int getNumberOfDoor(){
		
		return numberOfDoor;
		
	}
	
	public boolean getTintedWindows(){
		
		return tintedWindows;
		
	}
	
	public AType getAutomobileType(){
		
		return automobileType;
		
	}
	
}