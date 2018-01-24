import java.util.Scanner;

/**
 * program creates an array
 *
 * @author Lindsay Edgeman
 */
public class P7 {

    /**
     * Main method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of numbers in the array: ");
        int leng = input.nextInt();
        int[] array = new int[leng];
        array = getValues(array, input);
        System.out.println("Average: " + getAvg(array));
        printArray(array);
    }

    /**
     * getValues method
     *
     * @param array the array of values
     * @param input input from the user
     * @return the array
     */
    public static int[] getValues(int[] array, Scanner input) {
        System.out.println("Enter the " + array.length + " elements: ");
        for (int x = 0; x < array.length; ++x) {

            array[x] = input.nextInt();

        }
        return array;
    }

    /**
     * getAvg method
     *
     * @param array array from given values
     * @return the average
     */
    public static double getAvg(int[] array) {
        double avg = 0;

        for (int x = 0; x < array.length; ++x) {
            avg += array[x];

        }
        avg = avg / array.length;
        return avg;
    }

    /**
     * printArray method
     *
     * @param array continued array with inputed values
     */
    public static void printArray(int[] array) {
        System.out.print("Array: " + java.util.Arrays.toString(array));

    }
}
