package model;

public abstract class  Vehicle{
	
	private double basePrice;
	
	private String brand;
	
	private double cylinderCapacity;
	
	private double mileage;
	
	private boolean vehicleState;
	
	private String plate;
	
	private int id;
	
	private Document soat;
	
	private Document mechanicalTechnician;
	
	private Document propertyCard;

	private int dateOfCreation;
	
	
	public Vehicle(double basePrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int id, Document soat, Document mechanicalTechnician, Document propertyCard, int dateOfCreation ){
		
		this.basePrice = basePrice;
		
		this.id =  id;
		
		this.brand =  brand;
		
		this.cylinderCapacity =  cylinderCapacity;
		
		this.mileage =  mileage;
		
		this.vehicleState =  vehicleState;
		
		this.plate = plate;

		this.soat = soat;

		this.mechanicalTechnician = mechanicalTechnician;

		this.propertyCard = propertyCard;

		this.dateOfCreation = dateOfCreation;
		
	}
	
	
	public double getBasePrice(){
		
		return basePrice;
	}
	
	public int getId(){
		
		return id;
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

	public Document getSoat(){
		
		return soat;
	}

	public Document getMechanicalTechnician(){
		
		return mechanicalTechnician;
	}

	public Document getPropertyCard(){
		
		return propertyCard;
	}

	public int getDateOfCreation(){
		
		return dateOfCreation;
	}
	
}