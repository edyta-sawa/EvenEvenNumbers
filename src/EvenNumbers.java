import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter last value:");
        int userVal = userInput.nextInt();
        for (int evenVal = 2; evenVal <= userVal; evenVal += 2)
            System.out.println(evenVal);
    }
}