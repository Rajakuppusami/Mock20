import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CastBO {
	public List<Cast> findCast(List<Cast> castList,String nationality){
		//Your code goes here
		List<Cast> li=new ArrayList<Cast>();
		for (Cast cast : castList) {
			if(cast.getNationality().equals(nationality)){
				li.add(cast);
			}
		}
		return li;
	}
	
	public List<Cast> findCast(List<Cast> castList,Date dob){
		//Your code goes here
		List<Cast> li=new ArrayList<Cast>();
		for (Cast cast : castList) {
			if(cast.getDob().equals(dob)){
				li.add(cast);
			}
		}
		return li;
	}
}
