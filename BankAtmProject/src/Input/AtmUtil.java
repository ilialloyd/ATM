package Input;

public class AtmUtil {
    public static void passwordToEnter() {
        int password = 1994;
        while (true) {
            int Inputpassword = InputUtil.RequireNumber("Enter the Password: ");
            if (Inputpassword != password) {
                System.out.println("Wrong password. Try again!");
            }
            if (Inputpassword == password) {
                System.out.println("Successfully entered");
                break;
            }
        }
    }

    public static int bal = 6000;

    public static void WithdrawMoney() {
        System.out.println("Available Balance: " + bal + "$");
        while (true) {
            int withdraw = InputUtil.RequireNumber("Enter Amount you want to cash out: ");

            if (withdraw > bal) {
                System.out.println("Sufficient balance! ");
            }
            if (withdraw <= bal) {
                int currentBalance = bal- withdraw;

                System.out.println("You have received " + withdraw + " Thank you for visiting us!");
                System.out.println("Your current balance: " + currentBalance + "$");
                break;
            }

        }
    }

    public static void Deposit(){
        int depositMoney= InputUtil.RequireNumber("How much do you want to deposit: ");


        System.out.println(c);
    }

    }
}




