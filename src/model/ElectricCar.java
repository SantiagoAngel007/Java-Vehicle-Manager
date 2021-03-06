package model;

public class ElectricCar extends Automobile implements BatteryCosumer, CalculatePrice{
	
	private boolean chargerType;
	
	private double batteryDuration;
	
	public ElectricCar(double basePrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int numberOfDoor, boolean tintedWindows, AType automobileType, boolean chargerType, double batteryDuration, int id, Document soat, Document mechanicalTechnician, Document propertyCard, int dateOfCreation ){
		
		super(basePrice, brand, cylinderCapacity, mileage, vehicleState, plate, numberOfDoor, tintedWindows, automobileType, id, soat, mechanicalTechnician, propertyCard, dateOfCreation );
		
		this.chargerType = chargerType;
		
		this.batteryDuration = batteryDuration;
		
	}
	
	
	@Override
	public double calculatePrice(){
		
		double calculate = super.getBasePrice();
		
		calculate = calculate + (super.getBasePrice()*0.2);
		
		if(super.getVehicleState() == false){
			
			calculate = calculate -(super.getBasePrice()*0.1);
			
		}
		
		calculate = calculate + 500000;
		
		
		return calculate;
	}
	
	
	@Override
	public double batteryCosume(){
		
		double consume = 0;
		
		if(chargerType == true){
		
		consume =  (batteryDuration + 13) * (super.getCylinderCapacity()/100);
		
		}else{
			
		consume =  (batteryDuration + 18) * (super.getCylinderCapacity()/100);	
			
		}
		
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
		"Sell price: " + calculatePrice() + "\n" +
		"Brand: " + super.getBrand() + "\n" +
		"Cylinder Capacity: " + super.getCylinderCapacity() + "\n" +
		"Mileage: " + super.getMileage() + "\n" +
		"The vehicle is new: " + super.getVehicleState() + "\n" +	
		"Plate: " + super.getPlate() + "\n" +
		"Number of doors: " + super.getNumberOfDoor() + "\n" +
		"The vehicle has tinted windows: " + super.getTintedWindows() + "\n" +
		"Automobile type: " + super.getAutomobileType() + "\n" +
		"The vehicle has a fast charger: " + chargerType + "\n" +
		"Battery Duration: " + batteryDuration + "\n" +
		"Electric Car id " + super.getId() + "\n" +
		"Creation date " + super.getDateOfCreation() + "\n" +
		"Battery Consume: " + batteryCosume() + "\n";
	}

	
}