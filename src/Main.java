import java.util.HashMap;
import java.util.Map;

public class Main {
    protected static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            char lowChar = Character.toLowerCase(c);
            if (Character.isLetter(lowChar)) {
                if (charCountMap.containsKey(lowChar)) {
                    charCountMap.put(lowChar, charCountMap.get(lowChar) + 1);
                } else {

                    charCountMap.put(lowChar, 1);
                }
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        int maxValue = 0;
        char maxKey = ' ';
        for (Character key : charCountMap.keySet()) {
            if (charCountMap.get(key) > maxValue) {
                maxValue = charCountMap.get(key);
                maxKey = key;
            }
        }
        System.out.println("\n" + "The most common letter: " + maxKey + " = " + maxValue);

        int minValue = maxValue;
        char minKey = ' ';
        for (Character key : charCountMap.keySet()) {
            if (charCountMap.get(key) < minValue) {
                minValue = charCountMap.get(key);
                minKey = key;
            }
        }
        System.out.println("\n" + "The least common letter: " + minKey + " = " + minValue);
    }
}