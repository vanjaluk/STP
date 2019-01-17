package hr.unipu.zadace.zad6_zad3exc;

/**
 * Izgradnja sustava objekata: kompozicija i agregacija
 */

public class Quiz {
    private String name;    //ime kviza
    private ShortAnswerQuestion[] questions = new ShortAnswerQuestion[10];  //polje pitanja
    private int noOfQuestions = 0; //inicijalno je kviz prazan (bez pitanja)

    // Konstruktor 1
    public Quiz() {
        name = "Initial Quiz";
    }

    // Konstruktor 2 (overloading = preopterećivanje)
    public Quiz(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // kompozicija klase Quiz
    public void addQuestion(String text, String answer) throws MaxNumberOfQuestions {
        if(noOfQuestions <= 10) {
            questions[noOfQuestions] = new ShortAnswerQuestion(text, answer);
            noOfQuestions++;
        }
        else {
            System.err.println("Postavljen je maksimalni broj pitanja.");
            throw new MaxNumberOfQuestions("Postavljen je maksimalni broj pitanja.");
        }
    }

    // agregacija klase Quiz
    public void addQuestion(ShortAnswerQuestion question) throws MaxNumberOfQuestions {
        if(noOfQuestions <= 10) {
            questions[noOfQuestions] = question;
            noOfQuestions++;
        }
        else {
            System.err.println("Postavljen je maksimalni broj pitanja.");
            throw new MaxNumberOfQuestions("Postavljen je maksimalni broj pitanja.");
        }
    }

    public int getNoOfQuestions() {
        return noOfQuestions;
    }

    public String getQuestion(int index) {
        return questions[index].getText();
    }

    public boolean isCorrectAnswer(int questionIndex, String answer) {
        return questions[questionIndex].isCorrectAnswer(answer);
    }

}