package methods.CreatingMethodsByPattern;

import java.util.Scanner;

public class Main {

    public static void pattern(int number, int counter, boolean flag){
        //If number equals or smaller than number than print number and return flag in to false
        if(number<=0)
            flag = false;
        System.out.print(number + " ");

        //If flag is true, reduce the number by five
        if(flag){
            pattern(number - 5, counter + 1, flag);
        }

        else{
            //If we reach to first number again then break from method
            if(counter == 0)
                return;
            //If flag is false, increase the number by five
            pattern(number + 5, counter - 1, flag);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User enters N value
        System.out.print("N Sayisi: ");
        int N = input.nextInt();
        //Call the pattern() method and print the results
        System.out.print("Çiktisi: ");
        pattern(N, 0, true);

    }
}
