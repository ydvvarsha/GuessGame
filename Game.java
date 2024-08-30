import java.util.Scanner;

class Guesser
{
    int guessNum;

    int guessNumber()
        {
            try (Scanner sc = new Scanner(System.in)){
                System.out.println("Enter number from Guesser");
            guessNum =sc.nextInt();
            return guessNum;
            }
            
        }
}

class Player
{
    int guessNumFromP;

    int guessNumFromPlayer()
    {
        try (Scanner sc = new Scanner(System.in))
        {
        System.out.println("Enter number from Player");
        guessNumFromP = sc.nextInt();
        return guessNumFromP;
        }
        

    }
}

class Umpire
{
    int numFromGuesser;
    int guessNumFromPlayer1;
    int guessNumFromPlayer2;
    int guessNumFromPlayer3;

    void collectionTheNumFromGuesser()
    {
        Guesser guesser=new Guesser();
        numFromGuesser = guesser.guessNumber();

    }

    void collectionTheNumFromPlayer()
    {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        guessNumFromPlayer1=player1.guessNumFromPlayer();
        guessNumFromPlayer2=player2.guessNumFromPlayer();
        guessNumFromPlayer3=player3.guessNumFromPlayer();


    }
    void compare()
    {
        if(numFromGuesser==guessNumFromPlayer1)
        {
            if(numFromGuesser==guessNumFromPlayer2 && numFromGuesser == guessNumFromPlayer3)
            {
               System.out.println("All players won the game");
            }
            else if(numFromGuesser == guessNumFromPlayer2)
            {
                System.out.println("Player 1 and Player 2 won the game");

            }
            else if(numFromGuesser == guessNumFromPlayer3)
            {
                System.out.println("Player 1 AND player 3 won the game ");
            }
        }
        else if(numFromGuesser == guessNumFromPlayer2)
        {
            if(numFromGuesser == guessNumFromPlayer3)
            {
                System.out.println("Player 2 and 3 won the game");
            }
            else
            System.out.println("Player 2 won the game");
        }
        else if (numFromGuesser==guessNumFromPlayer3) {
            System.out.println("Player 3 won the game");

            
        }
        else 
        {
            System.out.println("No one won the game");
        }
    }
}
public class Game {
public static void main(String[] args) {
    Umpire umpire = new Umpire();
    umpire.collectionTheNumFromGuesser();
    umpire.collectionTheNumFromPlayer();
    umpire.compare();
    
}
}
