package utilities;

import java.util.Scanner;

public class InputHelper {

    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }

}
