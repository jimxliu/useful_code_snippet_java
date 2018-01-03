import java.util.*;

public class AminoFrequencyTable { // Frequency of a type of amino acid represented in the codon table
  private static final Map<String,Integer> table;
  static {
    Map<String,Integer> tempMap = new HashMap<String,Integer>();
    tempMap.put("A",4);
    tempMap.put("C",2);
    tempMap.put("D",2);
    tempMap.put("E",2);
    tempMap.put("F",2);
    tempMap.put("G",4);
    tempMap.put("H",2);
    tempMap.put("I",3);
    tempMap.put("K",2);
    tempMap.put("L",6);
    tempMap.put("M",1);
    tempMap.put("N",2);
    tempMap.put("P",4);
    tempMap.put("Q",2);
    tempMap.put("R",6);
    tempMap.put("S",6);
    tempMap.put("T",4);
    tempMap.put("V",4);
    tempMap.put("W",1);
    tempMap.put("Y",2);
    tempMap.put("Stop",3);
    table = Collections.unmodifiableMap(tempMap);
  }
  public static void main(String[] args) {
    // System.out.println(table);
    
  }
}
