package model;

public abstract class  Document{
	
	private double docPrice;
	
	private int year;
	
	private int image;
	
	public Document( double docPrice, int year, int image){
		
		this.docPrice = docPrice;
		
		this.year =  year;
		
		this.image = image;
		
	}
	
	
}