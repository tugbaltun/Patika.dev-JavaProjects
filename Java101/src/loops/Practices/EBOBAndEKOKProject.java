package loops.Practices;

import java.util.Scanner;

public class EBOBAndEKOKProject {

    public static int ebob(int n1, int n2){
        int ebob = 1;
        for(int i=1; i <= n1; i++){
            if(n1 % i == 0 && n2% i == 0)
                ebob = i;
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayisisini giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        int n2 = input.nextInt();
        int EBOB, EKOK;
        if(n1<n2){
            EBOB = ebob(n1, n2);
        }else{
            EBOB = ebob(n2,n1);
        }
        EKOK = (n1*n2)/EBOB;
        System.out.println("EBOB: "+EBOB);
        System.out.println("EKOK: "+EKOK);



    }
}
