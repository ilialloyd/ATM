package Input;

public class AtmUtil {
    public static void passwordToEnter() {
        int password = 1994;
        while (true) {
            int inputPassword = (int)InputUtil.RequireNumber("Enter the Password: ");
            if (inputPassword != password) {
                System.out.println("Wrong password. Try again!");
            }
            if (inputPassword == password) {
                System.out.println("Successfully entered");
                break;
            }
        }
    }


    private static int balance = 6000;

    public static int getBalance() {
        return balance;
    }

    public static void withDrawMoney() {
        System.out.println("Available Balance: " + balance + "$");
        while (true) {
            int withDraw = (int) InputUtil.RequireNumber("Enter Amount you want to cash out: ");


            if (withDraw > balance) {
                System.out.println("Sufficient balance! ");
            } else if (withDraw <= balance) {
                balance = balance - withDraw;
                System.out.println("You have received " + withDraw + " Thank you for visiting us!");
                System.out.println("Your current balance: " + balance + "$");
                break;
            } else
                System.out.println("Please enter correct number");


        }
    }

    public static void Deposit() {
        int depositMoney = (int)InputUtil.RequireNumber("How much do you want to deposit: ");
        balance = depositMoney + balance;
        System.out.println("You have received " + depositMoney + " Thank you for visiting us!");
        System.out.println("Your current balance: " + balance + "$");
    }

}




