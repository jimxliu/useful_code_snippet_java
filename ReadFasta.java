import java.io.*;

public class ReadFasta {
  public static void main(String[] args) {
    if(args.length < 1){ // Must run the program with the input file
      System.err.println("No file input");
      System.exit(1);
    }
    BufferedReader br = null;
    try {
      // Read the fasta file using bufferedreader
      File file = new File(args[0]);
      br = new BufferedReader(new FileReader(file));
      String fastaID;
      fastaID = br.readLine();
      System.out.println(fastaID);

      String sequence = "";
      String currentLine = "";
      while((currentLine = br.readLine()) != null) {
        sequence += currentLine;
      }
      System.out.println(sequence);
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      try {
        if(br != null) {
          br.close();
        }
        System.out.println("Read the fasta successfully!");
      } catch(Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}
