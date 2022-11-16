package loops.Practices;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int rightToTry = 3;
        int balance = 1500;
        int select;
        int price;

        while(rightToTry > 0){
            System.out.print("Kullanici Adiniz: ");
            userName = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("1-Para yatırma");
                System.out.println("2-Para Çekme");
                System.out.println("3-Bakiye Sorgula");
                System.out.println("4-Çıkış Yap");

                    do{
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select = input.nextInt();
                        switch (select) {
                            case 1: {
                                System.out.print("Para miktarı : ");
                                price = input.nextInt();
                                balance += price;
                            }
                            case 2 : {
                                System.out.print("Para miktarı : ");
                                price = input.nextInt();
                                if (price > balance)
                                    System.out.println("Bakiye yetersiz.");
                                else
                                    balance -= price;
                            }
                            case 3 : System.out.println("Bakiyeniz : " + balance);
                            case 4 : System.out.println("Tekrar görüşmek üzere.");
                        }
                    }while(select != 4);

            }else{
                rightToTry--;
                if(rightToTry == 0)
                    System.out.println("Hesabiniz bloke olmustur, lutfen bana ile iletisime gecin.");
                else{
                    System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                    System.out.println("Kalan deneme hakkiniz: "+rightToTry);
                }

            }
        }
    }
}
