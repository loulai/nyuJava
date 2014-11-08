package hw7;

public class TestMovie {
	
	public static void main(String[] args) {
		Movie m1 = new Movie(); //testing default constructor
		Movie m2 = new Movie("Game of Thrones The Movie", 120, 2015, 5.0); //perfect entry
		Movie m3 = new Movie("Shrek 16", 65, 2012, -5.0); //invalid rating (negative)
		Movie m4 = new Movie("Baseball Sucks", 32, 1999, 6.0);  //invalid rating (exceeds 4.0)
		Movie m5 = new Movie("The Myth of Pandas", 65, -1, 2.3 ); //invalid year (negative)
		Movie m6 = new Movie("What is a Tree", 45, 10000, 3.4); //invalid year (too far in the future, when there are 5 characters required in the year. i.e. > year 9999)
		Movie m7 = new Movie("The Heat of Ice", -120, 1850, 2.4); //invalid duration (negative)
		Movie m8 = new Movie("Russia Becomes A Democracy", 6767, 2018, 1.8); //invalid duration (when minutes are greater than 3 characters, i.e. > 999 minutes)
		Movie m9 = new Movie("The Anti-Movie", -190, -1969, -0.5); //invalid everything (negative duration, negative year, negative rating)
		Movie m10 = new Movie("Zeros are No Heroes", 0, 0, 0); //zero everything (duration, year, rating)
		
		Movie[] moviesList = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10};
		
		printMovies(moviesList);
	}
	
	public static void printMovies(Movie[] arrayOfMovies){
		for(int i = 0; i < arrayOfMovies.length; i++){
			System.out.println(arrayOfMovies[i]);
		}
	}
}

