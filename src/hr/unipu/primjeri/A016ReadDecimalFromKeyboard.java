package hr.unipu.primjeri;

import java.util.Scanner;

/**
 * @author Java course
 * @version 1.0
 */
public class A016ReadDecimalFromKeyboard {
    public static void main(String[] args) {
        double sum = 0.0;
        System.out.println("Enter a list of positive decimal numbers (press Enter after each input):");
        System.out.println("(negative number for EXIT, use '.' for decimal place): ");
        Scanner sc = new Scanner(System.in);
        while(true) {
            double number = sc.nextDouble();
            if(number <= 0) break;
            sum += number;
        }
        System.out.format("Sum is: %f%n", sum);
        sc.close();
    }
}


