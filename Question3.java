//WAP to print the given pattern:
// import java.util.Scanner;
// public class Question3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("*****");

//     }
// }

//Next way:using for loop
public class Question3{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





