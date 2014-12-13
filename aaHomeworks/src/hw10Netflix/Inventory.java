package hw10Netflix;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

	private ArrayList<Movie> list = new ArrayList<Movie>();
	
	public static void main(String[] args) {
		Inventory movieList = new Inventory();
		
		/*
		 * Begin section: reading text file and populating movieList
		 */
		java.io.File moviesDB = new java.io.File("/Users/louiselai/Desktop/Programming/workspace/aaHomeworks/bin/hw10Netflix/movies_db.txt"); //fetching the correct file
		
		try{ //surrounding the entire thing for the input potentially not existing, because of the file not existing
			Scanner input = new Scanner(moviesDB);  //new scanner object using text file 
			for(int i = 0; i < 16; i++){ //16 movies in the text file
				try { //for the year/rating potential errors.
					String movieDetails = input.nextLine(); //capturing one whole line in the text file as a String
					String movieTitle = movieDetails.split(" - ")[0]; //using REGEX, splitting the string where " - " is present. Returns an array, so the first one is always the title
					int movieYear = Integer.parseInt(movieDetails.split(" - ")[1]); //splitting and storing, this time the movie year. Parsing as int, because is will be a String otherwise
					double movieRating = Double.parseDouble(movieDetails.split(" - ")[3]); //same, except parsing as double. Skipped duration ([2]) because its not needed
					movieList.list.add(new Movie(movieTitle, movieYear, movieRating)); //finally, creating the new Movie object after all the relevant fields are extracted from the text file
				} catch (IllegalArgumentException e) { //handling possible exceptions from setting the year/rating
					System.out.println("found an exception from the text file");
				} 
			} 
		} catch (FileNotFoundException e1) {
			System.out.println("==whoops, file not found==");
		}
		/*
		 * End section: reading text file and populating movieList
		 * Begin section: adding more movies
		 */
		
		movieList.addMovie("Bears", 2014, 3.5);
		movieList.addMovie("Bears", 2014, 2.0);
		
		System.out.println(movieList);

	}
	
	public void addMovie(String otherTitle, int otherYear, double otherRating) throws IllegalArgumentException{ 
		try{
			/* loop #1 tests each movie to see if it matches. if it does, then the quantity is incremented */
			for(int i = 0; i < this.list.size(); i++){ 
					if(this.list.get(i).getTitle().equalsIgnoreCase(otherTitle) && this.list.get(i).getYear() == otherYear){ //match the title and year
						Movie matchingMovie = this.list.get(i); //fetching the movie that already exists
						matchingMovie.increaseQuantity();       //incrementing quantity and resetting rating (if the value is legit)
						matchingMovie.setRating(otherRating);
						return; //stops method once a match is found
					}
			}
			
			//Method will only progress to this point if there is NO match
			/* loop #2 tests each movie to see if it DOESNT match. If it doesn't, it adds the movie.  */
			for(int i = 0; i < this.list.size(); i++){
				if (!this.list.get(i).getTitle().equalsIgnoreCase(otherTitle) || this.list.get(i).getYear() != otherYear){
					this.list.add(new Movie(otherTitle, otherYear, otherRating));
					return; //stops once
				}
			}
			
		} catch(IllegalArgumentException e){} //handling exceptions from rate/year
	}
	
	
	
//	
//	public boolean containsMovie(String title, int year){
//		boolean isInInventory = false;
//		for (int i = 0; i < list.size(); i++){
//			if(this.list.get(i).getTitle().equals(title) && this.list.get(i).getYear() == year){
//				isInInventory = true;
//			} 
//		}
//		return isInInventory;
//	}
	
//	if(this.containsMovie(otherTitle, otherYear)){ //if the movie exists in the inventory
//		Movie matchingMovie = this.list.get(i);
//		System.out.println(matchingMovie.getTitle() + " " + matchingMovie.getQuantity());
//		matchingMovie.increaseQuantity(); //must be above setRating() because has to execute before the likelyhood of throwing and exception
//		matchingMovie.setRating(rating);
//		System.out.println(matchingMovie.getTitle() + " " + matchingMovie.getQuantity());
//	} else { //if it doesn't exist
//		System.out.println("HOALLAALALA");
//			list.add(new Movie(otherTitle, otherYear, rating));	
//	}

	
	
	
	
	
	
	
//	public void rentMovie(String title, int year, double rating){ 
//		try{
//			for(int i = 0; i < list.size(); i++){
//				if(this.containsMovie(title, year)){ //at this point the movie EXISTS in the inventory (containsMovie() method below)
//						Movie matchingMovie = this.list.get(i); //fetching the movie
//					if(matchingMovie.getQuantity() == 1){ //the movie both EXISTS and there is only one of it, so remove it
//						list.remove(matchingMovie); //note: the rating is not reset because it wasn't in the instructions
//					} else { //the movie EXISTS and there are more than one of it, so decrease quantity instead of remove
//						matchingMovie.decreaseQuantity();
//						matchingMovie.setRating(rating); //reset rating
//						
//					}
//				} else { //if movie DOESNT exist, add it to inventory
//						list.add(new Movie(title, year, rating));	
//				}
//			}
//		} catch(IllegalArgumentException e){} //if an exception is thrown (like invalid year or rating), do nothing
//	}
	
	public String toString(){
		String finalString = "====================== LOOK AT ALL THESE MOVIES I HAVE NO TIME TO WATCH =======================\n";
		for(int i = 0; i < this.list.size(); i ++){
			finalString = finalString + String.format("%3d. %-36s (%-4d), rating: %2.1f, number in stock: %3d \n", (i + 1),  list.get(i).getTitle(), list.get(i).getYear(), list.get(i).getRating(), list.get(i).getQuantity());
		}
		return finalString;
	}

}

//if(this.list.size() == 0){ //for the very first time adding anything, when movieList is empty
//this.list.add(new Movie(title, year, rating));
//}

//movieList.addMovie("Star Wars - A New Hope", 1997, 3.8);
//movieList.addMovie("Casablanca", 1942, 3.9);
//movieList.addMovie("Duck Soup", 1933, 3.75);
