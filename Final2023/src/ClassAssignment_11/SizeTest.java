package ClassAssignment_11;

import java.io.File;

public class SizeTest {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\yding\\Desktop\\teaching\\2150\\Trees.pptx";
        File file = new File(filePath);
        System.out.println(Recursion.size(file));
        System.out.println();

        String dirPath = "C:\\Users\\yding\\Desktop\\teaching\\2150";
        File dir = new File(dirPath);
        System.out.println(Recursion.size(dir));
        System.out.println();
    }

}
