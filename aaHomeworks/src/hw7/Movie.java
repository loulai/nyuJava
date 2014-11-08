package hw7;

public class Movie {
	
	private String title;
	private int duration;
	private int releaseYear;
	private double rating;
	
	public Movie() {
		this("No Title", 120, 2014, 0.0);
	}
	
	public Movie(String title, int duration, int releaseYear, double rating){
		this.setTitle(title);
		this.setDuration(duration);
		this.setReleaseYear(releaseYear);
		this.setRating(rating);
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration(int newDuration){
		if(newDuration > 0 && newDuration < 999) {
			this.duration = newDuration;
		} else {
			System.out.printf("Error: Invalid duration of %4d minutes for \"%s\"\n", newDuration, this.title);
		}
	}
	
	public int getReleaseYear(){
		return releaseYear;
	}
	
	public void setReleaseYear(int newReleaseYear) {
		if(newReleaseYear <= 0 || newReleaseYear > 9999) {
			System.out.printf("Error: Invalid year %5d for \"%s\"\n", newReleaseYear, this.title);
		} else {
			this.releaseYear = newReleaseYear;
		}
	}
	
	public double getRating(){
		return rating;
	}
	
	public void setRating(double newRating){
		if(newRating < 0 || newRating > 4) {
			System.out.printf("Error: Invalid rating of %.2f for \"%s\"\n", newRating, this.title);
		} else {
			this.rating = newRating;
		}
	}
	
	public String toString() {
		return String.format("=== %-25s (%.2f) ===\n Released: %4d\n Duration: %-4dmins\n", 
				title, rating, releaseYear, duration);
	}
}
