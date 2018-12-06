package hr.unipu.zadace.zad5;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        double num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        //int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
            case 1:
                Addition addition = new Addition(num1, num2);
                System.out.println(addition.getFinalResult());
                break;
            case 2:
                Subtraction subtraction = new Subtraction(num1,num2);
                System.out.println(subtraction.getFinalResult());
               break;
//            case 3:
//                System.out.println(mult( num1,num2));
//                break;
//            case 4:
//                System.out.println(div( num1,num2));
//                break;
//            default:
//                System.out.println("Illigal Operation");


        }



    }


}