package sc;

public class MaxConsecutiveOnes {

    public static  int findmaxconsecutiveOnes(int [] arr){
        int maxi = 0;
        int counter = 0;

        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                counter++;
                maxi =  Math.max(maxi , counter);
            }

            else{
                counter = 0;
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,1,0,1,1,1,1,1,1};
        int result = findmaxconsecutiveOnes(arr);
        System.out.println("Max consecutive ones are : " + result);
        
    }
}
