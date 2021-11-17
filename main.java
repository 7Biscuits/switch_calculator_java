import java.util.Scanner;

public class switchCalculator {

    public static Scanner sc = new Scanner(System.in);
    public static float num1;
    public static float num2;

    public static void main(String[] args) {

        System.out.println("Enter the first the number: ");
        num1 = sc.nextFloat();

        System.out.println("Enter the second number: ");
        num2 = sc.nextFloat();

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(addition(num1, num2));
                break;
            case '-':
                System.out.println(subtraction(num1, num2));
                break;
            case '*':
                System.out.println(multiplication(num1, num2));
                break;
            case '/':
                System.out.println(division(num1, num2));
                break;
            case '^':
                System.out.println(square(num1, num2));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public static float addition(float num_1, float num_2) {
        return num_1 + num_2;
    }

    public static float subtraction(float num_1, float num_2) {
        return num_1 - num_2;
    }

    public static float multiplication(float num_1, float num_2) {
        return num_1 * num_2;
    }

    public static float division(float num_1, float num_2) {
        return num_1 / num_2;
    }

    public static float square(float num1, float num2) {
        float pow = (float) Math.pow(num1, num2);
        return pow;
    }
}
