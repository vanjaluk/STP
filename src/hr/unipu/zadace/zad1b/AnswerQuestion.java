package hr.unipu.zadace.zad1b;
/**
 * <p>This class is used for question and answer output. There is no input from the enduser. The only thing this method does is
 * system output of the parameters hardcoded in the main method which are passed into this one. It has a boolean check for true and false at the end
 * with a ignore case builtin java method.</p>
 * @author      Vanja Luk
 * @version     1.00
 * @since       24-10-2018
 */

public class AnswerQuestion {

    /**
     * <p>This method returns if the printed lines are true. Uses a simple boolean method.</p>
     * @param String text
     * @param String correctAnswer
     * @return Boolean true or false
    */

    private String text;
    private String correctAnswer;

    /**
     * AnswerQuestion object constructor
     */
    public AnswerQuestion(String text, String correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }
    public String getText() {
        return text;
    }

    // return correct answer and ignore case
    public boolean isCorrectAnswer(String answer) {

        return correctAnswer.equalsIgnoreCase(answer);
    }
}