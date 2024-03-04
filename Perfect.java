/* Displays every perfect number up to user input
 * Markos Trujillo
 * 3/4/24
 */
import java.util.Scanner;

public class Perfect {

    // Method that checks if the number is perfect
    static boolean isPerfect(int num) {

        int sum = 0;

        for (int i = 1; i < num; ++i) {

            if (num % i == 0) {
                sum += i;
            }

        }

        if (sum == num) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        
        // Variables
        int num=1, maxNum;
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter a maximum number >> ");
        maxNum = input.nextInt();

        // Loop
        while (num <= maxNum) {

            if (isPerfect(num) == true) {
                System.out.println("The number " +num+ " is perfect");
            }
            num++;
        }

    }
}
