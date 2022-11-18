package classes.BoxingMatch;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(){

    }
    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            printFirstFighter(f1.getName());
            while (f1.getHealth() > 0 && f2.getHealth() > 0) {
                System.out.println("======== YENİ ROUND ===========");
                f2.setHealth(f1.hit(f2));
                if (isWin()){
                    break;
                }
                f1.setHealth(f2.hit(f1));
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public List<Fighter> chooseFirstFighter(Fighter f1, Fighter f2){
        double number = Math.random();
        List<Fighter> headsOrTails = new ArrayList<>();
        if(number < 0.5){
            headsOrTails.add(f1);
            headsOrTails.add(f2);
        }else {
            headsOrTails.add(f2);
            headsOrTails.add(f1);
        }
        return headsOrTails;
    }

    public boolean checkWeight() {
        return (f1.getWeight() >= minWeight && f1.getWeight() <= maxWeight)
                && (f2.getWeight() >= minWeight && f2.getWeight() <= maxWeight);
    }

    public boolean isWin() {
        if (f1.getHealth() == 0) {
            System.out.println("Maçı Kazanan : " + f2.getName());
            return true;
        } else if (f2.getHealth() == 0){
            System.out.println("Maçı Kazanan : " + f2.getName());
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.getName() + " Kalan Can \t:" + f1.getHealth());
        System.out.println(f2.getName() + " Kalan Can \t:" + f2.getHealth());
    }

    public void printFirstFighter(String name) {
        System.out.println("------------");
        System.out.println("Baslayan sporcu : " + name);
    }
}
