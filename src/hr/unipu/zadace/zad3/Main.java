package hr.unipu.zadace.zad3;

import java.text.DecimalFormat;
import java.util.Scanner;

//Proširiti postojeću aplikaciju Quiz:
//        - stvorit novu klasu Quiz koja će predstavljati kompoziciju i agregaciju više pitanja & odgovora
//        - dovršiti provjeru i ograničavanje dodavanja novih pitanja do maksimalnog broja pitanja
//        - aplikacija mora omogućiti i dodavanja novog pitanja-odgovora preko tipkovnice
//        - aplikacija mora ispisati na kraju broja točnih odgovora u apsolutnom i postotnom iznosu.

public class Main {

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("##.00");
    private static final int MAX_NUMBER_OF_QUESTIONS = 10;
    private static final int MIN_NUMBER_OF_QUESTIONS = 1;

    public static void main(String[] args) {

        Quiz quiz = new Quiz("First Quiz");
        Scanner scanner = new Scanner(System.in);
        ShortAnswerQuestion question = new ShortAnswerQuestion("Pitanje", "Odgovor");
        String addTextQuestion;
        String addCorrectAnswer;
        try {
            askQuestions(quiz, scanner);
        } catch (MaxNumberOfQuestions e) {
            System.err.println("An error occurred while asking questions: " + e);
        }
    }

    private static void askQuestions(Quiz quiz, Scanner scanner) throws MaxNumberOfQuestions {
        while (true) {
            System.out.print("Odaberi opciju (Upiši h za pomoć...): ");
            final String action = scanner.nextLine();

            if (wantHelp(action)) {
                System.out.print("Za upis novog pitanja upiši p, za kraj k:\n ");
                continue;
            }

            if (wantsToContinueWithQuestions(action)) {
                addQuestion(quiz, scanner);
            }

            if (isQuizEnd(quiz, action)) {
                if (isNumberOfQuestionsUnderMin(quiz)) {
                    System.out.println("Nisi postavio niti jedno pitanje.");
                } else {
                    System.out.println("Postavljen maksimalni broj pitanja, ili si upisao si \"k\"," +
                            "\nodgovori na pitanja koja si sam prethodno postavio... :-)");

                    int noOfCorrectAnswers = 0;

                    for (int i = 0; i < quiz.getNoOfQuestions(); i++) {
                        System.out.println(quiz.getQuestion(i));
                        String answer = scanner.nextLine();

                        noOfCorrectAnswers = checkAnswer(quiz, noOfCorrectAnswers, i, answer);
                    }

                    System.out.println("Slijede rezulatati...\nImali ste " + noOfCorrectAnswers + " točnih odgovora od ukupno " + quiz.getNoOfQuestions());
                    System.out.println("Gledano u postotku to je: " + DECIMAL_FORMAT.format(getCorrectAnswerRate(quiz, noOfCorrectAnswers)) + "%");
                }
                break;
            }
        }
    }

    private static boolean isNumberOfQuestionsUnderMin(Quiz quiz) {
        return quiz.getNoOfQuestions() < MIN_NUMBER_OF_QUESTIONS;
    }

    private static boolean isQuizEnd(Quiz quiz, String action) {
        return wantsToEndWithQuestions(action) || hasReachedQuestionLImit(quiz);
    }

    private static boolean hasReachedQuestionLImit(Quiz quiz) {
        return quiz.getNoOfQuestions() > MAX_NUMBER_OF_QUESTIONS;
    }

    private static boolean wantHelp(String action) {
        return action.equals("h");
    }

    private static int checkAnswer(Quiz quiz, int noOfCorrectAnswers, int i, String answer) {
        if (quiz.isCorrectAnswer(i, answer)) {
            noOfCorrectAnswers++;
            System.out.println("Točno!");
        } else {
            System.out.println("Netočno.");
        }
        return noOfCorrectAnswers;
    }

    private static double getCorrectAnswerRate(Quiz quiz, double noOfCorrectAnswers) {
        return noOfCorrectAnswers / (double) quiz.getNoOfQuestions() * 100;
    }

    private static void addQuestion(Quiz quiz, Scanner scanner) throws MaxNumberOfQuestions {
        String addTextQuestion;
        String addCorrectAnswer;
        System.out.print("Dodaj pitanje: ");
        addTextQuestion = scanner.nextLine();
        System.out.print("Dodaj odgovor: ");
        addCorrectAnswer = scanner.nextLine();
        ShortAnswerQuestion newQuestion = new ShortAnswerQuestion(addTextQuestion, addCorrectAnswer);
        tryAddNewQuestion(quiz, newQuestion);
    }

    private static boolean wantsToContinueWithQuestions(String action) {
        return checkAction(action, "p");
    }

    private static boolean wantsToEndWithQuestions(String action) {
        return checkAction(action, "k");
    }

    private static boolean checkAction(String action, String p) {
        return action.equalsIgnoreCase(p);
    }

    private static void tryAddNewQuestion(Quiz quiz, ShortAnswerQuestion newQuestion) throws MaxNumberOfQuestions {
        try {
            quiz.addQuestion(newQuestion);
        } catch (MaxNumberOfQuestions maxNumberOfQuestions) {
            System.err.println("An error occurred: " + maxNumberOfQuestions);
            throw maxNumberOfQuestions;
        }
    }
}