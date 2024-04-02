import java.io.*;

public class Lab10_2 {

    public static void main(String[] args) {

        String word1 = "Ronak";
        String word2 = "R";

        try {
            File f1 = new File("abc.txt");
            File f2 = new File("xyz.txt");

            BufferedReader r1 = new BufferedReader(new FileReader(f1));
            BufferedWriter w2 = new BufferedWriter(new FileWriter(f2));

            String line = r1.readLine();
            int c = 0;

            while (line != null) {
                String changedLine = "";

                String a[]=line.split(" ");
                
                for(int i=0;i<a.length;i++){
                    if(a[i].equals(word1)){
                        c++;
                        changedLine+=word2+" ";
                    }else{
                        changedLine+=a[i]+" ";
                    }
                }
                
                w2.write(changedLine);
                w2.newLine();
                line = r1.readLine();
            }

            r1.close();
            w2.close();

            System.out.println("Replacements Counts: " + c);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}