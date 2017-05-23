
public class ClientLab4 {
	public static void main(String[]args){
		Student alex = new Student("cs", 3.4, 54);
		System.out.println("Alex");
		System.out.println("Major: "+ alex.getMajor());
		System.out.println("GPA: "+ alex.getGpa());
		System.out.println("Year: "+ alex.getYear());
		System.out.println("Age: "+ alex.getAge());
		System.out.println();
		
		Doctor jack =new Doctor (4, "Dermatology");
		System.out.println("Dr Jack");
		System.out.println("Speciality: "+jack.getSpeciality());
		System.out.println("Height: "+ jack.getHeight()+ " cm");
		System.out.println("Weight: "+ jack.getWeight()+" pounds");
		System.out.println("Salary: "+ jack.getSalary());
		System.out.println();
		
	}
			
	
}
