import java.util.*;

class Player implements Comparable<Player>{
    int score;
    Player(int s){score=s;}
    public int compareTo(Player o){return o.score-this.score;}
}

class TournamentRankingDemo {
    public static void main(String[] args) {
        TreeSet<Player> set=new TreeSet<>();
        set.add(new Player(50));
        set.add(new Player(80));

        for(Player p:set){
            System.out.println(p.score);
        }
    }
}