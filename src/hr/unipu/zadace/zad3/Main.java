package hr.unipu.zadace.zad3;

import java.text.DecimalFormat;
import java.util.Scanner;

//Proširiti postojeću aplikaciju Quiz:
//        - stvorit novu klasu Quiz koja će predstavljati kompoziciju i agregaciju više pitanja & odgovora
//        - dovršiti provjeru i ograničavanje dodavanja novih pitanja do maksimalnog broja pitanja
//        - aplikacija mora omogućiti i dodavanja novog pitanja-odgovora preko tipkovnice
//        - aplikacija mora ispisati na kraju broja točnih odgovora u apsolutnom i postotnom iznosu.

public class Main {

    public static void main(String[] args) {

        Quiz quiz = new Quiz("First Quiz");
        Scanner scanner = new Scanner(System.in);
        ShortAnswerQuestion question = new ShortAnswerQuestion("Pitanje", "Odgovor");
        String addTextQuestion;
        String addCorrectAnswer;
        while (true) {
            System.out.print("Odaberi opciju (Upiši h za pomoć...): ");
            final String action = scanner.nextLine();
            if (action.equals("h")) {
                System.out.print("Za upis novog pitanja upiši p, za kraj k:\n ");
                continue;
            }

            if (action.equalsIgnoreCase("p") && quiz.getNoOfQuestions() < 10) {

                System.out.print("Dodaj pitanje: ");
                addTextQuestion = scanner.nextLine();
                System.out.print("Dodaj odgovor: ");
                addCorrectAnswer = scanner.nextLine();
                ShortAnswerQuestion newQuestion = new ShortAnswerQuestion(addTextQuestion, addCorrectAnswer);
                quiz.addQuestion(newQuestion);
                continue;
            }

            if (action.equalsIgnoreCase("k") || quiz.getNoOfQuestions() <= 10) {
                if (quiz.getNoOfQuestions() < 1) {
                    System.out.println("Nisi postavio niti jedno pitanje.");
                } else {
                    System.out.println("Postavljen maksimalni broj pitanja, ili si upisao si \"k\"," +
                            "\nodgovori na pitanja koja si sam prethodno postavio... :-)");

                    int noOfCorrectAnswers = 0;

                    for (int i = 0; i < quiz.getNoOfQuestions(); i++) {
                        System.out.println(quiz.getQuestion(i));
                        String answer = scanner.nextLine();

                        if (quiz.isCorrectAnswer(i, answer)) {
                            noOfCorrectAnswers++;
                            System.out.println("Točno!");
                        } else {
                            System.out.println("Netočno.");
                        }
                    }

                    System.out.println("Slijede rezulatati...\nImali ste " + noOfCorrectAnswers + " točnih odgovora od ukupno " + quiz.getNoOfQuestions());
                    double finalResult = (double) noOfCorrectAnswers / (double) quiz.getNoOfQuestions() * 100;
                    DecimalFormat f = new DecimalFormat("##.00");
                    System.out.println("Gledano u postotku to je: " + f.format(finalResult) + "%");
                }
                break;
            }
            System.out.println("Nepoznata mogućnost" + action);
        }
    }
}