import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.nextLine();


        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }


        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}