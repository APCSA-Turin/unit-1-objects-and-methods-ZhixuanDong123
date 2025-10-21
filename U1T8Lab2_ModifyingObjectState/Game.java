public class Game {
    private String name;
    private int players;
    private int score;
    
    public Game(String name, int players) {
        this.name = name;
        this.players = players;
        score = 0;  
    }
    public String getGameName() {
        return name;
    }
    public int getPlayers() {
        return players;
    }
    public int getScore() {
        return score;
    }
    public void addPlayer() {
        players++;
    }
    public void increaseScore(int points) {
        score += points;
    }  
    public double averageScorePerPlayer() {
        if (players == 0) {
            return 0.0;
        }
        return (double) score / players;
    }
    public boolean isGameOver() {
        return score > 9;
    }

}
