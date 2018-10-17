package hr.unipu.quiz;

public class Main {
    public static void main(String[] args) {
        ShortAnswerQuestion question = new ShortAnswerQuestion(
                "U kojem jeziku se programira za Android?", "Java");

        System.out.println(question.getText());
        System.out.println("C: " + question.isCorrectAnswer("C"));
        System.out.println("java: " + question.isCorrectAnswer("java"));
    }
}