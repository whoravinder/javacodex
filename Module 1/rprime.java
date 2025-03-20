import java.util.Scanner;

public class rprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        int i = 2;
        boolean isPrime = true;

        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
        scanner.close();
    }
}
