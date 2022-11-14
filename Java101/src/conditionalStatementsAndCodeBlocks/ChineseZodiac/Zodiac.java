package conditionalStatementsAndCodeBlocks.ChineseZodiac;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Zodiac {

    private int year;

    //A method to find which chinese zodiac the entered year belongs to
    public String findZodiac(int year){
        String result = "";
        year = year%12;
        if(year == 0)
            result = "Maymun";
        else if(year == 1)
            result = "Horoz";
        else if(year == 2)
            result = "Köpek";
        else if(year == 3)
            result = "Domuz";
        else if(year == 4)
            result = "Fare";
        else if(year == 5)
            result = "Öküz";
        else if(year == 6)
            result = "Kaplan";
        else if(year == 7)
            result = "Tavşan";
        else if(year == 8)
            result = "Ejderha";
        else if(year == 9)
            result = "Yılan";
        else if(year == 10)
            result = "At";
        else if(year == 11)
            result = "Koyun";
        return result;
    }

}
