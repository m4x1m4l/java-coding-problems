package chapter1;

public class Solution8 {
    //Removing white spaces from a string: Write a program that removes all
    //white spaces from the given string.
    public String removeWhitespaces(String s){
        return s.replaceAll("\\s", "");
    }
}
