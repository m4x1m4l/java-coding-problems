package chapter1;

public class Solution4 {
    //Checking whether a string contains only digits: Write a program that
    //checks whether the given string contains only digits.

    public boolean checkIfOnlyDigits(String string){
        //return string.replaceAll("\\d+", "").isEmpty();
        return string.matches("\\d+");
    }
}
