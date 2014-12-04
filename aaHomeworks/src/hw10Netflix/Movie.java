package hw10Netflix;

public class Movie {
	
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
		this.rating = rating;
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

}

/*
 * System.out.print(); 
 * -------
 * PrintWrite pr=new PrintWriter();
 * pr.print();
 */
