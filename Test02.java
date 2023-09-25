package com.wsx.io;
import java.io.*;
public class Test02
{
    public static void main(String[] args) throws IOException {
       File f = new File("e:/Test.text");

        FileWriter fw = new FileWriter(f,true);

        String str = "Hello 你好";

        for(int i = 0; i<str.length(); i++)
        {
            fw.write(str.charAt(i));
        }

        fw.close();



    }
}
