package chapter1;

import java.util.ArrayList;


public class Solution3 {
    //Reversing letters and words: Write a program that reverses the letters of
    //each word and a program that reverses the letters of each word and the
    //words themselves.
    //Aufgabe 1: Reihenfolge der Wörter bleiben erhalten, innerhalb eines Worts wird die Reihenfolge der Buchstaben gedreht
    //Aufgabe 2: Wörter drehen und Wörter Reihenfolge drehen

    public String reverseWords(String string){
        String[] words = string.split(" ");
        ArrayList<String> resultArray = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words){
            sb.append(word);
            resultArray.add(sb.reverse().toString());
            sb.setLength(0);
        }

        for(String result : resultArray){
            sb.append(result + " ");
        }
        sb.setLength(sb.length() -1 );
        return sb.toString();
    }

    public String reverseWordsAndSentence(String string){
        //revereWords aufrufen
        //in array einfügen
        //array von hinten durchlaufen

        return new StringBuilder(string).reverse().toString();
//        string = reverseWords(string);
//
//        String[] words = string.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = words.length -1; i >= 0; i--){
//            sb.append(words[i] + " ");
//        }
//        sb.setLength(sb.length() -1);
//        return sb.toString();
    }


}
