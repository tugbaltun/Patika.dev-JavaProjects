package conditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class UserLogin {
    private static String defaultUsername = "Patika";
    private static String defaultPassword = "Java101";
    public static void main(String[] args) {
        String username, password, newPassword;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.println("Username:");
        username = input.nextLine();

        System.out.println("Password:");
        password = input.nextLine();

        if(username.equals(defaultUsername) && password.equals(defaultPassword)){
            System.out.println("Logged in!");
        }else if(username.equals(defaultUsername)){
            System.out.println("You entered the wrong password!\nWould you like to reset your password?");
            System.out.println("Press 1 for yes and 0 for no.");
            select = input.nextInt();

            switch (select){
                case 0:
                    System.out.println("Your password will not be reset");
                    break;
                case 1:
                    System.out.println("Enter your new password");
                    newPassword = input.next();
                    if(newPassword.equals(defaultPassword)){
                        System.out.println("Your new password cannot be the same as your old password. please enter a different password.");
                    }else{
                        defaultPassword = newPassword;
                        System.out.println("Your new password has been created. Please login again.");
                    }
                    break;
                default:
                    System.out.println("You keyed wrong. Please dial 1 or 0.");
                    break;
            }
        }else{
            System.out.println("Invalid username and password. Please try again");
        }


    }
}
