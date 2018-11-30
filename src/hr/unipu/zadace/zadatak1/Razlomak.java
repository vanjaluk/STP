package hr.unipu.zadace.zadatak1;

public class Razlomak {
    private int brojnik;
    private int nazivnik;

    public Razlomak(int broj, int nazi) {
        // izbi odmah error ako je nazvinik nula
        if (nazi == 0) {
            throw new ArithmeticException("Nazivnik ne moze biti nula"); }
        else {
            this.brojnik = broj;
            this.nazivnik = nazi;
            zajedNazivnik(); }
    }
    // geteri
    public int getBrojnik() {
        return brojnik;
    }

    public int getNazivnik() {
        return nazivnik;
    }
    //seteri
    public void setBrojnik(int brojnik) {
        this.brojnik = brojnik;
    }

    public void setNazivnik(int nazivnik) {
        this.nazivnik = nazivnik;
    }

    //kraćenje i zajednicki nazivnik za zbrajanje
    private int skrati(int brojnik, int nazivnik) {
        if (brojnik % nazivnik == 0) {
            return nazivnik;
        }
        else {
            return skrati(nazivnik, brojnik % nazivnik);
        }
    }
    private void zajedNazivnik() {
        int x = skrati(brojnik, nazivnik);
        brojnik /= x;
        nazivnik /= x;
    }

    //zbrajanje
    public Razlomak zbroji(Razlomak razDva) {
        int broj = (brojnik * razDva.getNazivnik()) + (razDva.getBrojnik() * nazivnik);
        int nazi = nazivnik * razDva.getNazivnik();
        Razlomak rezultat =  new Razlomak(broj, nazi);
        return rezultat;
    }

    //oduzimanje
    public Razlomak oduzmi(Razlomak razDva) {
        int brojnik2 = (brojnik * razDva.nazivnik) - (razDva.brojnik * nazivnik);
        int nazivnik2 = nazivnik * razDva.nazivnik;
        Razlomak rezultat = new Razlomak(brojnik2,nazivnik2);
        return rezultat;
    }

    //mnozenje
    public Razlomak mnozi(Razlomak razDva) {
        int brojnik2 = brojnik * razDva.brojnik;
        int nazivnik2 = nazivnik * razDva.nazivnik;
        Razlomak rezultat = new Razlomak(brojnik2,nazivnik2);
        return rezultat;
    }

    //dijeljenje
    public Razlomak dijeli(Razlomak razDva) {
        if (this.nazivnik == 0) {
            throw new ArithmeticException("Nazivnik ne može biti 0");
        }
        else {
            int brojnik2 = brojnik * razDva.nazivnik;
            int nazivnik2 = nazivnik * razDva.brojnik;
            Razlomak rezultat = new Razlomak(brojnik2,nazivnik2);
            return rezultat;

        }
    }

    // vrati formatirano u string
    @Override
    public String toString() {
        return brojnik + "/" + nazivnik;
    }
}
