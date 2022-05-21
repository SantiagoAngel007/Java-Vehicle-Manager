package model;

public class MechanicalTechnician extends Document{

    private double gasLevels;

    public MechanicalTechnician(double docPrice, int year, int[][] image, double gasLevels){

        super(docPrice, year, image);

        this.gasLevels =  gasLevels;

    }

    /*
    @Override
    public void createMatrix(int[][] matrix){

    }
    */

    public double getGasLevels(){
        return gasLevels;
    }


    @Override
    public String toString() {

		return "**** MechanicalTechnician information ****\n" +
        "Gas levels: " + gasLevels + "\n" + 
		"Document price: " + super.getDocPrice() + "\n" +
		"Year: " + super.getYear() + "\n" ;
		//"Image: " + super.getImage() + "\n";
	}
    
}