import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continueRolling;

        do {
            int die1, die2, die3, sum;
            int rollCount = 0;

            System.out.printf("%-4s %-6s %-6s %-6s %-4s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            do {
                rollCount++;
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                sum = die1 + die2 + die3;

                System.out.printf("%-4d %-6d %-6d %-6d %-4d\n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            continueRolling = response.equals("yes");
        } while (continueRolling);

        scanner.close();
    }
}