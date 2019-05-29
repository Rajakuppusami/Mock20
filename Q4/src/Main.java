import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		MovieBO  mbo = new MovieBO();
		List<Movie> movielist = new ArrayList<Movie>();
		
		System.out.println("Enter the number of movies:");
		int num = Integer.parseInt(buff.readLine());
		
		//Movie m = new Movie();
		
		for(int i=0;i<num;i++) 
		{
			Movie m = Movie.createMovie(buff.readLine());
			movielist.add(m);
		}
		
		List<Movie> m = mbo.getSuccessMovies(movielist);
		
		if(m.isEmpty())
		{
			System.out.println("None of the movies are successful");
		}
		else
		{
			System.out.println("Successful movies are");
			System.out.format("%-22s %-10s %-8s %s\n","Name","Box Office","Budget","Rating");
		
			for(int i=0 ; i<m.size() ; i++)
			{
				System.out.format("%-22s %-10s %-8s %s\n",m.get(i).getName(),m.get(i).getBoxoffice(),m.get(i).getBudget(),m.get(i).getRating());
			}
		}
		
	}
}