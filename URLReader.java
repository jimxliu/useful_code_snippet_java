import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {
        // open an input stream for a specified url source
        URL oracle = new URL("http://www.uniprot.org/uniprot/B5ZC00.fasta");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        // The title of the fasta data
        String proteinInfo;
        proteinInfo = in.readLine();
        System.out.println(proteinInfo);

        // The protein sequence
        String proteinSeq = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            proteinSeq += inputLine;
        System.out.println(proteinSeq);
        in.close();
    }
}
