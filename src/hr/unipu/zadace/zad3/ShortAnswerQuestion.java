package hr.unipu.zadace.zad3;

/**
 * This is the Question which accepts only short answer. Short
 * answer is one word.
 *
 * @author Vanja Luk
 * @version 1.1
 *
 */

public class ShortAnswerQuestion {

    private String questionText;
    private String correctAnswer;

    public ShortAnswerQuestion(String text, String correctAnswer) {
        this.questionText = text;
        this.correctAnswer = correctAnswer;
    }

    // Metode
    public String getText() {
        return questionText;
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }

}
