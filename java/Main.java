import chapter1.Solution1;
import chapter1.Solution2;

public class Main {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        System.out.println(solution2.findFirstNonRepeatedChar("aabbccdff"));
        System.out.println(solution2.firstNonRepeatedCharacterSolution1("aabbccdff"));
        System.out.println(solution2.firstNonRepeatedCharacterSolution3("aabbccdff"));
    }
}
