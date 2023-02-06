import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] letterCounts = new int[26];
        int totalLetters = 0;
        String data = "Hello World!";
        char letter = '%';
        int count = 0;
        boolean isValidChar = false;
        for (char letterCheck : alphabet) {
            if (letterCheck == letter) {
                letterCounts[count]++;
                System.out.println(letterCounts[count]);
                isValidChar = true;
            }
            count++;
        }
        if (isValidChar == false) {
                throw new IllegalArgumentException ("Character is not in the alphabet.");
        }
        System.out.println(Arrays.toString(letterCounts));
        System.out.println(totalLetters);
    }
}