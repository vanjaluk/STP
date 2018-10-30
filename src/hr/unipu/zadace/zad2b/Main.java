package hr.unipu.zadace.zad2b;


/*
Preinačiti Primjer 2.2 na način da je moguć unos podataka o
studentima putem tipkovnice. Kada korisnik više ne želi
unositi podatke omogućiti mu ispis svih zapisa studenata.
Također ponuditi mu i mogućnosti izlaza iz programa.


 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        hr.unipu.zadace.zad2b.Student s = new hr.unipu.zadace.zad2b.Student();
        s.init();
        Scanner user_input = new Scanner( System.in );

        s.name=user_input.next();
        s.surname=user_input.next();
        s.id=user_input.next();

        s.addGrade(105, "OOP", 5);
        s.addGrade(20, "ASP", 3);
        s.addGrade(77, "PiPI", 2);
        s.addGrade(78, "stat", 5);
        System.out.println(s.toString());

        hr.unipu.zadace.zad2b.Student s2 = new Student();
        s2.id=s.id;

        System.out.println(s.equals(s2));
    }
}