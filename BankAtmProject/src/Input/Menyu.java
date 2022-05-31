package Input;

public class Menyu {

        public static void SelectMenu() {
            int menu = 0;
               menu= InputUtil.RequireNumber("Choose the action: " +
                        "\n 1. Show the current balance." +
                        "\n 2. Withdraw money from balance." +
                        "\n 3. Deposit money." +
                        "\n 4. Cancel session, return the card");
                    if (menu == 1) {
                        System.out.println("Your current balance is "+AtmUtil.bal+"$");
                    }
                    if(menu==2){
                        Input.AtmUtil.WithdrawMoney();
                    }
                    if(menu==3){

                    }
                }
            }





