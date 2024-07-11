// bruteforce approach.
// T.C = O(n1logn + n2logn) + O(n1+n2)
// S.C = O(n1+n2)+ O(n1+n2)

/*package sc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class unionoftwosortedarrays {

    public static int [] unionofarrays(int [] arr1 , int [] arr2){
        Set<Integer> set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        for(int i = 0 ; i < n1 ;i++ ){
            set.add(arr1[i]);
        }

        for(int i = 0 ; i < n2 ; i++){
            set.add(arr2[i]);
        }

        int [] unionarray = new int[set.size()];
        int index = 0;
        for(int num : set){
            unionarray[index++ ] = num;
        }

        return unionarray;
    }

    public static void main(String[] args) {
         int [] arr1 = { 1,2,3,4,5,6,7};
         int [] arr2 = {2,3,5,6,8,9};

         int [] result = unionofarrays(arr1, arr2);

         System.out.println("Union of two sorted arrays : " + Arrays.toString(result));
    }
    
}*/

// optimal approach using two pointers method .

package sc;

import java.util.ArrayList;
import java.util.List;

public class unionoftwosortedarrays {

    public static List<Integer> sortingarray(int [] a1 , int [] a2){
        int n1 = a1.length;
        int n2 = a2.length;

        List<Integer> unionarray = new ArrayList<>();
        
        int i = 0 ;
        int j = 0 ;

        while(i < n1 && j < n2){
            if(a1[i] <= a2[j]){
                if(unionarray.size() == 0 || unionarray.contains(a1[i]) == false ){
                    unionarray.add(a1[i]);
                }
                i++;
            }

            else{
                if(unionarray.size() == 0 || unionarray.contains(a2[j]) == false ){
                    unionarray.add(a2[j]);
                }
                j++;
            }
        }

        while(j < n2){
             if(unionarray.size() == 0 || unionarray.contains(a2[j]) == false ){
                    unionarray.add(a2[j]);
                }
                j++;
        }

        while(i < n1){
                if(unionarray.size() == 0 || unionarray.contains(a1[i]) == false ){
                    unionarray.add(a1[i]);
                }
                i++;
        }

        return unionarray;
    }



public static void main(String[] args) {
    int [] a1 = {1,2,4,5,6,9,6};
    int [] a2 = {2,3,5,6,7,8};

    List<Integer> result = sortingarray(a1, a2);
    System.out.println(result);
}
}