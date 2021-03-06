package hr.unipu.zadace.zad2a;

/**
 * STP_zad2a_Vanja_Luk
 *
 * git repo: https://github.com/vanjaluk/STP/tree/master/src/hr/unipu/zadace/zad2a
 *
 * Aplikacija za unos riječi i usporedbu broja suglasnika i samoglasnika.
 * Način korištenja: nakon upisa riječi stisni enter, kad zavriš s upisima napiši "kraj".
 * Ukoliko postoje riječi koje imaju isti broj suglasnika i samoglasnika program će ih ispisati, ako se napiše samo "kraj" program će završiti.
 * @author      Vanja Luk
 * @version     1.00
 * @since       26-10-2018
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        System.out.println("Zapiši riječi, nakon svake stisni enter. Kad završiš napiši \"kraj\"");
        Scanner sc = new Scanner(System.in);

        ArrayList<String> StringList = new ArrayList<String> ();
        String s="";

        while (!s.equalsIgnoreCase("kraj")) {
            StringList.add(sc.nextLine());
            s = StringList.get(StringList.size()-1);
        }

        if (StringList.size()-1 == 0) {
            System.out.println("Nisi ubacio ni jednu riječ.");
        }

        else {
            System.out.println("\nUpisane su ove riječi: ");
            int words = 0;
            for (int i=0; i<StringList.size()-1;i++) {
                System.out.print(StringList.get(i).toUpperCase()+"  ");
                ++words;
            }
            System.out.println("\nBroj upisanih riječi: " + words);

            System.out.println("\nOvo su riječi koje imaju isti broj suglasnika i samoglasnika:\n\n" +
                               "|  br | sam | sug | riječ\n+-----+-----+-----+--------");
            for (int i = 0; i < StringList.size(); i++) {
                ++words;
                String z = StringList.get(i);

                int a = 0;
                int b = 0;

                for (int k = 0; k < z.length(); k++) {
                    char x = z.charAt(k);

                    if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                        a++;
                    } else {
                        b++;
                    }
                }
                if (a == b) {
                    System.out.println("|  " + z.length() + "  |  " + a + "  |  " + b + "  | " + z.toUpperCase());
                    }
                }
            }
        }
    }
