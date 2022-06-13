package Input;

public class Menu {

    public static void SelectMenu() {
       int menu = (int)InputUtil.RequireNumber("Choose the action: " +
                "\n 1. Show the current balance." +
                "\n 2. Withdraw money from balance." +
                "\n 3. Deposit money." +
                "\n 4. Cancel session, return the card");
        if (menu == 1) {
            System.out.println("Your current balance is " + AtmUtil.getBalance() + "$");
        } else if (menu == 2) {
            AtmUtil.withDrawMoney();
        } else if (menu == 3) {
            AtmUtil.Deposit();
        } else if (menu == 4) {
            System.exit(1);
        } else {
            System.out.println("Please enter correct number");
        }
    }
}





