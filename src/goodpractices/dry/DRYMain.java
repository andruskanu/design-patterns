package goodpractices.dry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DRYMain {

    public static void main(String[] args) {

        System.out.println("Sum: " + addNumbers(2, 3));

        System.out.println("-------------------------------");

        DRYMain sum = new DRYMain();
        sum.addNumberFromKeyboard();

    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }


    public void addNumberFromKeyboard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("firstNumber = ");
        int firstNumber = getValidNumberFromConsole(sc);

        System.out.print("secondNumber = ");
        int secondNumber = getValidNumberFromConsole(sc);
        System.out.println("Sum: " + (firstNumber + secondNumber));
    }

    public int getValidNumberFromConsole(Scanner sc) {
        int numberFromInput;
        try {
            numberFromInput = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("The number is not valid");
            System.out.print("Try again: ");
            sc.nextLine();
            numberFromInput = getValidNumberFromConsole(sc);
        }
        return numberFromInput;
    }
}
