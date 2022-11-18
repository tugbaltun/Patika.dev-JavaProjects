package classes.StudentInformationSystem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String name;
    private String studentNumber;
    private int classes;
    private Course math;
    private Course physics;
    private Course chemistry;
    private Course verbalGrade;
    private double average;
    private boolean isPass;

    public Student(String name, int classes, String studentNumber, Course math, Course physics, Course chemistry, Course verbalGrade) {
        this.name = name;
        this.classes = classes;
        this.studentNumber = studentNumber;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.verbalGrade = verbalGrade;
        calculateAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(double math, double physics, double chemistry, double verbalGrade){
        if(math >= 0 && math<= 100){
            this.math.setNote(math);
        }

        if(physics >= 0 && physics<= 100){
            this.physics.setNote(physics);
        }

        if(chemistry >= 0 && chemistry<= 100){
            this.chemistry.setNote(chemistry);
        }

        if(verbalGrade >= 0 && verbalGrade<= 100){
            this.verbalGrade.setNote(verbalGrade);
        }
    }

    public void isPass(){
        if(this.math.getNote() == 0 || this.physics.getNote() == 0
                || this.chemistry.getNote() == 0 || this.getVerbalGrade().getNote() == 0){
            System.out.println("Notlar tam olarak girilmemis.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.getAverage());
            if(this.isPass){
                System.out.println("Sinifi gecti.");
            }else{
                System.out.println("Sinifta kaldi.");
            }
        }
    }

    public void calculateAverage(){
        this.setAverage(
                ((this.physics.getNote()
                + this.chemistry.getNote()
                + this.math.getNote())/3)*0.8
                        +this.getVerbalGrade().getNote()*0.2);
    }

    public boolean isCheckPass(){
        calculateAverage();
        return this.getAverage() > 55;
    }

    public void printNote(){
        System.out.println("===================");
        System.out.println("Ogrenci: "+ this.getName());
        System.out.println("Matematik Notu: " + this.math.getNote());
        System.out.println("Fizik Notu: " + this.physics.getNote());
        System.out.println("Kimya Notu : " + this.chemistry.getNote());
        System.out.println("Sozlu Notu : " + this.verbalGrade.getNote());
    }
}
