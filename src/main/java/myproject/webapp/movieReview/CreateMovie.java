package myproject.webapp.movieReview;

import java.util.ArrayList;
import java.util.List;

public class CreateMovie {
	static List<Movies> m1=null;
	public static void addMovies(){
		m1.add(new Movies("Saaho"));
		m1.add(new Movies("Article 15"));
		m1.add(new Movies("Mission Mangal"));
		m1.add(new Movies("Batla house"));
		m1.add(new Movies("Kabir singh"));
		m1.add(new Movies("Bharat"));
		m1.add(new Movies("Kalank"));
		m1.add(new Movies("Kesari"));
	}
	public static List<Movies> movieList(){
		if (m1==null){
			m1=new ArrayList<Movies>();
			addMovies();
			return m1;
		}
		return m1;
	}
}
