package Atm;

import Input.AtmUtil;
import Input.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Scotia bank!");
        AtmUtil.passwordToEnter();
        while(true){
            Menu.SelectMenu();
        }
    }
}