import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class LabProgram6 {
    static String longest(String s) {
        Map<Character, Integer> last = new HashMap<>();
        int start = 0, bestStart = 0, bestLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last.containsKey(c) && last.get(c) >= start) {
                start = last.get(c) + 1;
            }
            last.put(c, i);
            if (i - start + 1 > bestLen) {
                bestLen = i - start + 1;
                bestStart = start;
            }
        }
        return s.substring(bestStart, bestStart + bestLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        String r = longest(s);
        System.out.println("Output: " + r.length() + "  string: " + r);
    }
}