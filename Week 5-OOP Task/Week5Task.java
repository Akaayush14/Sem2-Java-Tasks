public class Week5Task{

    void printOddNumbers(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void convertDays(int totalDays) {
        int years = totalDays / 365;
        int months = (totalDays % 365) / 30;
        int days = (totalDays % 365) % 30;
        System.out.println(years + " years, " + months + " months, " + days + " days");
    }

    boolean isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }

    int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    double compoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    boolean isPalindromePrime(int n) {
        return isPrime(n) && isPalindrome(n);
    }

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    boolean isPalindrome(int n) {
        int original = n, reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return original == reverse;
    }

    void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap with temp: a = " + a + ", b = " + b);
    }

    void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap without temp: a = " + a + ", b = " + b);
    }

    int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    void printFactors(int num) {
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    int cube(int num) {
        return num * num * num;
    }

    boolean isDuckNumber(int num) {
        String str = String.valueOf(num);
        return str.indexOf('0') > 0;
    }

    void printTables() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d   ", i, j, i * j);
            }
            System.out.println();
        }
    }

    int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    void countCase(String str) {
        int upper = 0, lower = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }

    boolean isKaprekar(int num) {
        int square = num * num;
        String str = String.valueOf(square);
        int len = str.length();
        for (int i = 1; i < len; i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (right != 0 && left + right == num) return true;
        }
        return num == 1;
    }

    int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    int asciiValue(char c) {
        return (int) c;
    }

    // Main method to test the methods
    public static void main(String[] args) {
        MyJavaMethods obj = new MyJavaMethods();

        obj.printOddNumbers(15);
        obj.convertDays(800);
        System.out.println("Is 18 Harshad? " + obj.isHarshad(18));
        System.out.println("Word count: " + obj.countWords("Java is fun and powerful"));
        System.out.println("Compound interest: " + obj.compoundInterest(1000, 5, 2));
        System.out.println("Is 131 a palindrome prime? " + obj.isPalindromePrime(131));
        obj.swapWithTemp(3, 5);
        obj.swapWithoutTemp(7, 9);
        System.out.println("Sum of first 10 natural numbers: " + obj.sumOfNaturalNumbers(10));
        obj.printFactors(12);
        System.out.println("Cube of 4: " + obj.cube(4));
        System.out.println("Is 102 a Duck number? " + obj.isDuckNumber(102));
        obj.printTables();
        System.out.println("Sum of squares of 123: " + obj.sumOfSquares(123));
        obj.countCase("Java PROGRAMMING Language");
        System.out.println("Is 45 Kaprekar? " + obj.isKaprekar(45));
        System.out.println("Reverse of 1234: " + obj.reverseNumber(1234));
        obj.fibonacci(10);
        System.out.println("ASCII of 'A': " + obj.asciiValue('A'));
    }
}
