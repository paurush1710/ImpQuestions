import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        
        Scanner s = new Scanner(System.in);
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j] = s.nextInt();
                 System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i=0; i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
        
        for(int[] b : a)
        {
            System.out.println(Arrays.toString(b));
        }
        
    }
}

// ------------------------------

import java.util.Scanner;

public class RaggedArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Declare the ragged array
        int[][] ragged = new int[rows][];

        // Input the number of columns for each row and the values
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row " + i + ": ");
            int cols = scanner.nextInt();
            ragged[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                ragged[i][j] = scanner.nextInt();
            }
        }

        // Print the ragged array
        System.out.println("\nRagged Array Entered:");
        for (int i = 0; i < ragged.length; i++) {
            for (int j = 0; j < ragged[i].length; j++) {
                System.out.print(ragged[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
