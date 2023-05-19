package ClassAssignment_11;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\yding\\Desktop\\teaching\\2150\\Trees.pptx";
        File file = new File(filePath);
        System.out.println("name: " + file.getName());
        System.out.println("path: " + file.getPath());
        System.out.println("is directory: " + file.isDirectory());
        System.out.println("size: " + file.length());
        System.out.println();

        String dirPath = "C:\\Users\\yding\\Desktop\\teaching\\2150\\src";
        File dir = new File(dirPath);
        System.out.println("name: " + dir.getName());
        System.out.println("path: " + dir.getPath());
        System.out.println("is directory: " + dir.isDirectory());
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }

    }

}
