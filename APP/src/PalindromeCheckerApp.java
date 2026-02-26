import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("UC13: Performance Comparison");
        System.out.println("-----------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();


        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long stackTime = System.nanoTime() - startTime;


        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long dequeTime = System.nanoTime() - startTime;


        startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(input, 0, input.length() - 1);
        long recursiveTime = System.nanoTime() - startTime;


        System.out.println("\n--- Performance Results (in nanoseconds) ---");
        System.out.println("Stack Method     : " + stackTime + " ns | Result: " + stackResult);
        System.out.println("Deque Method     : " + dequeTime + " ns | Result: " + dequeResult);
        System.out.println("Recursive Method : " + recursiveTime + " ns | Result: " + recursiveResult);

        sc.close();
    }


    private static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stacki0 Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }


    private static boolean dequePalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }


    private static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return recursivePalindrome(str, start + 1, end - 1);
    }
}