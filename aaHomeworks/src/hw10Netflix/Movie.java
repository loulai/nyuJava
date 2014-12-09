package hw10Netflix;
import java.util.ArrayList;

public class Movie{
	
	private String title;
	private int year;
	private double rating;
	private int quantity = 0;
	

	public static void main(String[] args) {
		Movie jelly = new Movie("Adventures of Mr. Bean", 1994, 4.0);
		System.out.println(jelly);
	}
	
	public Movie(String title, int year, double rating) throws IllegalArgumentException{
		this.quantity++;
		this.title = title;
		setRating(rating);
		setYear(year);
	}
	
	public void setYear(int year) throws IllegalArgumentException{
		if(year >= 1870 && year <= 2014) this.year = year;
		else throw new IllegalArgumentException("Invalid Year");
	}
	
	@Override
	public String toString() {
		return String.format("%-10s (%-4d), rating: %2.1f, number in stock: %4d", title, year, rating, quantity);
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public void setRating(double otherRating) {
		if(otherRating >= 0.0 && otherRating <= 4.0) this.rating = otherRating;
		else throw new IllegalArgumentException("Invalid Rating");
	}
	
	public void increaseQuantity() throws IllegalArgumentException{
		this.quantity ++;
	}
	
	

}

/*
 * System.out.print(); 
 * -------
 * PrintWrite pr=new PrintWriter();
 * pr.print();
 */
