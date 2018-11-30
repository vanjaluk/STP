package hr.unipu.zadace.zadatak1;

public class Main {
    public static void main(String[] args) {
        Razlomak r1 = new Razlomak(3, 5);
        System.out.println("Prvi razlomak: " +r1.toString());
        Razlomak r2 = new Razlomak(2, 3);
        System.out.println("Drugi razlomak: "+r2.toString());
        // zbrajanje
        Razlomak r3 = r1.zbroji(r2);
        System.out.println("Zbroj je " + r3);
        // oduzimanje
        Razlomak r4 = r1.oduzmi(r2);
        System.out.println("Razlika je "+r4);
        // mnozenje
        Razlomak r5 = r1.mnozi(r2);
        System.out.println("Umnožak je "+r5);
        // dijeljenje
        Razlomak r6 = r1.dijeli(r2);
        System.out.println("Produkt je "+r6);
    }
}
