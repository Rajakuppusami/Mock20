import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException, ParseException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		//Your code goes here
		List<Cast> castList=new ArrayList<Cast>();
		CastBO castbo=new CastBO();
		System.out.println("Enter the number of casts:");
		//Your code goes here
		int n=Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			String castdetails = reader.readLine();
			String[] castdet=castdetails.split(",");
			Cast c=new Cast(castdet[0], castdet[1], castdet[2],formatter.parse(castdet[3]));
			castList.add(c);
		}
		System.out.println("Enter a search type:\n1.By Nationality\n2.By Date of Birth");
		//Your code goes here
		int choice=Integer.parseInt(reader.readLine());
		if(choice==1){
			System.out.println("Enter the nationality:");
			String nationality=reader.readLine();
			List<Cast> li=castbo.findCast(castList, nationality);
			if(li.isEmpty()){
				System.out.println("No such cast is present");
			}else{
				System.out.format("%-22s %-12s %-8s %s\n","Name","Nationality","Gender","DOB");
				for (Cast cast : li) {
					System.out.format("%-22s %-12s %-8s %s\n",cast.getName(),cast.getNationality(),cast.getGender(),formatter.format(cast.getDob()));
				}
			}
		}else if(choice==2){
			System.out.println("Enter the date of Birth:");
			Date dob=formatter.parse(reader.readLine());
			List<Cast> li=castbo.findCast(castList, dob);
			if(li.isEmpty()){
				System.out.println("No such cast is present");
			}else{
				System.out.format("%-22s %-12s %-8s %s\n","Name","Nationality","Gender","DOB");
				for (Cast cast : li) {
					System.out.format("%-22s %-12s %-8s %s\n",cast.getName(),cast.getNationality(),cast.getGender(),formatter.format(cast.getDob()));
				}
			}
		}else{
			System.out.println("Invalid choice");
		}

	}
}
