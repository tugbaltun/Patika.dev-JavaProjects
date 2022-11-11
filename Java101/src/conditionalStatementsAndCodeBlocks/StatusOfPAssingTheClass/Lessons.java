package conditionalStatementsAndCodeBlocks.StatusOfPAssingTheClass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lessons {
    private int math;
    private int Turkish;
    private int physics;
    private int chemical;
    private int music;
    private double average;

    public Lessons(){}

    public Lessons(int math, int Turkish, int physics, int chemical, int music){
        this.math = math;
        this.Turkish = Turkish;
        this.physics = physics;
        this.chemical = chemical;
        this.music = music;
    }

    public double calculateAverage(Lessons lessons){
        int sum = 0;
        if(lessons.getMath()>=0 && lessons.getMath()<=100)
            sum+=lessons.getMath();
        if(lessons.getTurkish()>=0 && lessons.getTurkish()<=100)
            sum+=lessons.getTurkish();
        if(lessons.getPhysics()>=0 && lessons.getPhysics()<=100)
            sum+=lessons.getPhysics();
        if(lessons.getChemical()>=0 && lessons.getChemical()<=100)
            sum+=lessons.getChemical();
        if(lessons.getMusic()>=0 && lessons.getMusic()<=100)
            sum+=lessons.getMusic();
        this.average = sum/5.0;
        return  average;
    }

}
