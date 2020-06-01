package medium.CountOfCharactersInString;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, the task is to write a program in Java which prints the number of occurrences
 * of each character in a string (time complexity must be O(n)).
 * Example --> infinity i-3, n-2, f-1, t-1, y-1;
 *
 * @author Gevorg Mkrtchyan
 */
public class Solution {
    public Map<Character, Integer> count(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();
        for (Character character : chars) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }
}
