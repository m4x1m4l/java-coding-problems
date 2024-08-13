package chapter1;

public class Solution5 {
    //Counting vowels and consonants: Write a program that counts the
    //number of vowels and consonants in a given string. Do this for the English
    //language, which has five vowels (a, e, i, o, and u).

    public int countVowels(String string){
        return string.toLowerCase().replaceAll("[^aeiou]", "").length();

    }

    public int countConsonants(String string){
        return string.toLowerCase().replaceAll("[aeiou]", "").length();

    }


}
