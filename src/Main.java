// Programmer: Sukhman Lally
// Class: CS145: Face to Face
// Date: 02/05/2023
// Assignment: LetterInventory
// Reference Materials:
// Purpose: Creating an inventory to store and count letters
public class Main {
    public static void main(String[] args) {
        LetterInventory inventory1 = new LetterInventory("AABBCCDDEEFFGGHHIIJJKK");
        LetterInventory inventory2 = new LetterInventory("abcdefghijk");
        //System.out.println(inventory1.size());
        //System.out.println(inventory2.size());
       LetterInventory sum = inventory1.add(inventory2);
       // System.out.println(sum.size());
        //System.out.println(sum.toString());
        LetterInventory diff = inventory1.subtract(inventory2);
        System.out.println(diff.size());
        System.out.println(diff.toString());
    }
}