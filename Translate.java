import java.util.*;
import java.io.*;

public class Translate {
  public static final Map<String,String> table;
  static {
    Map<String,String> tempMap = new HashMap<String,String>();
    tempMap.put("TTT","F");tempMap.put("CTT","L");tempMap.put("ATT","I");tempMap.put("GTT","V");
    tempMap.put("TTC","F");tempMap.put("CTC","L");tempMap.put("ATC","I");tempMap.put("GTC","V");
    tempMap.put("TTA","L");tempMap.put("CTA","L");tempMap.put("ATA","I");tempMap.put("GTA","V");
    tempMap.put("TTG","L");tempMap.put("CTG","L");tempMap.put("ATG","M");tempMap.put("GTG","V");
    tempMap.put("TCT","S");tempMap.put("CCT","P");tempMap.put("ACT","T");tempMap.put("GCT","A");
    tempMap.put("TCC","S");tempMap.put("CCC","P");tempMap.put("ACC","T");tempMap.put("GCC","A");
    tempMap.put("TCA","S");tempMap.put("CCA","P");tempMap.put("ACA","T");tempMap.put("GCA","A");
    tempMap.put("TCG","S");tempMap.put("CCG","P");tempMap.put("ACG","T");tempMap.put("GCG","A");
    tempMap.put("TAT","Y");tempMap.put("CAT","H");tempMap.put("AAT","N");tempMap.put("GAT","D");
    tempMap.put("TAC","Y");tempMap.put("CAC","H");tempMap.put("AAC","N");tempMap.put("GAC","D");
    tempMap.put("TAA","Stop");tempMap.put("CAA","Q");tempMap.put("AAA","K");tempMap.put("GAA","E");
    tempMap.put("TAG","Stop");tempMap.put("CAG","Q");tempMap.put("AAG","K");tempMap.put("GAG","E");
    tempMap.put("TGT","C");tempMap.put("CGT","R");tempMap.put("AGT","S");tempMap.put("GGT","G");
    tempMap.put("TGC","C");tempMap.put("CGC","R");tempMap.put("AGC","S");tempMap.put("GGC","G");
    tempMap.put("TGA","Stop");tempMap.put("CGA","R");tempMap.put("AGA","R");tempMap.put("GGA","G");
    tempMap.put("TGG","W");tempMap.put("CGG","R");tempMap.put("AGG","R");tempMap.put("GGG","G");
    table = Collections.unmodifiableMap(tempMap);
  }
  public static void main(String[] args) {
      //System.out.println(CodonTable.table);
      Console con = System.console();
      if(con == null){
        System.out.println("No console.");
        System.exit(1);
      } else {
        String dna = con.readLine("Enter the DNA sequence:");
        String protein = "";
        for(int i=0; i < dna.length() - 2; i += 3) {
          String aa = table.get(dna.substring(i,i+3));
          if(aa.equals("Stop")) { // Stop at the stop codon, or to the end
            break;
          }
          protein += aa;
        }
        System.out.format("Protein sequence: %s\n",protein);
      }
  }
}
