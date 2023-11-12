public class Player {
    private int gamesPlayed;
    private int gamesWon;

    public Player(){
        gamesWon = 0;
        gamesPlayed = 0;
    }

    public int getGamesPlayed() {return gamesPlayed;}
    public int getGamesWon() {return gamesWon;}

    public void incrementGamesPlayed() {
        gamesPlayed++;
    }

    public void incrementGamesWon(){
        gamesWon++;
    }
}
