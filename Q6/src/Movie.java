import java.util.List;

public class Movie {
	//Your code here
	private String name;
	private Double boxoffice;
	private Double budget;
	private Double rating;
	private List<CastMovieAssignment>castMovieAssignmentList;
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
	public List<CastMovieAssignment> getCastMovieAssignmentList() {
		return castMovieAssignmentList;
	}
	public void setCastMovieAssignmentList(List<CastMovieAssignment> castMovieAssignmentList) {
		this.castMovieAssignmentList = castMovieAssignmentList;
	}
	public Movie(String name, Double boxoffice, Double budget, Double rating,
			List<CastMovieAssignment> castMovieAssignmentList) {
		super();
		this.name = name;
		this.boxoffice = boxoffice;
		this.budget = budget;
		this.rating = rating;
		this.castMovieAssignmentList = castMovieAssignmentList;
	}
	public Movie() {
		super();
	}
	
}
