import java.util.*;

public class LongestIncreasingSubsequence {
  public static void main(String[] args) {
    int[] arr = {5,1,4,2,3};
    int n = 5;
    // lis array stores the length of the LIS with the indexed element being the end element
    // index array stores the index of the previous element in the LIS
    // ....Here to initialize the arrays
    int[] lis = new int[n];
    int[] index = new int[n];
    for(int i = 0; i < n; i++){
      lis[i] = 1;
      index[i] = i;
    }
    // Compute lis values from bottom up
    for(int i = 0; i < n ; i++){
      for(int j = 0; j < i; j++) {
        // If find an element satisfying the following condition, update lis[i]
        if(arr[j] < arr[i] && lis[i] < lis[j] + 1) {
          lis[i] = lis[j] + 1;
          index[i] = j;
        }
      }
    }
    // Get the length of LIS
    int endIndex = 0; // index of end element of LIS
    int max = 0; // Length of LIS
    for(int i = 0; i < n; i++) {
      if(max < lis[i]){
        max = lis[i];
        endIndex = i;
      }
    }
    System.out.format("Length of LIS is: %d%n",max);
    // Print out the LIS
    System.out.printf("The LIS: ");
    int k = endIndex;
    LinkedList<Integer> list = new LinkedList<Integer>();
    for(int i = 0; i < max; i++){
      list.addFirst(arr[k]);
      k = index[k];
    }
    System.out.println(list);
  }
}
