// brute force approach

/*package sc;

import java.util.ArrayList;
import java.util.List;

public class intersectionoftwosortedarrays {
    private static List<Integer> intersection(int [] a , int [] b){
        int n1 = a.length;
        int n2 = b.length;
        List<Integer> intersection_array = new ArrayList<>();
        int [] visisted_array = new int[n2];

        for(int i = 0 ; i< n1 ; i++){
            for(int j = 0 ; j< n2 ; j++){
                if(a[i] == b[j] && visisted_array[j] == 0){
                    intersection_array.add(a[i]);
                    visisted_array[j] = 1;
                }

                if (a[i] < b[j]){
                    break;
                }
            }
        }

        return intersection_array;
    }

    public static void main(String[] args) {
        int [] a = { 1,3,4,6,6,8,9};
        int [] b = {2,3,5,6,7,9};
        List<Integer> result = intersection(a, b);

        System.out.println(result);
    }
}*/


// optimal approach using two pointers method
package sc;

import java.util.ArrayList;
import java.util.List;

public class intersectionoftwosortedarrays {

    public static List<Integer> intersection(int [] a , int [] b){
        int n1 = a.length;
        int n2 = b.length;

        int i = 0;
        int j = 0;
        List<Integer> intersection_array = new ArrayList<>();

        while(i < n1 && j < n2){
            if(a[i] < b[j]){
                i++;
            }

            if(a[i]> b[j]){
                j++;
            }

            else{
                intersection_array.add(a[i]);
                i++;
                j++;
            }
        }

        return intersection_array;
    }

    
    public static void main(String[] args) {
        int [] a = { 1,3,4,6,6,8,9};
        int [] b = {2,3,5,6,7,9};
        List<Integer> result = intersection(a, b);

        System.out.println(result);
    }
}
