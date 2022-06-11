package Input;

public class AtmUtil {
    public static void passwordToEnter() {
        int password = 1994;
        while (true) {
            int Inputpassword = (int)InputUtil.RequireNumber("Enter the Password: ");
            if (Inputpassword != password) {
                System.out.println("Wrong password. Try again!");
            }
            if (Inputpassword == password) {
                System.out.println("Successfully entered");
                break;
            }
        }
    }

    private static int balance = 6000;

    public static int getBalance() {
        return balance;
    }

    public static void WithdrawMoney() {
        System.out.println("Available Balance: " + balance + "$");
        while (true) {
            int withdraw = (int) InputUtil.RequireNumber("Enter Amount you want to cash out: ");


            if (withdraw > balance) {
                System.out.println("Sufficient balance! ");
            } else if (withdraw <= balance) {
                balance = balance - withdraw;
                System.out.println("You have received " + withdraw + " Thank you for visiting us!");
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




