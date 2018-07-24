package File;

import java.io.File;
import java.util.Scanner;

public class SizeFile {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input path file: ");
        String path = scn.nextLine();
        File file = new File(path);
        System.out.println("Size of this file is: " + getSize(file));
    }

     public static long getSize(File file) throws Exception {
        File[] list = file.listFiles();
        long size = 0;
        for (File f : list) {
            if (f.isFile())  size += f.length();
            else if (f.isDirectory()) size += getSize(f);
        }
        return size;
    }
}
