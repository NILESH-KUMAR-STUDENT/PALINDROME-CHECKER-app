import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.nextLine();


        Deque<Character> deque = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }


        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}