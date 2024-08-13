import chapter1.Solution1;
import chapter1.Solution2;
import chapter1.Solution3;

public class Main {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        System.out.println(solution2.findFirstNonRepeatedChar("aabbccdff"));
        System.out.println(solution2.firstNonRepeatedCharacterSolution1("aabbccdff"));
        System.out.println(solution2.firstNonRepeatedCharacterSolution3("abcdef"));

        Solution3 solution3 = new Solution3();
        System.out.println(solution3.reverseWords("Hallo 123 das ist ein Test"));

        System.out.println(solution3.reverseWordsAndSentence("Hallo 123 das ist ein Test"));
    }
}
