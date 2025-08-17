import java.util.Scanner;

public class SumOfNumbers {

    public static void sumFirstAndLast() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 Number");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(numbers[0] + numbers[numbers.length - 1]);
    }

    public static void printXNNumberofTimes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x = sc.nextInt();

        System.out.println("Enter N");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(x);
        }
    }

    public static void printLastCharOfString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();

        System.out.println(str.charAt(str.length() - 1));
    }



    public static void main(String[] args) {
//        sumFirstAndLast();
//        printXNNumberofTimes();
        printLastCharOfString();
    }
}
