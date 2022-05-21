package model;

public class PropertyCard extends Document{

    public PropertyCard(double docPrice, int year, int[][] image){

        super(docPrice, year, image);

    }

    
    /*
    public void decodePro(int[][] matrix){

    }
    */

    @Override
    public String toString() {

		return "**** PropertyCard information ****\n" + 
		"Document Price: " + super.getDocPrice() + "\n" +
		"Year: " + super.getYear() + "\n" ;
		//"Image: " + super.getImage() + "\n"
	}


}