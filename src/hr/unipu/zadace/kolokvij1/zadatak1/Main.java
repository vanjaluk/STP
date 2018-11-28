package hr.unipu.zadace.kolokvij1.zadatak1;


//U Java kodu napisati klasu Razlomak kojom se modelira razlomak čiji je brojnik i nazivnik cijeli
//        broj. Potrebno je implementirati i metode kojima se razlomke može zbrajati, oduzimati, množiti,
//        dijeliti. Također, potrebno je napisati i metodu pokratiRazlomak kojom se razlomak
//        automatski krati.
//        Prilikom realizacije klase posebnu je pažnju potrebno posvetiti iznimkama koje se događaju kod
//        dijeljenja s nulom.
//        Dodatno, napisati i metodu main kojom se demonstrira uporaba razvijene klase.
//        Postaviti vlastite komentare uz ključne dijelove koda. Prikazati ispis. Nacrtati UML dijagram

public class Main {
    public static void main(String[] args) {
        Razlomak r1 = new Razlomak(2, 4);
        System.out.println(r1.toString());
        Razlomak r2 = new Razlomak(2, 4);
        System.out.println(r2.toString());
        Razlomak r3 = r1.add(r2);
        System.out.println("Zbroj je " + r1 + " + " + r2 + " = " + r3);
    }
}
