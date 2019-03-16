import java.util.Scanner;

public class PrimeNumber {
    public static void main(String argv[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        PrimeNumber prime = new PrimeNumber();
        System.out.printf("%d Is %s", number,
                prime.isPrime(number) ? "Prime" : "Not Prime");
    }

    public boolean isPrime(int number)
    {
        for (int n = 2; n < number; n++) {
            if (number % n == 0)
                return false;
        }
        return number != 0 && number != 1 && number != -1;
    }
}
