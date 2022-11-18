package classes.BoxingMatch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring();
        List<Fighter> fighterList = r.chooseFirstFighter(marc, alex);
        r = new Ring(fighterList.get(0),fighterList.get(1) , 90 , 100);
        r.run();
    }
}
