import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

public class Cast {
	
	//write your code here
	private String name;
	private String nationality;
	private String gender;
	private Date dob;
	private List<CastMovieAssignment> castMovieAssignmentList;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<CastMovieAssignment> getCastMovieAssignmentList() {
		return castMovieAssignmentList;
	}

	public void setCastMovieAssignmentList(List<CastMovieAssignment> castMovieAssignmentList) {
		this.castMovieAssignmentList = castMovieAssignmentList;
	}

	public Cast(String name, String nationality, String gender, Date dob,
			List<CastMovieAssignment> castMovieAssignmentList) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.gender = gender;
		this.dob = dob;
		this.castMovieAssignmentList = castMovieAssignmentList;
	}

	public Cast() {
		super();
	}

	public static List<Cast> prefill(List<Cast> castList) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		castList.add(new Cast("Robert Downey","USA","Male",sdf.parse("04-04-1965"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Gwyneth Paltrow","USA","Female",sdf.parse("27-09-1972"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Chris Hemsworth","Australia","Male",sdf.parse("11-08-1983"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Tom Hiddleston","UK","Male",sdf.parse("09-02-1981"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Scarlett Johansson","USA","Female",sdf.parse("22-11-1984"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Mark Ruffalo","USA","Male",sdf.parse("22-11-1967"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Benedict Cumberbatch","UK","Male",sdf.parse("19-07-1976"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Chris Evans","USA","Male",sdf.parse("13-06-1981"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Sebastian Stan","USA","Male",sdf.parse("13-08-1982"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Chadwick Boseman","USA","Male",sdf.parse("29-11-1977"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Michael Jordan","USA","Male",sdf.parse("09-02-1987"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Letitia Wright","Guyana","Female",sdf.parse("31-10-1993"),new ArrayList<CastMovieAssignment>()));
		//castList.add(new Cast("Sebastian Stan","USA","Male",sdf.parse("13-08-1982"),new ArrayList<CastMovieAssignment>()));
		castList.add(new Cast("Hugo","Nigeria","Male",sdf.parse("04-04-1960"),new ArrayList<CastMovieAssignment>()));
		return castList;
	}
	
	public static TreeMap<String,Integer> getActorWiseCount(List<Cast> list){
		
		TreeMap<String,Integer> tr=new TreeMap<String,Integer>();
		for (Cast cast : list) {
			if(tr.containsKey(cast.getName())){
				int value=tr.get(cast.getName());
				tr.put(cast.getName(), value+1);
			}else{
				tr.put(cast.getName(), 0);
			}
		}
		return tr;
	}
	
}