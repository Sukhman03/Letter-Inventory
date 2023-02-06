// Programmer: Sukhman Lally
// Class: CS145: Face to Face
// Date: 02/05/2023
// Assignment: LetterInventory
// Reference Materials:
// Purpose: Creating an inventory to store and count letters
public class Main {
    public static void main(String[] args) {
        LetterInventory inventory2 = new LetterInventory("George W. Bush");
        LetterInventory inventory1 = new LetterInventory("Hillary Clinton");
        // inventory size method
        System.out.println(inventory1.size());
        System.out.println(inventory2.size());

        // toString method
        System.out.println(inventory1.toString());

        LetterInventory diff = inventory1.subtract(inventory2);
        // subtract method, prints null
        System.out.println(diff);

        // is empty method
        LetterInventory empty = new LetterInventory(";,' ';' ; '(&%");
        System.out.println(empty.size());
        System.out.println(empty.isEmpty());

        // add method
        System.out.println(inventory2.add(inventory1));

        // get method
        System.out.println(inventory1.get('R'));

        // subtract method, prints the letter inventory
        LetterInventory sub1 = new LetterInventory("AABBCCDDEEFF");
        LetterInventory sub2 = new LetterInventory("ABCDEF");
        LetterInventory sub3 = sub1.subtract(sub2);
        System.out.println(sub3.toString());

    }
}