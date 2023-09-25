package com.wsx.io;
import java.io.*;
public class Test04
{
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:/Test.txt");
        File f2 = new File("E:/demo.txt");

        FileReader fr = new FileReader(f1);

        FileWriter fw = new FileWriter(f2);

        /*int n = fr.read();
        while (n != -1)
        {
            fw.write(n);
            n = fr.read();
        }


        char[] ch = new char[5];
        int len = fr.read(ch);
        while(len != -1)
        {
            fw.write(ch,0,len);
            len = fr.read(ch);
        }

         */
        char[] ch = new char[5];
        int len = fr.read(ch);
        while(len != -1)
        {
            String s = new String(ch, 0, len);
            fw.write(s);
            len = fr.read(ch);
        }

        fw.close();
        fr.close();
    }
}
