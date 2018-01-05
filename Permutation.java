import java.util.Arrays;
import java.io.Console;

/* Take an array of int numbers to calculate the total number of permutations of the array and print out all the permutations
 *
*/
public class Permutation {
  public static void main(String[] args){
    Console con = System.console();
    if(con != null){
      int n = Integer.parseInt(con.readLine("Enter a number(n<=7): "));
      if(n > 0) {
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
          arr[i] = i+1;
        }
        Permutation per = new Permutation();
        System.out.println(per.numOfPermutations(n));
        per.permutate(arr,0,n-1);
      }
    } else {
      System.out.println("No console established.");
    }
  }

  /**
     * permutation function
     * @param arr arr of numbers to calculate permutation for
     * @param l starting index
     * @param r end index
     */
  public void permutate(int[] arr, int l, int r) {
    if(l == r) {
      for(int i = 0; i < arr.length; i++){
        System.out.format("%d ",arr[i]);
      }
      System.out.println("");
    } else {
      for(int i = l; i <= r; i++) {
        swap(arr, l, i);
        permutate(arr, l+1, r);
        swap(arr, l, i);
      }
    }
  }
  /**
     * Swap numbers at position
     * @param arr an array of integers
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
  public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // @return The total number of permutations in an array of integers
  public int numOfPermutations(int n){
    if(n == 1){
      return 1;
    }
    return n * numOfPermutations(n-1);
  }
}
