
public class Doctor extends Human {
	private int years;
	private String speciality;
	
	public Doctor(int years, String speciality){
		this.years= years;
		this.speciality= speciality; 
	}
	public int getYears(){
		return years;
	}
	public String getSpeciality(){
		return speciality;
	}
	public int getSalary(){
		int Salary= 40000+ (5000*years);
		return Salary;
	}
	public double getHeight(){
		return 173;
	}
	public double getWeight(){
		return 179;
	}
	public int getAge(){
		return 40;
	}
}
