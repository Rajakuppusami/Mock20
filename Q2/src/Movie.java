import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie>{
	//Your code goes here...
	private String name;
	private Double boxoffice;
	private Double budget;
	private Double rating;
	public Movie(String name, Double boxoffice, Double budget, Double rating) {
		super();
		this.name = name;
		this.boxoffice = boxoffice;
		this.budget = budget;
		this.rating = rating;
	}
	public Movie() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBoxoffice() {
		return boxoffice;
	}
	public void setBoxoffice(Double boxoffice) {
		this.boxoffice = boxoffice;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public static List<Movie> getTopFilms(List<Movie> movieList){
		//Your code goes here...
		List<Movie> li=new ArrayList<Movie>();
		Collections.sort(movieList);
		for(int i=movieList.size()-1,j=0;i>-1 && j<5;i--,j++){
			li.add(movieList.get(i));
		}
		return li;
	}
	public static Movie createMovie(String movie) throws ParseException{
		//Your code goes here...
		String[] movieDetails=movie.split(",");
		Movie m = new Movie(movieDetails[0], Double.parseDouble(movieDetails[1]), Double.parseDouble(movieDetails[2]), Double.parseDouble(movieDetails[3]));
		return m;
	}
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		int result=0;
		if(this.rating==o.getRating())
			result=0;
		else if(this.rating > o.getRating())
			result=1;
		else if(this.rating < o.getRating())
			result=-1;
		return result;
	}
}
