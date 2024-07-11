/*package sc;

import java.util.Arrays;

public class moveallzero {

    public static int[] moveZero(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; // Initialize the temp array with the same length as arr
        int index = 0;

        // First pass: add all non-zero elements to the temp array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy the non-zero elements from temp back to arr
        for (int i = 0; i < index; i++) {
            arr[i] = temp[i];
        }

        // Fill the rest of the arr with zeros
        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4, 0, 9, 0, 7, 0, 5};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
*/

// optimal approach 
package sc;

import java.util.Arrays;

public class moveallzero {
    public static int[] moveZero(int[] arr) {
        int j = -1;
        int n = arr.length;
        
        // Find the first zero in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        
        // If there are no zeros, return the array as it is
        if (j == -1) return arr;
        
        // Traverse the array starting from the element after the first zero
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // Swap the current element with the zero found at index j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 5, 0, 6, 0, 9};
        moveZero(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}
