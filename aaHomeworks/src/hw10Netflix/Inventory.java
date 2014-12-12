package hw10Netflix;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Movie> list = new ArrayList<Movie>();
	
	public static void main(String[] args) {
		Inventory movieList = new Inventory();
		Movie birdman = new Movie("Birdman", 2014, 3.7);
		movieList.rentMovie("Birdman", 2014, 3.0);
		movieList.addMovie("Batman", 1989, 3.2);
		movieList.addMovie("King Kong", 1993, 3.8);
		System.out.println("hello");
		System.out.println(movieList.list.size());
		System.out.println(movieList);
		System.out.println("helloq");
	}
	
	public void addMovie(String title, int year, double rating){ 
		try{
			if(this.list.size() == 0){ //for the very first time adding anything
				this.list.add(new Movie(title, year, rating));
			}
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
	
	public void rentMovie(String title, int year, double rating){ 
		try{
			for(int i = 0; i < list.size(); i++){
				if(this.containsMovie(title, year)){ //at this point the movie EXISTS in the inventory (containsMovie() method below)
						Movie matchingMovie = this.list.get(i); //fetching the movie
					if(matchingMovie.getQuantity() == 1){ //the movie both EXISTS and there is only one of it, so remove it
						list.remove(matchingMovie); //note: the rating is not reset because it wasn't in the instructions
					} else { //the movie EXISTS and there are more than one of it, so decrease quantity instead of remove
						matchingMovie.decreaseQuantity();
						matchingMovie.setRating(rating); //reset rating
					}
				} else { //if movie DOESNT exist, add it to inventory
						list.add(new Movie(title, year, rating));	
				}
			}
		} catch(IllegalArgumentException e){} //if an exception is thrown (like invalid year or rating), do nothing
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
	
	public String toString(){
		String finalString = "================== LOOK AT ALL THESE MOVIES ==================\n";
		for(int i = 0; i < this.list.size(); i ++){
			finalString = finalString + String.format("%3d. %-10s (%-4d), rating: %2.1f, number in stock: %4d \n", (i + 1),  list.get(i).getTitle(), list.get(i).getYear(), list.get(i).getRating(), list.get(i).getQuantity());
		}
		return finalString;
	}

	
	

}
