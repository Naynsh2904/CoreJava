package Day_06;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // 1. Insert array elements and search for a particular element.
        System.out.println("Enter the size of the array:");
        int size1 = scnr.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter " + size1 + " array elements:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scnr.nextInt();
        }

        System.out.println("Enter the element to search:");
        int element = scnr.nextInt();
        boolean found = false;

        for (int i = 0; i < size1; i++) {
            if (array1[i] == element) {
                System.out.println("Element " + element + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + element + " not found.");
        }

        // 2. Enter 5 array elements and sort them in ascending order.
        int[] array2 = new int[5];
        System.out.println("\nEnter 5 array elements:");
        for (int i = 0; i < 5; i++) {
            array2[i] = scnr.nextInt();
        }

        // Simple bubble sort for sorting the array
        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 0; j < array2.length - i - 1; j++) {
                if (array2[j] > array2[j + 1]) {
                    int temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. Enter 10 array elements and find the minimum and maximum number.
        int[] array3 = new int[10];
        System.out.println("\nEnter 10 array elements:");
        for (int i = 0; i < 10; i++) {
            array3[i] = scnr.nextInt();
        }

        int min = array3[0];
        int max = array3[0];

        for (int i = 1; i < 10; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
            if (array3[i] > max) {
                max = array3[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        // 4. Enter 10 array elements and store even and odd numbers in separate arrays.
        int[] array4 = new int[10];
        System.out.println("\nEnter 10 array elements:");
        for (int i = 0; i < 10; i++) {
            array4[i] = scnr.nextInt();
        }

        System.out.print("Even numbers: ");
        for (int num : array4) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : array4) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // 5. Merge two arrays into a single array and print the result.
        int[] array51 = {1, 2, 3, 4, 5};
        int[] array52 = {6, 7, 8, 9, 10};
        int[] mergedArray = new int[array51.length + array52.length];

        for (int i = 0; i < array51.length; i++) {
            mergedArray[i] = array51[i];
        }

        for (int i = 0; i < array52.length; i++) {
            mergedArray[array51.length + i] = array52[i];
        }

        System.out.println("\nMerged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scnr.close();
    }
}
