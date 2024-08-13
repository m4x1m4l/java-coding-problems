package chapter1;

import java.util.Arrays;

public class Solution9 {
    //Joining multiple strings with a delimiter: Write a program that joins the
    //given strings by the given delimiter.

    public String joinByDelimiter(char c, String... strings){
        return String.join(String.valueOf(c), strings);
    }
}
