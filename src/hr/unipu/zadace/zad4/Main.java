package hr.unipu.zadace.zad4;

//- Definirati baznu klasu Person koja sadrži dva atributa: ime i prezime osobe te odgovarajuće get i set metode. Također kreirati i metodu displayDetails koja ispisuje detalje o osobi.
//- definirati klasu Student koja je naslijeđena od klase Person, te sadrži dodatne atribute: ID studenta, polje upisanih predmeta i imena nastavnika. Unutar klase nadjačati metodu za ispis detalja o studentu.
//- definirati klasu Teacher koja je naslijeđena od klase Person. Klasa treba imati dodatne atribute: imena predmeta koje nastavnik drži i iznos plaće. Nadjačati metodu za ispis detalja o nastavniku.
//- kreirati main metodu u kojoj se instanciraju barem dva studenta i dva nastavnika, te pozvati metodu displayDetails za svaki od objekata.
//- UPUTA: aplikaciju proširujte i kreirajte slobodno i onako kako mislite da bi krajnjem korisniku bilo najinteresantnije.

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Vanja","Luk",12131415,"");
        student1.setCourses("Engleski jezik - Ivo Ivić ");
        student1.setCourses("Geografija - Nataša Luk ");

        Student student2 = new Student("Sara","Luk",21232425, "");
        student2.setCourses("Priroda i društvo - Nataša Luk");
        student2.setCourses("Njemački jezik - Ivo Ivić");

        Teacher teacher1 = new Teacher("Nataša","Luk","",4500.45,"nastavnik");
        Teacher teacher2 = new Teacher("Ivo","Ivić","",7000.47,"profesor");
        teacher1.setCourses("Geografija, Povijest, Priroda i društvo");
        teacher2.setCourses("Hrvatski jezik, Talijanski jezik");

        System.out.println("STUDENTI:\n--------------------");
        System.out.println(student1.displayDetails());
        System.out.println(student2.displayDetails());

        System.out.println("\nNASTAVNICI:\n--------------------");
        System.out.println(teacher1.displayDetails());
        System.out.println(teacher2.displayDetails());
    }
}