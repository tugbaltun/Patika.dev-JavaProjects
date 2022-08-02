package conditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String[] args) {

        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = input.nextInt();
        System.out.println("Enter the second number:");
        number2 = input.nextInt();

        System.out.println("1-Addition\n2-Subraction\n3-Multiplication\n4-Division");
        System.out.println("Choose the math operation to do:");
        select = input.nextInt();

        if(select == 1){
            System.out.println("Result of Addition="+(number1+number2));
        }else if(select == 2){
            System.out.println("Result of Subtraction="+(number1-number2));
        }else if(select == 3){
            System.out.println("Result of Subtraction="+(number1*number2));
        }else if(select ==4){
            try{
                System.out.println("Result of multiplication="+(number1/number2));
            }catch (ArithmeticException  e){
                System.out.println("Divisor cannot be zero!");
            }
        }
        else{
            System.out.println("You made the wrong choice. Please enter a number from 1-4");

        }

    }
}
