package conditionalStatementsAndCodeBlocks.SuggestingEventsBasedOnAirTemperature;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Heat {
    private int heat;

    public void getEvent(int heat){
        if(heat<5)
            System.out.println("Kayak yapabilirsiniz.");
        else if(heat<10)
            System.out.println("Sinemaya gidebilirsiniz");
        else if(heat<=15)
            System.out.println("Sinemaya veya Pikniğe gidebilirsiniz.");
        else if(heat<=25)
            System.out.println("Pikniğe gidebilirsiniz.");
        else
            System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
