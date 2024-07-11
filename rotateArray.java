package sc;

/*import java.util.Arrays;

public class rotateArray {


    public static int[] arrayRotation(int [] arr){
        int temp = arr[0];
        int n = arr.length;

        for (int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp ;
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7};
        int[] result = arrayRotation(arr);
        System.out.println(Arrays.toString(result));
    }
    
}*/

// left rotate array by 3 places using brute force approach 

/*import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
       public static int [] leftarrayrotation(int [] arr , int d){
        int [] temp = new int[d];
        for (int i=0;i<d;i++ ){
            temp[i] = arr[i];
        }

        for (int i = d ; i<arr.length;i++){
            arr[i-d] = arr[i];
        }

        int j = 0;
        for (int i = arr.length - d ; i < arr.length ; i++){
            arr[i] = temp[j];
            j++;
        }

        return arr;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d =  sc.nextInt();
        int []arr = {1,2,3,4,5,6,7};
        int[] result = leftarrayrotation(arr, d);
        System.out.println(Arrays.toString(result));
     }
}*/

// more optimal approach for solving above question 

package sc ;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {

    public static void reverse(int [] arr , int start , int end ){
        while ( start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++ ;
            end--;
        }
    }

    public static void rotatelefttoright(int [] arr , int d){
        int n = arr.length;
        reverse(arr, 0 , n-d-1);
        reverse(arr , n-d , n-1);
        reverse(arr, 0 , n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int [] arr = {1,2,3,4,5,6,7,8,9};
         rotatelefttoright(arr, d);
        System.out.println(Arrays.toString(arr));
    }
}