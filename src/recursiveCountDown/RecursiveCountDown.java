package recursiveCountDown;

import java.util.Scanner;

/**
 * Recursively counts down to 0.
 * 
 * @author panayotismatsinopoulos
 *
 */
public class RecursiveCountDown {
    public static void countDown(int number) {
        System.out.println(number);
        if (number > 0) {
            countDown(number - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Give me a number to count down from: ");
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            countDown(number);
        }
        
        scanner.close();
    }
}
