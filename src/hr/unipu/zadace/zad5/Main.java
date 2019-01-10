package hr.unipu.zadace.zad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Za kraj napisi 'k', a za razne matematičke operacije 'o': ");
            Scanner scanner = new Scanner(System.in);
            final String action = scanner.nextLine();
            if(action.equals("o")) {
                System.out.println("Upiši brojeve (može bilo koji broj iz skupa R), stavi razmak između i stisni Enter:");
                // validacija ako su input double brojevi, ako ne catch na InputMismatch i vrati poruku
                try {
                    Scanner inp = new Scanner(System.in);
                    double num1 = inp.nextDouble();
                    double num2 = inp.nextDouble();
                    //int ans;
                    System.out.println("Odaberi operaciju: 1 - zbrajanje, 2 - oduzimanje, 3 - množenje, 4 - dijeljenje, 5 - sve operacije:");
                    int choose;
                    choose = inp.nextInt();
                    // definiraj metode da ih kasnije ne pozivam ponovo
                    Addition addition = new Addition(num1, num2);
                    Subtraction subtraction = new Subtraction(num1, num2);
                    Multiplication multiplication = new Multiplication(num1, num2);
                    Division division = new Division(num1, num2);
                    switch (choose) {
                        case 1:
                            System.out.println("Rezultat: " + addition.getFinalResult());
                            break;
                        case 2:
                            System.out.println("Rezultat: " + subtraction.getFinalResult());
                            break;
                        case 3:
                            System.out.println("Rezultat: " + multiplication.getFinalResult());
                            break;
                        case 4:
                            System.out.println("Rezultat: " + division.getFinalResult());
                            break;
                        case 5: // svi rezultati
                            System.out.println("Odradi sve operacije...");
                            System.out.println("Zbrajanje: " + addition.getFinalResult());
                            System.out.println("Oduzimanje: " + subtraction.getFinalResult());
                            System.out.println("Množenje: " + multiplication.getFinalResult());
                            System.out.println("Dijeljenje: " + division.getFinalResult());
                            break;
                        default: // ako se odabere nešto šta nema u izborniku
                            System.out.println("Ova operacija ne postoji");
                    }
                    continue;
                } catch (InputMismatchException e) {
                    System.out.println("Upisane vrijednosti nisu brojevi. Pokušaj ponovo...");
                }
            } if(action.equals("k")) {
                System.out.println("Kraj...");
                break;
            }
        }
    }
}