package hw10Netflix;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public static void main(String[] args) {
	}
	
	public void returnList(String title, int year, double rating){
		for(int i = 0; i < movies.size(); i++){
			if(movies.get(i).exists(title, year)){
				movies.get(i).increaseQuantity();
				
				try{
				movies.get(i).setRating(rating);
				} catch (IllegalArgumentException e){
					System.out.println("Doing Nothing...");
				}
			} else {
				Movie newMovie = new Movie(title, year, rating);
				movies.add(newMovie);
			}
		}
	}
	
	public void rent(String title, int year){
		if()
	}

}
