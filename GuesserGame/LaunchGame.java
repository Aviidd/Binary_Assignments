 import java.util.*;

class Guesser{
    // in this the guesser will guess the no
    int guessNum;

    int guessingNumber(){
        Scanner scn = new Scanner(System.in);
        System.out.println("guesser guess the no");
        guessNum = scn.nextInt();
        return guessNum;
    }
}

class Player{
    // in this the player will guess the no
    int playerNum;
    int playerGuessing(){
        Scanner scn = new Scanner(System.in);
        System.out.println("player guess the no");
        playerNum = scn.nextInt();
        return playerNum;
    }
}

class Umpire{
    // in this the umpire will take input from player and guesser and compare the elements and announce the winner.
    int numGuesser;
    int numPlayer1;
    int numPlayer2;
    int numPlayer3;


    void collectFromGuesser(){
        // in this method we collect the number from guesser
        Guesser g = new Guesser();
        numGuesser = g.guessingNumber(); // in this we storing the obtained result in variable
    }

    void collectFromPlayers(){
        // in this method we take number from player and  storing the result
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numPlayer1=p1.playerGuessing();
        numPlayer2=p2.playerGuessing();
        numPlayer3=p3.playerGuessing();

    }

    void Compare(){
        // in this method the umpire will compare the result and declare the winner
        if(numGuesser == numPlayer1){
            if(numGuesser == numPlayer2 && numGuesser == numPlayer3){
                System.out.println("all three players won the game");
            }else if(numGuesser == numPlayer2){
                System.out.println("player 1 and 2 won the game");
            }else if(numGuesser == numPlayer3){
                System.out.println("player 1 and 3 won the game");
            }else{
                System.out.println("player 1 won the game");
            }


        }else if(numGuesser == numPlayer2){
            if(numGuesser == numPlayer3){
                System.out.println("player 2 and 3 won the game");
            }else{
                System.out.println("player 2 won the game");
            }

        }else if(numGuesser == numPlayer3){
            System.out.println("player 3 won the game");

        }else{
            System.out.println("we have lost the game, try again");
        }
    }
}



public class LaunchGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayers();
        u.Compare();
    }
}
