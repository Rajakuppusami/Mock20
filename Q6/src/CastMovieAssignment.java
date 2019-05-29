
public class CastMovieAssignment implements Comparable<CastMovieAssignment>{
	//Your code here
	private Double salary;
	private String role;
	private Movie movie;
	private Cast cast;
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Cast getCast() {
		return cast;
	}
	public void setCast(Cast cast) {
		this.cast = cast;
	}
	public CastMovieAssignment(Double salary, String role, Movie movie, Cast cast) {
		super();
		this.salary = salary;
		this.role = role;
		this.movie = movie;
		this.cast = cast;
	}
	public CastMovieAssignment() {
		super();
	}
	@Override
	public int compareTo(CastMovieAssignment o) {
		return (int) (this.getSalary()-o.getSalary());
	}
	
}
