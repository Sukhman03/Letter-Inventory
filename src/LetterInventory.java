public class LetterInventory {
        private int[] letterCounts = new int[26];
        private char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
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

    public int get(char letter) { // returns count of how many of this letter are in inventory, ignores case,  // throws IllegalArgumentException if invalid char passed
        boolean isValidChar = false; // checks if a valid char is passed
        int count = 0;
        for (char letterCheck : alphabet) {
            if (letterCheck == Character.toUpperCase(letter)) {
                isValidChar = true;
            }
            count++;
        }
        if (isValidChar == false) {
            throw new IllegalArgumentException ("Character is not in the alphabet"); // throws exception with message
        }
        return letterCounts[count];
    }

    public void set(char letter, int value) { // sets count for the given letter to given value

    }

    public int size() { // returns sum of all counts in this inventory (store size instead of computing every time)
        return 1;
    }

    public boolean isEmpty() { // returns true if this inventory is empty (shouldn't need to examine each of 26 letters)
        return true;
    }

    public String toString() { // returns a string representation of inventory with all letters in lowercase, sorted
            return "";                           // in order, in brackets
    }

    public LetterInventory add(LetterInventory other) { // returns a new LetterInventory object that represents the sum
            return other;                                               // of this letter inventory and another (counts added together)
    }

    public LetterInventory subtract(LetterInventory other) { // same as add but subtracts
            return other;
    }
}
