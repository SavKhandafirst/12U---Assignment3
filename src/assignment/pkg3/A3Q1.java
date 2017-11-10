/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author khans4349
 */
public class A3Q1 {

    // swap method
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    // selection sort method
    public void proselectionSort(int[] array) {
        // keep track of which position we are sorting 
        for (int position = 0; position < array.length; position++) {

            // set least as the first number in the position
            int least = position;
            // go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                // have we found smaller?
                if (array[i] < array[position]) {
                    // change value of least so that its the lowest known value to compare with
                    least = i;

                    // if least is lower than position than swap
                    if (array[least] < array[position]) {
                        // swap numbers
                        swap(array, least, position);
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q1 test = new A3Q1();
        // making a random array of ints
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
        }
        // BEFORE
        System.out.println("BEFORE:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //SORT HERE
        test.proselectionSort(numbers);
        //AFTER
        System.out.println("AFTER:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
