package chapter1;

public class Solution6 {
    //Counting occurrences of a certain character: Write a program that counts
    //the occurrences of a certain character in a given string.

    public int countOccurence(String s, char c){
        int counter = 0;
        for (char c1 : s.toCharArray()){
            if(c1 == c) counter++;
        }
        return counter;
    }

    public int countOccurence2(String s, char c){
        return s.replaceAll("[^" + c  + "]", "").length();
    }

    public int countOccurence3(String s, char c) {
        return (int) s.chars()                   // Stream von int-Werten (Unicode-Codepunkten)
                .filter(ch -> ch == c)         // Filter für das gesuchte Zeichen
                .count();                     // Zähle die Anzahl der Vorkommen
    }

}
