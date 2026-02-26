import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");


        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String original = sc.nextLine();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }


        boolean isPalindrome = original.equals(reversed);


        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}