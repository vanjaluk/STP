package hr.vanja.primjeri.no02;

import org.jetbrains.annotations.Contract;

public class main {
    public static void main(String[] args) {

        int highScorePostion = calculateHighScorePosition(1500);
        dsiplayHighScorePosition("Mile", highScorePostion);

        highScorePostion = calculateHighScorePosition(900);
        dsiplayHighScorePosition("Slavko", highScorePostion);

        highScorePostion = calculateHighScorePosition(400);
        dsiplayHighScorePosition("Branko", highScorePostion);

        highScorePostion = calculateHighScorePosition(50);
        dsiplayHighScorePosition("Drago", highScorePostion);

    }

    public static void dsiplayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName + " stigao je do pozicije: " + highScorePosition);
        }


    public static int calculateHighScorePosition (int playerScore) {
        if(playerScore>1000) {return 1;}
        else if(playerScore>500 && playerScore<1000) {return 2;}
        else if(playerScore>100 && playerScore<500) {return 2;}
        else return 4;
        }

}

