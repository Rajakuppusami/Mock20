import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String []args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Your code goes here...
		
		System.out.println("Enter movie 1 detail:");
		String strMovieDetail1 = reader.readLine();
		String[] strValue = strMovieDetail1.split(",");
		Movie m1 =new Movie(strValue[0], Double.parseDouble(strValue[1]), Double.parseDouble(strValue[2]), Double.parseDouble(strValue[3]));
		
		System.out.println("Enter movie 2 detail:");
		//Your code goes here...
		String strMovieDetail2 = reader.readLine();
		String[] strValue2 = strMovieDetail2.split(",");
		Movie m2 =new Movie(strValue2[0], Double.parseDouble(strValue2[1]), Double.parseDouble(strValue2[2]), Double.parseDouble(strValue2[3]));
		
		System.out.println();
		System.out.println("Movie 1");
		System.out.println(m1);
		System.out.println();
		System.out.println("Movie 2");
		System.out.println(m2);
		System.out.println();
		
		
		if(m1.equals(m2)){
			System.out.println("Movie 1 is same as Movie 2");
		}else{
			System.out.println("Movie 1 and Movie 2 are different");
		}
	}
}
