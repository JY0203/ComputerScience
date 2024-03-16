import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = {22, 44, 55, 32};
        System.out.print("y array : [");

        for(int nums : y) {
            System.out.print(nums + " ");
        }

        System.out.println(" ]");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers : ");

        for (int i = 0; i < 5; ++i) {
            System.out.print("index " + i + " :");
            x[i] = scanner.nextInt();
        }
        
        System.out.print("Ur \"x\" array's numbers are : [");

        for (int i = 0; i < x.length; ++i) {
            System.out.print(x[i]);

            if (i != x.length - 1) {
                System.out.print(" ");
            }
        }
        
        System.out.print("]");

        scanner.close();
    }
}