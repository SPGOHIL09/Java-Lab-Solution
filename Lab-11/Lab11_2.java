import java.io.*;

public class Lab11_2 {

    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File or directory not found.");
            return;
        }

        if (file.isFile()) {
            System.out.println("File Size: " + file.length());
        }else{

            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }

        }
    }
}