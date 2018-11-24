package hr.unipu.zadace.zad4;

public class Teacher extends Person {
    private String course;
    private double netSalary;
    private String teacherVocation;

    public Teacher(String personName, String personSurname, String course, double netSalary, String teacherVocation) {
        super(personName, personSurname);
        this.course = course;
        this.netSalary = netSalary;
        // dodatna polja
        this.teacherVocation = teacherVocation;

    }

    public void setCourses(String courses) {
        this.course += courses;
    }

    //public void getCourses(String course) {
    //    this.course += course+ ", ";
    //}

    public double getNetSalary() {
        return netSalary;
    }
    public String getTeacherVocation() {
        return teacherVocation;
    }

    @Override
    public String displayDetails() {
        String allDetails = super.displayDetails();
        allDetails +=  String.format(", %s\nPredmeti: %s\nPlaca: %s kn",teacherVocation, course,netSalary);
        return allDetails;

    }
}

