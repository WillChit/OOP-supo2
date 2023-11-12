import java.util.Random;

public class Game {
    private int value;
    private boolean result;
    private int guesses;

    public Game(int upperBound, int lowerBound, int _guesses){
        Random random = new Random();

        value = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        guesses = _guesses;
    }

    public int guess(int val){
        guesses--;
        if (val < value) return 1;
        if (val > value) return -1;
        result = true;
        return 0;
    }

    public boolean isGameOver(){
        if (result || guesses == 0) return true;
        return false;
    }

    public boolean getResult(){
        return result;
    }
}
