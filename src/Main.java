import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int evenVal = 2;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter last value:");
        int userVal = userInput.nextInt();
        do {
            System.out.println(evenVal);
            evenVal += 2;
        } while (evenVal <= userVal);
    }
}