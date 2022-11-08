import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch
{
    public static void main(String[] args) {
        boolean restart = true;
        while (restart) {
        System.out.println("Please enter a number between 0-9 : ");
        Scanner myscan = new Scanner(System.in);
            try {
                int myNum = myscan.nextInt();
                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You entered " + myNum);
                    restart = false;
                } else {
                    System.out.println("Not a valid number");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        }
    }
}

