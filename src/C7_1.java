/**
 * Enter the grades for students until stopped
 * 
 * @author Conner Kious
 */
import java.util.Scanner;

public class C7_1 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades;
        int children;
        int newest;
        int best = 0;

        System.out.print("Enter the amount of children: ");
        children = input.nextInt();

        System.out.print("Enter " +children+ " grades:  ");
        grades = new int[children];
        for (int counter = 0; counter < children; counter++) {
            grades[counter] = input.nextInt();
            newest = grades[counter];
            if (newest > best) {
                best = newest;
            }
            if (newest == children - 1) {
                break;
            }
        }
        for (int x = 0; x < grades.length; x++) {
            
                if (grades[x] >= best - 10) {
                    System.out.println("Student " + x + " has a score of " + grades[x] + ": A");
                } else if (grades[x] >= best - 20) {
                    System.out.println("Student " + x + " has a score of " + grades[x] + ": B");
                } else if (grades[x] >= best - 30) {
                    System.out.println("Student " + x + " has a score of " + grades[x] + ": C");
                } else if (grades[x] >= best - 40) {
                    System.out.println("Student " + x + " has a score of " + grades[x] + ": D");
                } else {
                    System.out.println("Student " + x + " has a score of " + grades[x] + ": F");

                }
            
        }
    }
}