package hr.unipu.primjer1;

    public class Person {

        String ime;
        String prezime;
        int godine;

        public Person(){

        }

        public void speak() {
            System.out.println("Pozdrav, zovem se " + ime + " " + prezime);
            System.out.println("imam " + godine + " godina");

        }
    }