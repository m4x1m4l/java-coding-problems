package chapter1;

public class Solution7 {
    //Converting String into int, long, float, or double: Write a program
    //that converts the given String object (representing a number) into int,
    //long, float, or double.

    public int parseStringToInt(String s){
        return Integer.parseInt(s);
    }

    public long parseStringToLong(String s){
        return Long.parseLong(s);
    }

    public float parseStringToFloat(String s){
        return Float.parseFloat(s);
    }

    public double parseStringToDouble(String s){
        return Double.parseDouble(s);
    }
}
