public class Main {
    public static void main(String[] args) {
        Team lakers = new Team("Lakers");
        Team warriors = new Team("Warriors");
        Team bulls = new Team ("Bulls");

        lakers.setChampionships(17);
        lakers.setStarPlayerName("Kobe Bryant");
        
        warriors.setChampionships(4);
        warriors.setStarPlayerName("Stephen Curry");

        bulls.setChampionships(5);
        bulls.setStarPlayerName("Michael Jordan");

        String lakersName = lakers.getTeamName();

        System.out.println(lakersName);
        
    }
}
