import java.util.Scanner;

class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size - 1];
        for (int i = 0; i < size - 1; i++) arr[i] = in .nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }
    static int missingNumberFinder(int array[], int n) {
        // write your code here
        int missingNum= Integer.MIN_VALUE;
        for ( int j =1; j < (n-1);j++ ){
            if((array[j]-1) != array[j-1]){
                missingNum=array[j]-1;
            }
        }
        if( missingNum == Integer.MIN_VALUE) missingNum=array[n-2]+1;
        return missingNum;
    }
} 