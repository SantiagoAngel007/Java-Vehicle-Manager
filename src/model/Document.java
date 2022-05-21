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

	/*
	public void createMatrix(int[][] matrix){

		for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					int num = (int)(Math.random()*(100)+1);
					matrix[i][j]=num;
					numericMatrices.add(newMatrix);
			}
		}
	}
	*/
	
	
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
	
	

		
	/*
	return "**** Documents information ****\n" + 
		"Base price: " + docPrice + "\n" +
		"Sell price: " + year + "\n" +
		"Gasoline Consume " + year + "\n";
	*/
	

}