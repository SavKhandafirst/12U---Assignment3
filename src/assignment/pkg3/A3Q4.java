package assignment.pkg3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A3Q4 {

    public void countingSort(int[] array) {

        // create the tracker array
        int[] tracker = new int[101];

        // while for loop runs through array, the tracker will record the value of each number in original array
        for (int z = 0; z < array.length; z++) {
            tracker[array[z]]++;
        }

        // print out the awnsers in tracker array
        for (int i = 0; i < tracker.length; i++) {
            for (int p = 0; p < tracker[i]; p++) {
                System.out.println(i);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();
        // making a random array of ints
        int[] numbers = new int[100];

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
        System.out.println("AFTER:");
        test.countingSort(numbers);

    }
}
