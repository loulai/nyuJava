package hw10Netflix;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Movie> list = new ArrayList<Movie>();
	
	public static void main(String[] args) {
		Inventory movieList = new Inventory();
		Movie birdman = new Movie("Birdman", 2014, 3.7);
		movieList.list.returnMovie("Birdman", 2014, 3.7);
		movieList.list.add(new Movie("Batman", 1989, 3.2));
		movieList.list.add(new Movie("King Kong", 1993, 3.8));
		
		System.out.println(movieList.list.get(2));
	}
	
//	public static boolean exists(ArrayList<Movie> arrayOfMovies, String otherMovieTitle, int otherMovieYear){
//		boolean exists = false;
//		for(int i =0; i < arrayOfMovies.size(); i++){
//			Movie m = arrayOfMovies.get(i);
//				if(m.getTitle().compareToIgnoreCase(otherMovieTitle) == 0 && (m.getYear() == otherMovieYear)){
//					exists = true;
//				} 
//		}
//		return exists;
//	}
	
//	public Inventory(){
//		
//	}
	
	public void returnMovie(String title, int year, double rating) throws IllegalArgumentException{ 
		for(int i = 0; i < list.size(); i++){
			Movie toBeReturned = matchMovie(title, year);
			if(list.contains(toBeReturned)){
				int moviePosition = list.indexOf(toBeReturned);
				list.get(moviePosition).increaseQuantity();
				list.get(moviePosition).setRating(rating);
				System.out.println("movie exists!");
			} else {
				Movie createdMovie = new Movie(title, year, rating);
				list.add(createdMovie);
				System.out.println("movie aint there, new one created");
			}
		}
	}
	
	public Movie matchMovie(String title, int year){
		Movie matchingMovie = null;
		for (int i = 0; i < list.size(); i++){
			if(this.list.get(i).getTitle() == title && this.list.get(i).getYear() == year){
				matchingMovie = this.list.get(i);
			}
		}
		return matchingMovie;
	}
	
	public void returnList(String title, int year, double rating){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).exists(title, year)){
				list.get(i).increaseQuantity();
				
				try{
					list.get(i).setRating(rating);
				} catch (IllegalArgumentException e){
					System.out.println("Doing Nothing...");
				}
			} else {
				Movie newMovie = new Movie(title, year, rating);
				list.add(newMovie);
			}
		}
	}
	
	
	public void rent(String title, int year){
		
	}
	
	

}
