package hr.unipu.zadace.kolokvij1.zadatak1;

public class Razlomak {
        private int brojnik;
        private int nazivnik;

    public Razlomak(int brojnik, int nazivnik) {
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;
        zajedNazivnik();
    }

    public int getBrojnik() {
        return brojnik;
    }

    public int getNazivnik() {
        return nazivnik;
    }

    public void setBrojnik(int brojnik) {
        this.brojnik = brojnik;
    }

    public void setNazivnik(int nazivnik) {
        this.nazivnik = nazivnik;
    }

    //kraćenje
    private int skrati(int brojnik, int nazivnik) {
        if (brojnik % nazivnik == 0) {
            return nazivnik;
        }
        return skrati(nazivnik, brojnik % nazivnik);
    }

    private void zajedNazivnik() {
        int x = skrati(brojnik, nazivnik);
        brojnik /= x;
        nazivnik /= x;
    }

    //zbrajanje
    public Razlomak add(Razlomak raz2) {
        this.brojnik = (brojnik * raz2.getNazivnik()) +
                (raz2.getBrojnik() * nazivnik);
        this.nazivnik = nazivnik * raz2.getNazivnik();
        return new Razlomak(brojnik, nazivnik);
    }
//
//    //oduzimanje
//    public Fraction subtract(Fraction fractionTwo) {
//        int newNumerator = (brojnik * fractionTwo.denominator) -
//                (fractionTwo.numerator * nazivnik);
//        int newDenominator = nazivnik * fractionTwo.denominator;
//        Fraction result = new Fraction(newNumerator, newDenominator);
//        return result;
//    }
//
//    //mnozenje
//    public Fraction multiply(Fraction fractionTwo) {
//        int newNumerator = brojnik * fractionTwo.numerator;
//        int newDenominator = nazivnik * fractionTwo.denominator;
//        Fraction result = new Fraction(newNumerator, newDenominator);
//        return result;
//    }
//
//    //dijeljenje
//    public Fraction divide(Fraction fractionTwo) {
//        int newNumerator = brojnik * fractionTwo.getDenominator();
//        int newDenominator = nazivnik * fractionTwo.numerator;
//        Fraction result = new Fraction(newNumerator, newDenominator);
//        return result;
//    }

    // vrati string
    @Override
    public String toString() {
        return this.brojnik + "/" + this.nazivnik;
    }
}