import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to Simple Quiz");

        // Question 1
        System.out.println("\n1. What is the size of int in Java?");
        System.out.println("1. 8 bit");
        System.out.println("2. 16 bit");
        System.out.println("3. 32 bit");
        System.out.println("4. 64 bit");
        System.out.print("Enter your answer: ");
        int ans1 = sc.nextInt();
        if (ans1 == 3) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which method is the entry point of Java?");
        System.out.println("1. start()");
        System.out.println("2. main()");
        System.out.println("3. run()");
        System.out.println("4. init()");
        System.out.print("Enter your answer: ");
        int ans2 = sc.nextInt();
        if (ans2 == 2) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which is NOT an access modifier?");
        System.out.println("1. public");
        System.out.println("2. private");
        System.out.println("3. protected");
        System.out.println("4. package");
        System.out.print("Enter your answer: ");
        int ans3 = sc.nextInt();
        if (ans3 == 4) {
            score++;
        }

        // Result
        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}
