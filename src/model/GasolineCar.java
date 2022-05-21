package model;

public class GasolineCar extends Automobile implements GasolineConsumer, CalculatePrice{
	
	private double tankCapacity;
	
	private GType gasolineType;
	
	public GasolineCar(double basePrice, String brand, double cylinderCapacity, double mileage, boolean vehicleState, String plate, int numberOfDoor, boolean tintedWindows, AType automobileType, double tankCapacity, GType gasolineType, int id, Document soat, Document mechanicalTechnician, Document propertyCard, int dateOfCreation ){
		
		super(basePrice, brand, cylinderCapacity, mileage, vehicleState, plate, numberOfDoor, tintedWindows, automobileType, id, soat, mechanicalTechnician, propertyCard, dateOfCreation );
		
		this.tankCapacity = tankCapacity;
		
		this.gasolineType = gasolineType;
		
		
	}
	
	
	@Override
	public double calculatePrice(){
		
		double calculate = super.getBasePrice();
		
		if(super.getVehicleState() == false){
			
			calculate = calculate -(super.getBasePrice()*0.1);
			
		}
		
		calculate = calculate + 500000;
		
		
		return calculate;
	}
	
	
	
	@Override
	public double gasolineConsume(){
		
		double consume = tankCapacity * (super.getCylinderCapacity()/150);
		
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
		"Sell price: " + calculatePrice() + "\n" +
		"Brand: " + super.getBrand() + "\n" +
		"Cylinder Capacity: " + super.getCylinderCapacity() + "\n" +
		"Mileage: " + super.getMileage() + "\n" +
		"The vehicle is new: " + super.getVehicleState() + "\n" +	
		"Plate: " + super.getPlate() + "\n" +
		"Number of doors " + super.getNumberOfDoor() + "\n" +
		"The vehicle has tinted windows " + super.getTintedWindows() + "\n" +
		"Automobile type " + super.getAutomobileType() + "\n" +
		"Tank capacity " + tankCapacity + "\n" +
		"Gasoline type " + gasolineType + "\n" +
		"Gasoline Car id " + super.getId() + "\n" +
		"Creation date " + super.getDateOfCreation() + "\n" +
		"Gasoline Consume " + gasolineConsume() + "\n";
	}
	
	
}