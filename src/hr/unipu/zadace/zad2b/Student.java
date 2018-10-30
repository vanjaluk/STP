package hr.unipu.zadace.zad2b;

import hr.unipu.zadace.zad2b.CourseGrade;

public class Student {
    final int ARR_SIZE = 60;
    public String name;
    public String surname;
    public String id;
    private int noOfGrades;
    private hr.unipu.zadace.zad2b.CourseGrade[] grades;

    public void init(){
        grades = new hr.unipu.zadace.zad2b.CourseGrade[ARR_SIZE];
        noOfGrades = 0;
    }

    public void addGrade(int code, String title, int grade){
        if (grade >= 2 && grade <=5){
            hr.unipu.zadace.zad2b.CourseGrade courseGrade = new CourseGrade();
            courseGrade.code = code;
            courseGrade.title = title;
            courseGrade.grade = grade;
            grades[noOfGrades++] = courseGrade;
        }
    }

    public double averageGrade(){
        int sum = 0;
        for(int i=0; i<noOfGrades; i++)
            sum += grades[i].grade;
        return noOfGrades > 0 ? (double) sum / noOfGrades : 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getSurname() {
        return name;
    }

    public void setSurname(String newSurname) {
        surname = newSurname;
    }

   /* @Override
    public String toString() {
        return String.format("%s - %s, %s - Average grade %.2f", id, surname, name, averageGrade() );
    }

    @Override
    public boolean equals(Object obj) {
        //pretpostavit ćemo da je primljeni objekt uistinu Student
        hr.unipu.zadace.zad2b.Student otherStudent = (hr.unipu.zadace.zad2b.Student) obj;
        return id.equals(otherStudent.id);
    }*/
}
