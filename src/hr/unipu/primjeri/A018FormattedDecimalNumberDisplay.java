package hr.unipu.primjeri;

import java.text.DecimalFormat;

/**
 * @author JAVA course
 * @version 1.0
 */

public class A018FormattedDecimalNumberDisplay {

    /**
     * This method is called once the program is run.
     * Arguments are described below
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        double[] numbers = new double[] {3.712, 55.813, 55.816, -4.18};
        print(numbers, "000.00");           // Očekujemo: 003.71, 055.81, 055.82, -004.18
        print(numbers, "+00.00;-00.00");    // Očekujemo: +03.71, +55.81, +55.82, -04.18
    }

    /**
     * The method prints the array of decimal numbers according to a set format.
     * @param array array of decimal numbers to be printed according to the format
     * @param format format describing how to print an array
     * @see DecimalFormat
     */
    public static void print(double[] array, String format) {
        DecimalFormat formatter = new DecimalFormat(format);
        for(int i = 0; i < array.length; i++) {
            System.out.println("(" + i + "): [" +
                    formatter.format(array[i]) + "]");
        }
    }




}