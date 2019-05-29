import java.util.ArrayList;
import java.util.List;

public class MovieBO 
{
	public List<Movie> getSuccessMovies(List<Movie> movieList)
	{
		List<Movie> successfulMovies = new ArrayList<Movie>();
		
		double profit;
		for(int i=0 ; i<movieList.size() ; i++)
		{
			profit = movieList.get(i).getBoxoffice() - movieList.get(i).getBudget();
			
			if(profit >= (movieList.get(i).getBudget()/2))
			{
				successfulMovies.add(movieList.get(i));
			}
		}
		return successfulMovies;
	}
}