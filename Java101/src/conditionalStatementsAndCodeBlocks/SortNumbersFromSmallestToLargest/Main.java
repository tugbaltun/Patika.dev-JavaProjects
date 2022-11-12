package conditionalStatementsAndCodeBlocks.SortNumbersFromSmallestToLargest;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b ,c;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = inp.nextInt();

        System.out.println("enter the second number:");
        b = inp.nextInt();

        System.out.println("Enter the third number:");
        c = inp.nextInt();

        if(a < b && a < c) {
            if(b < c)
                System.out.println("a<b<c");
            else
                System.out.println("a<c<b");
        }
        else if(b<a && b<c){
            if(a < c)
                System.out.println("b<a<c");
            else
                System.out.println("b<c<a");
        }
        else{
            if(a<b)
                System.out.println("c<a<b");
            else
                System.out.println("c<b<a");
        }

    }
}
