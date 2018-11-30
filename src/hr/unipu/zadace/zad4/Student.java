package hr.unipu.zadace.zad4;

public class Student extends Person implements IPerson  {

//ID studenta, polje upisanih predmeta i imena nastavnika
    private int studentId;
    private String courses;

    public Student(String personName, String personSurname, int studentId, String courses) {
        super(personName, personSurname);
        this.studentId = studentId;
        // svima je obavezan hrvatski j
        this.courses = "Hrvatski jezik - Ivo Ivić"+" | ";
    }

    public void setCourses(String courses) {
        this.courses += courses+" | ";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourses() {

        return courses;
    }

    @Override
    public String displayDetails() {
        String allDetails = super.displayDetails();
        allDetails +=  String.format(", ID: %s Predmeti: %s",getStudentId(),getCourses());
        return allDetails;
    }

}
