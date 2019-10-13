package myproject.webapp.movieReview;

import java.util.ArrayList;

import javax.json.bind.annotation.JsonbAnnotation;
import javax.xml.bind.annotation.XmlRootElement;
@JsonbAnnotation
public class Movies {
	String movieName;
	int rating;
	ArrayList<String> comments;
	public Movies(){
		
	}
	public Movies(String movieName) {
		super();
		this.movieName = movieName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	
	
}
