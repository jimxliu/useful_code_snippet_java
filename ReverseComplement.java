import java.io.Console;
import java.util.Map;
import java.util.HashMap;

public class ReverseComplement {
  public static void main(String[] args) {
    Console con = System.console();
    if(con == null){
      System.out.println("No console");
      System.exit(1);
    } else {
      String str = con.readLine("Enter a sequence:");
      // String reversedStr = (new StringBuilder(str)).reverse().toString();
      // System.out.format("Reversed string:%s\n",reversedStr);
      Map<Character,Character> basePair = new HashMap<Character,Character>();
      basePair.put('A','T');
      basePair.put('T','A');
      basePair.put('C','G');
      basePair.put('G','C');

      // Reversed complementary string
      StringBuilder revCompStr = new StringBuilder();
      for(int i = str.length() - 1; i >= 0; i--) {
        // Add the complementary base of the base on the original string to the reversed compelment string
        revCompStr.append(basePair.get(str.charAt(i)));
      }
      System.out.format("Reversed complementary sequence: %s\n",revCompStr.toString());
    }
  }
}
