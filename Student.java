
public class Student extends Human {
	private String major;
	private double gpa; 
	private int creditHours;
	
	public Student(String major, double gpa, int creditHours){
		this.major= major;
		this.gpa= gpa;
		this.creditHours= creditHours; 
	}
	
	public String getMajor(){
		return major;
	}
	public double getGpa(){
		return gpa;
	}
	public String getYear(){
		if (creditHours < 32){
			return "Freshmen";
		} else if ( creditHours >= 32 && creditHours < 64){
			return "Sophomore"; 
		} else if (creditHours >= 64 && creditHours < 96){
			return "Junior";
		} else {
			return "Senior";
		}
	}
	public int getAge(){
		return 18;
	}
	public double getWeight(){
		return 150;
	}
	public double getHeight(){
		return 170;
	}
}
