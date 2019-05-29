import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of movies");
		//Your code here
		Integer n = Integer.parseInt(br.readLine());
		List<Cast> castList = Cast.prefill();
		for (int i = 0; i < n; i++) {
			String movieDetails=br.readLine();
			String[] movieArr= movieDetails.split(",");
			Movie movie = new Movie();
			movie.setName(movieArr[0]);
			movie.setBoxoffice(Double.parseDouble(movieArr[1]));
			movie.setBudget(Double.parseDouble(movieArr[2]));
			movie.setRating(Double.parseDouble(movieArr[3]));
			movie.setCastMovieAssignmentList(new ArrayList<CastMovieAssignment>());
			System.out.println("Enter the number of cast");
			Integer castCount = Integer.parseInt(br.readLine());
			for (int j = 0; j < castCount; j++) {
				String castDetails = br.readLine();
				String[] castArr=castDetails.split(",");
				Cast cast=null;
				for (Cast castElement : castList) {
					if(castElement.getName().equals(castArr[0]))
					{
						cast=castElement;
						break;
					}
				}
				CastMovieAssignment cma=new CastMovieAssignment();
				cma.setSalary(Double.parseDouble(castArr[1]));
				cma.setRole(castArr[2]);
				cma.setCast(cast);
				cma.setMovie(movie);
				cast.getCastMovieAssignmentList().add(cma);
				movie.getCastMovieAssignmentList().add(cma);
			}
		}
		System.out.println();
		CastMovieAssignment cma=Cast.getTopActor(castList);
		System.out.println("The top paid actor is "+cma.getCast().getName()+" for "+cma.getMovie().getName());
	}
}
