/* 
public class largestelement {
public static int largestElement(int [] arr  ){
    int largestno = arr[0];
    for(int i = 0 ; i< arr.length ;i++){
        if ( arr[i] > largestno){
            largestno = arr[i];
        }
    }

    return largestno;
}

    public static void main(String[] args) {
        int [] num = {5,9,3,8,1,8,6};
        int a = largestElement(num);

        System.out.println(a);
    }
    
}*/

/*public class largestelement {
    public static int slargestElement(int [] arr  ){
        int largestno = arr[0];
        for(int i = 0 ; i< arr.length ;i++){
            if ( arr[i] > largestno){
                largestno = arr[i];
            }
        }

       int  slargestno = -1;
       for (int i = 0 ; i<arr.length ; i++){
          if (arr[i] > slargestno && arr[i] != largestno){
            slargestno = arr[i];
          }

       }
    
        return slargestno;
    }
    
        public static void main(String[] args) {
            int [] num = {5,9,3,8,1,8,6};
            int a = slargestElement(num);
    
            System.out.println(a);
        }
}    */

// more optimal solution for finding second largest element 

/**
 * largestelement
 */
/* 
public class largestelement {

    public static int slargestElement(int [] arr ){
       int  largestelement = arr[0];
       int  slargestelement = -1;

       for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > largestelement ){
                slargestelement = largestelement;
                largestelement = arr[i];
            }

            else if (arr[i] < largestelement && arr[i] > slargestelement){
                slargestelement = arr[i];
            }
       }

       return slargestelement;
    }

    public static void main(String[] args) {
        int [] num = {1,8,2,9,3,8,7,5};
        int result = slargestElement(num);
        System.out.println(result);
    }
    
}*/

// remove duplicate elements from array ;
 
package sc;

public class largestelement {

    public static int removeduplicate(int [] arr){
        int i = 0;
        for (int j = 1 ; j < arr.length ; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        int [] num = {1,1,2,2,2,3,3,4,4,4};
        int result = removeduplicate(num);
        System.out.println(result);
    }

    
}