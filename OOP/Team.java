public class Team extends NBA{
    private String starPlayer;
    private int playerNumber;

    public Team(String teamName) {
        super(teamName);
    }

    public void setStarPlayerName(String name) {
        this.starPlayer = name;
    }
    
    public String getStarPlayerName() {
        return starPlayer;
    }

    public void setPlayerNumber(int number) {
        this.playerNumber = number;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
    
}
