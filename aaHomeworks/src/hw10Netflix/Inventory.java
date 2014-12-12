package hw10Netflix;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Movie> list = new ArrayList<Movie>();
	
	public static void main(String[] args) {
		Inventory movieList = new Inventory();
		Movie birdman = new Movie("Birdman", 2014, 3.7);
		movieList.list.remove("Birdman", 2014, 3.7);
		movieList.list.add(new Movie("Batman", 1989, 3.2));
		movieList.list.add(new Movie("King Kong", 1993, 3.8));
		
		System.out.println(movieList.list.get(2));
	}
	
	public void add(String title, int year, double rating){ 
		try{
			for(int i = 0; i < list.size(); i++){
				if(this.containsMovie(title, year)){
					Movie matchingMovie = this.list.get(i);
					matchingMovie.increaseQuantity(); //must be above setRating() because has to execute before the likelyhood of throwing and exception
					matchingMovie.setRating(rating);
				} else {
						list.add(new Movie(title, year, rating));	
				}
			}
		} catch(IllegalArgumentException e){}
	}
	
	public void rent(String title, int year, double rating){ 
		try{
			for(int i = 0; i < list.size(); i++){
				if(this.containsMovie(title, year)){ //at this point the movie EXISTS in the inventory
					Movie matchingMovie = this.list.get(i); 
					if(matchingMovie.getQuantity() == 1){ //the movie both EXISTS and there is only one of it, so remove it
						list.remove(matchingMovie); 
					} else { //the movie EXISTS and there are more than one of it, so decrease quantity instead of remove
						matchingMovie.decreaseQuantity();
					}
					matchingMovie.setRating(rating);
				} else {
						list.add(new Movie(title, year, rating));	
				}
			}
		} catch(IllegalArgumentException e){}
	}
	
	public boolean containsMovie(String title, int year){
		boolean isInInventory = false;
		for (int i = 0; i < list.size(); i++){
			if(this.list.get(i).getTitle() == title && this.list.get(i).getYear() == year){
				isInInventory = true;
			} 
		}
		return isInInventory;
	}
	
//	public void returnList(String title, int year, double rating){
//		for(int i = 0; i < list.size(); i++){
//			if(list.get(i).exists(title, year)){
//				list.get(i).increaseQuantity();
//				
//				try{
//					list.get(i).setRating(rating);
//				} catch (IllegalArgumentException e){
//					System.out.println("Doing Nothing...");
//				}
//			} else {
//				Movie newMovie = new Movie(title, year, rating);
//				list.add(newMovie);
//			}
//		}
//	}
	
	
	public void rent(String title, int year){
		
	}
	
	

}
