package Input;

import java.util.Scanner;

public class InputUtil {
     public static String Requiretext(String title){
         Scanner sc =new Scanner(System.in);
         System.out.println(title);
         String answer = sc.nextLine();
         return answer;
     }

    public static double RequireNumber(String title){
        Scanner sc =new Scanner(System.in);
        System.out.println(title);
        int number = (int)sc.nextDouble();
        return number;
    }
}
