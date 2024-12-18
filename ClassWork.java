package Day_06;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
//		1. Write a program for addition of single array elements.
		System.out.print("Enter the number of elements in the arrays: ");
		int size = scnr.nextInt();
			
	    int[] array1 = new int[size];
	    int[] array2 = new int[size];
	    int[] sumArray = new int[size];
		        
	    System.out.println("Enter the elements of the first array:");
	    for (int i = 0; i < size; i++) {
	    	array1[i] = scnr.nextInt();
	    }
	    System.out.println("Enter the elements of the second array:");
	    for (int i = 0; i < size; i++) {
	    	array2[i] = scnr.nextInt();
	    }
	    for (int i = 0; i < size; i++) {
	    	sumArray[i] = array1[i] + array2[i];
	    }
	    System.out.println("The resulting array after addition is:");
	    for (int value : sumArray) {
	    	System.out.print(value + " ");
	    }
	    System.out.println();
	    
//	    2. Write a program for addition of two arrays stored in third array
	    System.out.println("Enter the number of elements in the arrays:");
		int size2 = scnr.nextInt();
		
		int[] arry1 = new int[size2];
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size2; i++) {
            arry1[i] = scnr.nextInt(); 
        }
        int sum = 0;
        for (int num : arry1) {
            sum += num;
        }
        System.out.println("The sum of the array elements is: " + sum);
        
//     	3. Write a program to search a particular element in array and display its position.
        System.out.print("Enter the number of elements in the array: ");
        int size3 = scnr.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scnr.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchElement = scnr.nextInt();

        int position = -1; 
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                position = i; 
                break;       
            }
        }

        if (position != -1) {
            System.out.println("Element " + searchElement + " is found at position " + (position + 1)); 
        } else {
            System.out.println("Element " + searchElement + " is not found in the array.");
        }
        
//      4. Write a program to store squares and cubes of the elements in another arrays and Display all the three arrays.
        System.out.print("Enter the number of elements in the array: ");
        int size4 = scnr.nextInt();

        int[] array4 = new int[size4];
        int[] squares = new int[size4];
        int[] cubes = new int[size4];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size4; i++) {
            array4[i] = scnr.nextInt();
        }
        
        for (int i = 0; i < size4; i++) {
            squares[i] = array4[i] * array4[i];
            cubes[i] = array4[i] * array4[i] * array4[i];
        }
        
        System.out.println("Original Array: ");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Squares Array: ");
        for (int value : squares) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Cubes Array: ");
        for (int value : cubes) {
            System.out.print(value + " ");
        }
        System.out.println();
        
//      5. Write a program to store the addition of two arrays into third array and print third array.
        System.out.print("Enter the number of elements in the arrays: ");
        int size5 = scnr.nextInt();

        int[] array5 = new int[size5];
        int[] array3 = new int[size5];
        int[] resultArray = new int[size5];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size5; i++) {
            array5[i] = scnr.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size5; i++) {
            array3[i] = scnr.nextInt();
        }

        for (int i = 0; i < size5; i++) {
            resultArray[i] = array5[i] + array3[i];
        }

        System.out.println("The resultant array after addition is:");
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
	}
}
