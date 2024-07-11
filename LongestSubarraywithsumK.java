package sc;

public class LongestSubarraywithsumK {
    public static int longestsubarraywithsumk(int [] arr , int k){
        int length = 0;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int sum = 0;

                for(int a = i ; a <= j ; a++){
                    sum += arr[a];
                }

                if(sum == k){
                    length = Math.max(length,j-i+1);
                }
            }
        }

        return length;

    }
}
