/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author khans4349
 */
public class A3Q2 {

    public int smallestMissingNumber(int[] array) {

        // create and integer set to the arrays first positions digit
        int gap = array[0];

        // make a for loop to run through the array
        for (int i = 0; i < array.length; i++) {
            // if there is a gap then return the value for when the gap exists
            if (gap != array[i]) {
                return gap;
            } else {
                // if there is no gap then increase the value of the gap by 1
                if (gap == array[i]) {
                    gap = gap + 1;
                }
            }
        }
        // if there is no gap in the array than return zero to notify user
        return 0;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q2 test = new A3Q2();
        
        // making an array of ints
        int[] numbers = new int[10];
        
        // predesignated values
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 10;

        // make an integer for the answer
        int gap = test.smallestMissingNumber(numbers);
        
        // print out answer
        System.out.println(gap);
    }
}
