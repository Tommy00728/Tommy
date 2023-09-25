package com.wsx.io;
import java.io.*;

public class Test03
{
    public static void main(String[] args) throws IOException {
        File f = new File("e://demo.txt");
        FileWriter f1 = new FileWriter(f,true);

        String str = "hello china";
        char[] chars = str.toCharArray();
        f1.write(chars);

        f1.close();





    }
}
