package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1 {
    //Counting duplicate characters: Write a program that counts duplicate
    //characters from a given string

    public int countDuplicates(String string){
        //counts how many are not unique -> books wants a count for every char...
        return string.length() - Arrays.stream(string.split("")).distinct().toList().size();
    }


    public String countDuplicates2(String string){

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : string.toCharArray()){
            if (map.containsKey(c)){
                map.replace(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        return map.toString();
    }

    //Solutions in Book:
    public Map<Character, Integer> countDuplicateCharacters1(String str) {
        Map<Character, Integer> result = new HashMap<>();
        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public Map<Character, Long> countDuplicateCharacters2(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }


}
