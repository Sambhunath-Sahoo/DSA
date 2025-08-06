package BasicPrograms;
import java.util.Scanner;

public class GFGCountSelfDivideDigits {

    public static int countSelfDividingDigits(int n) {
        int originalNumber = n;
        int counter = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit != 0 && originalNumber % digit == 0) {
                counter++;
            }
            n /= 10;
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        int number = scanner.nextInt();
        System.out.println(countSelfDividingDigits(number));
    }
}

