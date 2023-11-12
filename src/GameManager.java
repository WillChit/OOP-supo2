import java.util.Objects;
import java.util.Scanner;

public class GameManager {
    private Player player;

    public void run(){
        player = new Player();

        boolean done = false;
        while (!done){
            playGame();

            Scanner scanner = new Scanner(System.in);
            System.out.println("games played: " + player.getGamesPlayed());
            System.out.println("games won: " + player.getGamesWon());

            System.out.println("would you like to play again? input 'Yes'");
            String inp = scanner.next();
            if (!Objects.equals("Yes", inp)) done = true;
        }
    }

    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input lower bound for number: ");
        int lowerBound = Integer.parseInt(scanner.next());

        System.out.println("input upper bound for number: ");
        int upperBound = Integer.parseInt(scanner.next());

        System.out.println("input number of guesses: ");
        int guesses = Integer.parseInt(scanner.next());

        Game game = new Game(upperBound, lowerBound, guesses);

        while (!game.isGameOver()){
            System.out.println("enter your guess");
            int guess = Integer.parseInt(scanner.next());

            int res = game.guess(guess);
            if (res == 1) System.out.println("go higher");
            else if (res == -1) System.out.println("go lower");
        }

        if (game.getResult()){
            System.out.println("correct");
            player.incrementGamesWon();
        } else System.out.println("out of guesses");
        player.incrementGamesPlayed();
    }
}
