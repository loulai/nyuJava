package hw7;

public class Movie {
	
	private String title;
	private int duration;
	private int releaseYear;
	private double rating;
	
	public Movie() {
		this("No Title", 120, 2014, 0.0);
	}
	
	public Movie(String title, int duration, int releaseYear) {
		this(title, duration, releaseYear, 0.0);
	}
	
	public Movie(String title, int duration, int releaseYear, double rating){
		this.title = title;
		this.duration = duration;
		this.releaseYear = releaseYear;
		this.rating = rating;
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
		this.duration = newDuration;
	}
	
	public int getReleaseYear(){
		return releaseYear;
	}
	
	public void setReleaseYear(int newReleaseYear) {
		this.releaseYear = newReleaseYear;
	}
	
	public double getRating(){
		return rating;
	}
	
	public void setRating(double newRating){
		if(this.rating < 0.0 || this.rating > 4.0) {
			System.out.println("Invalid rating input");
		} else {
			this.rating = newRating;
		}
	}
	
//	public String toString() {
//		return String.format(format, args)
//	}
}
