package hw10Netflix;

public class Movie {
	
	private String title;
	private int year;
	private double rating;

	public static void main(String[] args) {

	}
	
	public Movie(String title, int year, double rating){
//		throws IllegalArgumentException;
		this.title = title;
		this.rating = rating
		if(year >= 1870 && year <= 2014) this.year = year;
		else throw new IllegalArgumentException("Invalid Year");
	}
	
	public void setYear(int year){
		if(year >= 1870 && year <= 2014) this.year = year;
	}
	//else throw newIllegalArgumentException("Invalid YEar");

}
