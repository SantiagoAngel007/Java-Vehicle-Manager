package model;

public class Soat extends Document{

    private double coverageAmount;

    public Soat(double docPrice, int year, int[][] image, double coverageAmount){

        super(docPrice, year, image);

        this.coverageAmount =  coverageAmount;

    }

    /*
    @Override
    public void createMatrix(int[][] matrix){

    }
    */

    public double getCoverageAmount(){
        return coverageAmount;
    }
    


    @Override
    public String toString() {

		return "**** Soat information ****\n" + 
        "Coverage Amount: " + coverageAmount + "\n" +
		"Document Price: " + super.getDocPrice() + "\n" +
		"Year: " + super.getYear() + "\n" ;
		//"Image: " + super.getImage() + "\n";
	}

}
    
