package classes.StudentInformationSystem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
    private String name;
    private String code;
    private String prefix;
    private double note;
    private Teacher courseTeacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher){
        if(this.getPrefix().equals(teacher.getBranch())){
            this.courseTeacher = teacher;
            System.out.println("Islem basarili");
        }else{
            System.out.println(teacher.getName() + "Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.getName());
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamistir.");
        }
    }
}
