import java.util.*;

// Use dynamic programming
public class Combinations {
  static int[][] ncr = new int[44][44]; // Initialize the dynamic 44x44 array
  // Size can be changed
  public static int comb(int n, int r){
    if(ncr[n][r] != 0){ // If nCr is already calculated
      return ncr[n][r];
    }
    if(r == 0 || n == r) { // Basic case
      return 1;
    }
    int ans = comb(n-1,r) + comb(n-1,r-1); // Recursive computing
    return ncr[n][r] = ans;
  }

  public static void main(String[] args){
    System.out.println("32C16: "+comb(32,16));
  }
}
