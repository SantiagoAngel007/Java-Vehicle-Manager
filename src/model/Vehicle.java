package model;

public abstract class  Vehicle{
	
	private double basePrice;
	
	private double sellPrice;
	
	private String brand;
	
	private double cylinderCapacity;
	
	private double mileage;
	
	private boolean vehicleState;
	
	private String plate;
	
	private Document soat;
	
	private Document mechanicalTechnician;
	
	private Document propertyCard;
	
	
	public Vehicle(double basePrice, double sellPrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate){
		
		this.basePrice = basePrice;
		
		this.sellPrice =  sellPrice;
		
		this.brand =  brand;
		
		this.cylinderCapacity =  cylinderCapacity;
		
		this.mileage =  mileage;
		
		this.vehicleState =  vehicleState;
		
		this.plate = plate;
		
	}
	
	
	public double getBasePrice(){
		
		return basePrice;
	}
	
	public double getSellPrice(){
		
		return sellPrice;
	}
	
	public String getBrand(){
		
		return brand;
	}
	
	public double getCylinderCapacity(){
		
		return cylinderCapacity;
	}
	
	public double getMileage(){
		
		return mileage;
	}
	
	public boolean getVehicleState(){
		
		return vehicleState;
	}
	
	public String getPlate(){
		
		return plate;
	}
	
}