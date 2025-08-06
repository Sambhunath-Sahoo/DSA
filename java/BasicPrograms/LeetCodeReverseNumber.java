package BasicPrograms;
import java.util.Scanner;

public class LeetCodeReverseNumber {

    public static int reverseNumber(int num) {
        int result = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to be reversed: ");
        int num = scanner.nextInt();
        int result = reverseNumber(num);
        System.out.println(result);
    }
}

