 //package number;

import java.util.HashMap;
import java.util.Map;

public class LabProgram9 {
    private static final Map<Character, Integer> VALUES = new HashMap<>();

    static {
        VALUES.put('I', 1);
        VALUES.put('V', 5);
        VALUES.put('X', 10);
        VALUES.put('L', 50);
        VALUES.put('C', 100);
        VALUES.put('D', 500);
        VALUES.put('M', 1000);
    }

    public static int romanToInteger(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = VALUES.get(s.charAt(i));
            if (i + 1 < s.length() && cur < VALUES.get(s.charAt(i + 1))) {
                total -= cur;
            } else {
                total += cur;
            }
        }
        return total;
    }
}
