package hr.unipu.zadace.zad2b;

/**
 * Aplikacija za Unos studenta u registar
 * Kod pokretanja aplikacije se pokaže jednostavan izbornik sa mogućnostima odabira:
 * (h) pomoć, (s) unos studenta, (p) ispis unešenih podataka, (kraj) izlaz iz programa.
 * Ukoliko korisnik upiše neku mogućnost koja ne postoji loop se ponovo pokreće.
 * Za cijelu iteraciju program koristi break i continue za control flow mehanizam, break se okida kad korisnik upiše "kraj"
 * Ako korisnik ne ubaci niti jednog studenta program vraća upozorenje da niti jedan student nije ubačen
 * Za izračun i ispis podataka koriste se odvojene metode unutar Student.java klase.
 * NAPOMENA: ne koristi nikakve metode validacije, te ukoliko se umjesto definiranog data type-a ubaci neki drugi program će prekinut izvršavanje uz Exception grešku
 * @author      Vanja Luk
 * @version     1.00
 * @since       1-11-2018
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner user_input = new Scanner( System.in );
        List<Student> studenti = new ArrayList<>();
    while(true) {
        System.out.println("Odaberi opciju (upiši h za pomoć): ");
        final String action = user_input.next();

        if (action.equals("h")) {
            System.out.println("Imaš slijedeće mogućnosti: h - pomoć, s - unos studenta, p - ispis, kraj - izlaz iz programa\n" +
                    "Ova verzija programa ne koristi nikakve metode validacije, " +
                    "te ukoliko se ubaci String gdje se pretpostavlja int, program će prekinuti izvršavanje");
            continue;
        }

        if (action.equals("s")) {
            Student s = new Student();
            s.init();
            System.out.print("Ime: ");
            s.name = user_input.next();
            System.out.print("Prezime: ");
            s.surname = user_input.next();
            System.out.print("OIB: ");
            s.id = Integer.parseInt(user_input.next());
            studenti.add(s);
            System.out.println("Upiši ocjene iz slijedećih predmeta: ");
            System.out.print("Matematika: ");
            s.addGrade(105, "Matematika", Integer.parseInt(user_input.next()));
            System.out.print("Programiranje: ");
            s.addGrade(77, "Programiranje", Integer.parseInt(user_input.next()));
            System.out.print("Engleski jezik: ");
            s.addGrade(78, "Engleski jezik", Integer.parseInt(user_input.next()));
            continue;
        }

        if (action.equals("p")) {

            if (studenti.size() == 0) {
                System.out.println("Nisi ubacio ni jednog studenta.");
            } else {
                System.out.println("ISPIS:\n*prosjek se računa samo od pozitivnih ocjena");
                int i = 1;
                for (Student student : studenti) {
                    System.out.println("| " + i++ + " | " + student.toString());
                }
            }
            continue;
        }

        if (action.equals("kraj")) {
            break;
        }
        System.out.println("Nepoznata mogućnost" + action);

        }
    }
}