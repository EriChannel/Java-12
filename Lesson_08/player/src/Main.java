import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        ArrayList<Player> allPlayer = team.getAllPlayer();
        System.out.println(allPlayer.size());

        ArrayList<Player> chooseTeam = team.buildTeam(allPlayer, 4,4,2);
        for(Player p : chooseTeam){
            System.out.println(p);
        }
    }
}