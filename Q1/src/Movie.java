import java.text.DecimalFormat;

public class Movie {
	//Your code goes here...
	private String name;
	private Double boxoffice;
	private Double budget;
	private Double rating;
	DecimalFormat df=new DecimalFormat("#.00");
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
	@Override
	public String toString() {
		
		return "Name: " + name + "\nBox Office: " + df.format(boxoffice) + "\nBudget: " + df.format(budget) + "\nRating: " + df.format(rating);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equalsIgnoreCase(other.name))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		return true;
	}
}
