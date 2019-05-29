import java.util.Date;

public class Cast {
			//Your code goes here
	private String name;
	private String nationality;
	private String gender;
	private Date dob;
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
	public Cast() {
		super();
	}
	public Cast(String name, String nationality, String gender, Date dob) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.gender = gender;
		this.dob = dob;
	}
}
