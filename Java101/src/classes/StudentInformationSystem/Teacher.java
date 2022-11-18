package classes.StudentInformationSystem;

import lombok.Data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {
    private String name;
    private String mpNo;
    private String branch;

    public Teacher(String name, String mpNo, String branch) {
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }

}
