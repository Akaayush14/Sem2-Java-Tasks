//1
//WAP to find if a number is prime or composite:
import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite.");
        } 
        else {
            boolean prime = true;
            //n is being divided by zero then n is not a prime number.
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is a composite number.");
            }
        }
    }
}