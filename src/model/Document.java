package model;

public abstract class Document{
	
	private double docPrice;
	
	private int year;
	
	protected int[][] image;
	
	public Document( double docPrice, int year, int[][] image){
		
		this.docPrice = docPrice;
		
		this.year =  year;
		
		this.image = image;
		
	}
	
	
	public double getDocPrice(){
		return docPrice;
	}

	public int getYear(){
		return year;
	}

	public int[][] getImage(){
		return image;
	}

	
	public String toString(){
		return "**** PropertyCard information ****\n" + 
		"Base price: " + docPrice + "\n" +
		"Sell price: " + year + "\n" +
		"Gasoline Consume " + image + "\n";
	}
	
	
	

}