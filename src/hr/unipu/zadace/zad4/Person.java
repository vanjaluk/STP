package hr.unipu.zadace.zad4;

public abstract class Person implements IPerson {
    private String personName;
    private String personSurname;

    public Person(String personName, String personSurname) {
        this.personName = personName;
        this.personSurname = personSurname;
    }

    private String getPersonName() {
        return personName;
    }

    private String getPersonSurname() {
        return personSurname;
    }

    public String displayDetails() {
        return String.format("%s %s",getPersonName(),getPersonSurname());
    }
}
