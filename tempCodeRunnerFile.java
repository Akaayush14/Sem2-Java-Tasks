        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        System.out.println(num + "! = " + fact);
    }
}