package ClassAssignment_9;

import java.io.*;
import java.util.Arrays;

public class MyFileIO {

    public static int countWords(String path) {
        int count = 0;

        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if (!line.matches("\\s*")) {
                    String[] words = line.split("\\s+");
                    System.out.println(Arrays.toString(words));
                    System.out.println(words.length);
                    count += words.length;
                }
            }

            br.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        return count;
    }


    public static void copyFile(String src, String dest) {
        try {
            FileReader fr = new FileReader(src);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(dest);
            BufferedWriter bw = new BufferedWriter(fw);
            int result = 0;

            while ((result = br.read()) != -1) {
                bw.write(result);
            }

            br.close();
            bw.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public static void binaryFileCopy(String src, String dest) {
        try {
            FileInputStream fi = new FileInputStream(src);
            BufferedInputStream bi = new BufferedInputStream(fi);
            FileOutputStream fo = new FileOutputStream(dest);
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            int result = 0;

            while ((result = bi.read()) != -1) {
                bo.write(result);
            }

            bi.close();
            bo.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // String path = "C:\\Users\\yding\\Desktop\\teaching\\2150\\FileSrc\\src.txt";
        // System.out.println(countWords(path));

//        String src = "C:\\Users\\yding\\Desktop\\teaching\\2150\\FileSrc\\src.txt";
//        String dest = "C:\\Users\\yding\\Desktop\\teaching\\2150\\FileDest\\dest.txt";
        String src = "C:\\Users\\yding\\Desktop\\teaching\\2150\\FileSrc\\2150syllabus.docx";
        String dest = "C:\\Users\\yding\\Desktop\\teaching\\2150\\FileDest\\syllabus_copy.docx";
        binaryFileCopy(src, dest);

    }
}
