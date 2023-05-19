package ClassAssignment_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) {
        String path = "C:\\Users\\yding\\Desktop\\teaching\\2150\\FileSrc\\src.txt";

        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
