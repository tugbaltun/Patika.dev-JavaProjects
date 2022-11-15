package loops.PrimeNumbers;

public class Main {
    public static boolean isPrime(int number){

        // Corner case
        if (number <= 1)
            return false;

        // Check from 2 to number-1
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        //Prints prime numbers between 1 and 100
        for(int i=1; i<=100; i++){
            //Checks if i is prime or not with isPrime Method
            //and prints the prime numbers to console
            System.out.print(isPrime(i)? i+" ": "");
        }
    }
}
