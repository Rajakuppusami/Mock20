import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("Enter the number of movies");
		
		//write your code here
		
		List<Cast> temp=new ArrayList<>();
		temp=Cast.prefill(temp);
		SimpleDateFormat sdf=new SimpleDateFormat("");
		List<CastMovieAssignment> castAssignmentList=new ArrayList<CastMovieAssignment>();
		int n=Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String movieDetails = br.readLine();
			String[] movieDet=movieDetails.split(",");
			Movie m=new Movie();
			m.setName(movieDet[0]);
			m.setBoxoffice(Double.parseDouble(movieDet[1]));
			m.setBudget(Double.parseDouble(movieDet[2]));
			m.setRating(Double.parseDouble(movieDet[3]));
			m.setCastMovieAssignmentList(new ArrayList<CastMovieAssignment>());
			System.out.println("Enter the number of cast");
			int n1=Integer.parseInt(br.readLine());
			for (int j = 0; j < n1; j++) {
				String castDetails =br.readLine();
				String[] castDet =castDetails.split(",");
				Cast cobj=null;
				for(Cast cc :  temp){
					if(cc.getName().equals(castDet[0])){
						cobj=cc;
						break;
					}
				}
				CastMovieAssignment cmaObj=new CastMovieAssignment(Double.parseDouble(castDet[1]),castDet[2],m,cobj);
				m.getCastMovieAssignmentList().add(cmaObj);
				cobj.getCastMovieAssignmentList().add(cmaObj);
			}
			
		}
		
		for(Cast ccc: temp){
			System.out.println(ccc.getName());
			for(CastMovieAssignment cma : ccc.getCastMovieAssignmentList()){
				System.out.println(cma.getRole());
			}
			System.out.println(ccc.getCastMovieAssignmentList().size());
		}
	}
}
//			int n1=Integer.parseInt(br.readLine());
//			for (int j = 0; j < n1; j++) {
//				String castDetails =br.readLine();
//				String[] castDet =castDetails.split(",");
//				Cast c=new Cast();
//				CastMovieAssignment cma=new CastMovieAssignment();
//				c.setName(castDet[0]);
//				cma.setSalary(Double.parseDouble(castDet[1]));
//				cma.setRole(castDet[2]);
//				cma.setCast(c);
//				cma.setMovie(m);
//				castAssignmentList.add(cma);
//			}
//			 
//		}
//		List<Cast> li=new ArrayList<Cast>();
//		for (CastMovieAssignment castMovieAssignment : castAssignmentList) {
//			Cast cc=castMovieAssignment.getCast();
//			li.add(cc);
//		}
//		
//		List<Cast> castList = Cast.prefill(li);
//		TreeMap<String,Integer> tr=Cast.getActorWiseCount(castList);
//		System.out.printf("%-20s %s\n","Actor","Movie Count");
//		for(Map.Entry<String, Integer> entry :tr.entrySet())
//		{
//			System.out.printf("%-20s %s\n",entry.getKey(),entry.getValue());
//		}
//	}
//}