package model;

public class Hybrid extends Automobile implements BatteryCosumer, GasolineConsumer, CalculatePrice{
	
	private double tankCapacity;
	
	private GType gasolineType;
	
	private boolean chargerType;
	
	private double batteryDuration;
	
	public Hybrid(double basePrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int numberOfDoor, boolean tintedWindows, AType automobileType, double tankCapacity, GType gasolineType, boolean chargerType, double batteryDuration, int id, Document soat, Document mechanicalTechnician, Document propertyCard, int dateOfCreation ){
		
		super(basePrice, brand, cylinderCapacity, mileage, vehicleState, plate, numberOfDoor, tintedWindows, automobileType, id, soat, mechanicalTechnician, propertyCard, dateOfCreation );
		
		this.tankCapacity = tankCapacity;
		
		this.gasolineType = gasolineType;
		
		this.chargerType = chargerType;
		
		this.batteryDuration = batteryDuration;
		
	}
	
	
	@Override
	public double calculatePrice(){
		
		double calculate = super.getBasePrice();
		
		calculate = calculate + (super.getBasePrice()*0.15);
		
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
		
		consume =  (batteryDuration) * (super.getCylinderCapacity()/200);
		
		}else{
			
		consume =  (batteryDuration + 7) * (super.getCylinderCapacity()/200);	
			
		}
		
		return consume;
		
	}
	
	@Override
	public double gasolineConsume(){
		
		double consume = tankCapacity * (super.getCylinderCapacity()/180);
		
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
		"Sell price: " + calculatePrice() + "\n" +
		"Brand: " + super.getBrand() + "\n" +
		"Cylinder Capacity: " + super.getCylinderCapacity() + "\n" +
		"Mileage: " + super.getMileage() + "\n" +
		"The vehicle is new: " + super.getVehicleState() + "\n" +	
		"Plate: " + super.getPlate() + "\n" +
		"Number of doors: " + super.getNumberOfDoor() + "\n" +
		"The vehicle has tinted windows: " + super.getTintedWindows() + "\n" +
		"Automobile type: " + super.getAutomobileType() + "\n" +
		"Tank capacity: " + tankCapacity + "\n" +
		"Gasoline type: " + gasolineType + "\n"+
		"The vehicle has a fast charger: " + chargerType + "\n" +
		"Battery Duration: " + batteryDuration + "\n"+
		"Battery Consume: " + batteryCosume() + "\n" +
		"Hybrid Car id " + super.getId() + "\n" +
		"Creation date " + super.getDateOfCreation() + "\n" +
		"Gasoline Consume: " + gasolineConsume() + "\n";
	}
	
	
}