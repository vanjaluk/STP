package hr.unipu.primjeri;

/**
        * @author JAVA course
        * @version 1.0
        */
public class A017WorkingWithStrings {
    /**
     This method is called once the program is run.
     Arguments are described below
     @param args Command line arguments.
     */
    public static void main(String[] args) {
        displayString1();
        displayString2();
        displayString3();
        displayString4();
    }

    /**
     * String concatenation demo.<br>
     * Concatenation using operator + split across multiple
     * commands is very inefficient.
     */
    private static void displayString1() {
        String text = null;

        text = "The quick " + "brown ";
        text += "fox jumps over ";
        text += 3;
        text += " lazy dogs.";

        System.out.println(text);
    }

    /**
     * String concatenation demo.<br>
     * Concatenation using operator + in a single line
     * is more efficient.
     */
    private static void displayString2() {
        String text = null;

        int number = 3;
        text = "The quick brown fox jumps over " + number + " lazy dogs.";

        System.out.println(text);
    }

    /**
     * String concatenation demo.<br>
     * String concatenation using StringBuilder object.
     * Is it equaly efficient as in the previous method?
     * Initially a buffer of size 16 is created, and
     * subsequently reallocated three times to fit in the string
     * Note: prior to Java version 5.0 StringBuffer was significantly
     * slower
     */
    private static void displayString3() {
        String text = null;

        StringBuilder sb = new StringBuilder();

        sb.append("The quick ").append("brown ");
        sb.append("fox jumps over ").append(3);
        sb.append(" lazy dogs.");

        text = sb.toString();

        System.out.println(text);
    }

    /**
     * String concatenation demo.<br>
     * Concatenation using StringBuilder object.
     * The most efficient way is if the required buffer size is known
     * in advance.
     * In the example the buffer of size 50 characters is allocated.
     * Note: prior to Java version 5.0 StringBuffer was significantly
     * slower
     */
    private static void displayString4() {
        String text = null;
        StringBuilder sb = new StringBuilder(50);

        sb.append("The quick ").append("brown ");
        sb.append("fox jumps over ").append(3);
        sb.append(" lazy dogs.");

        text = sb.toString();

        System.out.println(text);
    }

}
