package hw10Netflix;

public class Movie {
	
	private String title;
	private int year;
	private double rating;

	public static void main(String[] args) {

	}
	
	public Movie(String title, int year, double rating) throws IllegalArgumentException{
		this.title = title;
		this.rating = rating;
		setYear(year);
	}
	
	public void setYear(int year) throws IllegalArgumentException{
		if(year >= 1870 && year <= 2014) this.year = year;
		else throw new IllegalArgumentException("Invalid Year");
	}

}