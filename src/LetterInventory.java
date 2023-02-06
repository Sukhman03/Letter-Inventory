public class LetterInventory {
        private int[] letterCounts = new int[26]; // tracks counts of letters
        private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; // array with alphabet
        private int totalLetters;

    public LetterInventory(String data) { // gets count of letters, ignoring case & non-alphabetical characters
        for (int i = 0; i < data.length(); i++) {
            char letter = data.toUpperCase().charAt(i);
            int count = 0;
            for (char letterCheck : alphabet) {
                if (letterCheck == letter) {
                    this.letterCounts[count]++;
                    this.totalLetters++;
                }
                count++;
            }
        }
    }

    public int get(char letter) { // returns count of how many of this letter are in inventory, ignores case
        boolean isValidChar = false; // checks if a valid char is passed
        int count = 0;
        int locateLetter = 0;
        for (char letterCheck : alphabet) {
            if (letterCheck == Character.toUpperCase(letter)) {
                isValidChar = true;
                locateLetter = count;
            }
            count++;
        }
        if (isValidChar == false) {
            throw new IllegalArgumentException ("Character Is Not In The Alphabet."); // throws exception with message
        }
        return letterCounts[locateLetter];
    }

    public void set(char letter, int value) { // sets count for the given letter to given value
        if (value < 0) {
            throw new IllegalArgumentException("Number Cannot Be Negative.");
        }
        boolean isValidChar = false; // checks if a valid char is passed
        int count = 0;
        for (char letterCheck : alphabet) {
            if (letterCheck == Character.toUpperCase(letter)) {
                totalLetters -= letterCounts[count]; // subtracts previous count for letter
                isValidChar = true;
                letterCounts[count] = value;
                totalLetters += value; // adds new value to total count
            }
            count++;
        }
        if (isValidChar == false) {
            throw new IllegalArgumentException("Character Is Not In The Alphabet."); // throws exception with message
        }
    }

    public int size() { // returns sum of all counts in this inventory (store size instead of computing every time)
        return totalLetters;
    }

    public boolean isEmpty() { // returns true if this inventory is empty (shouldn't need to examine each of 26 letters)
        if (totalLetters == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() { // returns a string representation of inventory with all letters in lowercase, sorted
            String inventory = "[";

        for (int i = 0; i < 26; i++) { // goes through every letter
            for (int j = letterCounts[i]; j > 0; j--) { // checks how many of the letter is in inventory
                inventory += alphabet[i]; // adds letter to string
            }
        }
        return inventory + "]";
    }

    public LetterInventory add(LetterInventory other) { // returns sum of total letters between other and this
        LetterInventory sum = new LetterInventory("");
        sum.totalLetters = this.totalLetters + other.totalLetters;

        for (int i = 0; i < 26; i++) {
                sum.letterCounts[i] += this.letterCounts[i] + other.letterCounts[i];
            }
        return sum;
    }

    public LetterInventory subtract(LetterInventory other) { // same as add but subtracts
        LetterInventory diff = new LetterInventory("");
        boolean returnNull = false;
        diff.totalLetters = this.totalLetters - other.totalLetters;
        if (diff.totalLetters < 0) {
            returnNull = true;
        }

        for (int i = 0; i < 26; i++) {
            diff.letterCounts[i] = this.letterCounts[i] - other.letterCounts[i];
            if (diff.letterCounts[i] < 0) {
                returnNull = true;
            }
        }

        if (returnNull == true) {
            return null;
        }
        return diff;
    }
}
