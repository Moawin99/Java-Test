import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess = input.nextInt();
        int random = new Random().nextInt(100) + 1;

        while (guess != random) {
            if (guess > random) {
                System.out.println("Too high\n");
            } else if (guess < random) {
                System.out.println("Too low\n");
            } else {
                System.out.println("You got it!");
            }
            System.out.println("Enter a new number");
            guess = input.nextInt();
        }
    }
}
