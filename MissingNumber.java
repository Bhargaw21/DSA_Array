// optimal approach 1
// T.C = O(n) and S.C = O(1)

/*package sc;

public class MissingNumber {

    public static int missingno(int []arr , int n){
        int totalsum = (n*(n+1))/2;

        int arraysum = 0;

        for (int i = 0 ; i < n-1 ; i++){
            arraysum += arr[i];
        }

        int result = totalsum - arraysum;

        return result ;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7,8};
        int n = arr.length + 1;

        int number = missingno(arr, n);
        System.out.println(number);
    }
    
}*/

// optimal approach 2 using XOR Method
// out of these two xor method is the best method of all 

/*package sc;


public class MissingNumber {

    public static int missingno(int [] arr , int n){
        int xor1 =0;
        int xor2 = 0;

        for (int i = 0 ; i < n-1 ; i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }

        xor1 =  xor1^n;
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7};
        int n = arr.length;

        int result = missingno(arr, n);
        System.out.println("missing no is : " + result);
    }

}*/

// Brute force approach 

package sc;


public class MissingNumber {
    public static int missingno(int [] arr , int n){
        for(int i = 1 ; i < n ; i++){
            int flag = 0;

            for (int j = 0 ; j < n-1 ; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }

            if (flag == 0){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length + 1;

        int result = missingno(arr, n);
        System.out.println("missing no is : " + result);
    }

    
}