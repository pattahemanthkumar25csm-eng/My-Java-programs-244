
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



public class LabProg13 {
    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        String[] phone = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        result.add("");

        for (int i = 0; i < digits.length(); i++) {

            int digit = digits.charAt(i) - '0';
            String letters = phone[digit];

            List<String> temp = new ArrayList<>();

            for (String combination : result) {
                for (char ch : letters.toCharArray()) {
                    temp.add(combination + ch);
                }
            }

            result = temp;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits (2-9): ");
        String digits = sc.nextLine();

        List<String> answer = letterCombinations(digits);

        System.out.println("Letter combinations: " + answer);

        sc.close();
    }
}