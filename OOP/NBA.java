public class NBA {
    private String teamName;
    private int championships;

    public NBA(String teamName) {
        this.teamName = teamName;
    }
    
    public void setChampionships(int championships) {
        this.championships = championships;
    }

    public int getChampionships() {
        return championships;
    }

    public String getTeamName() {
        return teamName;
    }
}