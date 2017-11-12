/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author khans4349
 */
public class A3Q5 {
// swap method, his time however it is designed for a string array
    // allows to swap two positions in an array by temporarily storing one of the strings until both strings can be in its proper position

    public void alphabeticalSwap(String[] array, int p1, int p2) {
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    // Insertion sort method to sort strings in alphabetical order
    public void alphabeticalInsertionSort(String[] array) {
        // start going through the array of the string
        for (int i = 0; i < array.length - 1; i++) {
            // store position
            int position = i;
            // while the two strings, when compared to zero is greater than 0, swap their placements
            while (position >= 0 && array[position].compareTo(array[position + 1]) > 0) {
                // if out of place, swap it downwards 
                // until correct position is reached  
                alphabeticalSwap(array, position, position + 1);
                position--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // run test
        A3Q5 test = new A3Q5();

        // create an array of strings
        String words[] = new String[5];

        // sample list
        words[0] = "bat";
        words[1] = "sat";
        words[2] = "hat";
        words[3] = "cat";
        words[4] = "rat";

        // method
        test.alphabeticalInsertionSort(words);

        // check
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }

}
