import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Your code goes here...
		System.out.println("Enter the number of movies:");
		//Your code goes here...
		int n=Integer.parseInt(br.readLine());
		DecimalFormat df =new DecimalFormat("#.00");
		List<Movie> movieList=new ArrayList<Movie>();
		Movie movie =new Movie();
		for (int i = 0; i < n; i++) {
			String details = br.readLine();
			movieList.add(movie.createMovie(details));
		}
		List<Movie> li=movie.getTopFilms(movieList);
		System.out.format("%-22s %-10s %-8s %s\n","Name","Box Office","Budget","Rating");
		for (Movie movie2 : li) {
			System.out.format("%-22s %-10s %-8s %s\n",movie2.getName(),df.format(movie2.getBoxoffice()),df.format(movie2.getBudget()),df.format(movie2.getRating()));
		}
		
	}
}
