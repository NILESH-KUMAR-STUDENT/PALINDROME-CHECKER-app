import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("-----------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.nextLine();


        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }


    private static boolean checkPalindrome(String str, int start, int end) {


        if (start >= end) {
            return true;
        }


        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }


        return checkPalindrome(str, start + 1, end - 1);
    }
}