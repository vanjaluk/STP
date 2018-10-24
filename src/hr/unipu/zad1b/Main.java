package hr.unipu.zad1b;

/**
 * <h1>Simple hardcoded quiz</h1>
 * <p>This is an example of a hardcoded quiz. It's primary function is to show how are simple classes used in java.
 * The main method prints the question and three possible answers where the third answer is correct.
 * It uses a simple boolean method for true and false return.</p>
 * @author      Vanja Luk
 * @version     1.00
 * @since       24-10-2018
 */

//main method
public class Main {
        public static void main(String[] args) {
            // declare AswerQuestion.class and hardcode the answer and test case insensitive answer
            hr.unipu.zad1b.AnswerQuestion question = new AnswerQuestion(
                    "What is Ansible?\n", "TRuE");

            // print previous defined question
            System.out.println(question.getText());

            // print correct answer check and return correct answer if true is valid
            System.out.println("1. Programming language: " + question.isCorrectAnswer("false"));
            System.out.println("2. Some Docker orchestration engine: " + question.isCorrectAnswer("false"));
            System.out.println("3. An automation tool: " + question.isCorrectAnswer("true"));
        }
    }
