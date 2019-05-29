import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie
{
	private String name;
	private Double boxoffice;
	private Double budget;
	private Double rating;
	
	
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
	
	public Movie()
	{
		
	}
	public Movie(String name, Double boxoffice, Double budget, Double rating) {
		super();
		this.name = name;
		this.boxoffice = boxoffice;
		this.budget = budget;
		this.rating = rating;
	}	
	/*@Override
	public String toString() 
	{
		return "Name: "+name+"\nBox Office: "+boxoffice+"\nBudget: "+budget+"\nRating: "+rating;
	}*/
	
	public static Movie createMovie(String detail)
	{
		String[] foo = detail.split(",");
		
		Movie m = new Movie(foo[0],Double.parseDouble(foo[1]),Double.parseDouble(foo[2]),Double.parseDouble(foo[3]));
		return m;
	}
}