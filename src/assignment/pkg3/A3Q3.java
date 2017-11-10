/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author khans4349
 */
public class A3Q3 {

    public int countOnes(int[] array) {

        // set the counter equal to zero
        int counter = 0;

        // run the for loop through the entire array
        for (int i = 0; i < array.length; i++) {
            // if a position on the array is equal to 1 than increase the counter by 1 to record how many times 1 was used
            if (array[i] == 1) {
                counter = counter + 1;
            }
        }
        // once the forloop is completed return how many times 1 was used
        return counter;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q3 test = new A3Q3();

        // making an array of ints
        int[] numbers = new int[10];

        // predesignated values
        numbers[0] = 0;
        numbers[1] = 0;
        numbers[2] = 1;
        numbers[3] = 0;
        numbers[4] = 0;
        numbers[5] = 1;
        numbers[6] = 0;
        numbers[7] = 1;
        numbers[8] = 0;
        numbers[9] = 1;

        // set a value for int when running test
        int numOnes = test.countOnes(numbers);

        //output answer
        System.out.println(numOnes);
    }
}
