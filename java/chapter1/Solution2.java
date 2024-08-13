package chapter1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution2 {
    //Finding the first non-repeated character: Write a program that returns the
    //first non-repeated character from a given string.

    public Character findFirstNonRepeatedChar(String string) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        //put everything in map
        //insert new entry or add + 1
        //loop over map and return first with 1
        for (Character c : string.toCharArray()) {
            if(map.containsKey(c)){
                map.replace(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }
        char result = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    //solutions
    private static final int EXTENDED_ASCII_CODES = 256;
    public char firstNonRepeatedCharacterSolution1(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }
        int position = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ?
                Character.MIN_VALUE : str.charAt(position);
    }

    public char firstNonRepeatedCharacterSolution2(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();
        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

    public static String firstNonRepeatedCharacterSolution3(String str) {
        Map<Integer, Long> chs = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        int cp = chs.entrySet().stream()

                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));
    }

}
