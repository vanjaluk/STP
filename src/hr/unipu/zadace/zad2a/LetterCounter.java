package hr.unipu.zadace.zad2a;


import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class LetterCounter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> StringLista = new ArrayList<> ();


        String s="";

        while (!s.equals("kraj")) {
            StringLista.add(sc.nextLine());
            s = StringLista.get(StringLista.size()-1);
        }
        System.out.println("riječi s jednakim brojem...");

        for (int i=0; i < StringLista.size(); i++) {
            String z = StringLista.get(i);
            int sam = 0;
            int sug = 0;
            for ( int k=0; k < z.length(); k++) {
                char x = z.charAt(k);

                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    sam++;
                } else {
                    sug++;
                }
            if (sam == sug ){System.out.println(z);}
            }

        }

        }

    }
