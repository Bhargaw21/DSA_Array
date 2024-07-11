// brute force approach 

/*package sc;

public class NumberAppearOnce {
    public static int findnumberappearonce(int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int num = arr[i];
            int cnt = 0;
            for(int j = 0 ; j < n ; j++){
                if(num == arr[j]){
                    cnt++;
                }
            }

            if ( cnt == 1){
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = { 1,1,2,2,3,4,4};
        int result  = findnumberappearonce(arr);
        System.out.println(result);
    }
}
*/

// better apprpoach 

/*package sc;

public class NumberAppearOnce {

    public static int findnumberappearonce(int [] arr){
        int maxi = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            maxi = Math.max(maxi,arr[i]);
        }

        int [] hash = new int[maxi];
        
        for (int i = 0 ; i < arr.length ; i++){
            hash[i]++;
        }

        for ( int i = 0 ; i < arr.length ; i++){
            if(hash[i] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = { 1,1,2,2,3,4,4};
        int result  = findnumberappearonce(arr);
        System.out.println(result);
    }

}*/

// another better approach 

/*package sc;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearOnce {

    public static int findNumberAppearOnce(int[] arr) {
        // Using a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Counting the occurrences of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Finding the number that appears exactly once
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }

        // If no such number is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int result = findNumberAppearOnce(arr);
        System.out.println(result);  // Output should be 3
    }
}*/


// optimal approach 

package sc;

public class NumberAppearOnce {
        public static int findNumberAppearOnce(int [] arr ){
            int xor = 0;
            for (int i = 0 ; i < arr.length ; i++){
                xor = xor^arr[i];
            }

            return xor;
        }
        
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 3, 4, 4};
            int result = findNumberAppearOnce(arr);
            System.out.println(result);  
        }
}