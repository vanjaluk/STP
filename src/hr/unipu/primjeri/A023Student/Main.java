package hr.unipu.primjeri.A023Student;


public class Main {	
	public static void main(String[] args) {		
		Student s = new Student();
		s.init();
		s.setName("Ivo"); s.setSurname("Ivić");
		s.setId("1234567890");		
		s.addGrade(105, "OOP", 5);		
		s.addGrade(20, "ASP", 3);
		s.addGrade(77, "PiPI", 2);
		System.out.println(s.toString());
		
		Student s2 = new Student();		
		s2.setId("1234567890");	
		
		System.out.println(s.equals(s2));					
	}
}