package com.wsx.io;
import java.io.*;
public class Test01
{
    public static void main(String[] args) throws IOException {
        //文件-》 程序：
        //有一个文件：--》 创建一个file类的对象
        File f = new File("e:/Test.txt" );
        //2.利用FileReader这个流，这个“管”怼到源文件上去   ---》创建一个FileReader的流的对象
        FileReader fr = new FileReader(f);

        //3.进行操作“吸”的动作  ---》读取动作
        /*
        int n1 = fr.read();
        int n2 = fr.read();
        int n3 = fr.read();
        int n4 = fr.read();
        int n5 = fr.read();
        int n6 = fr.read();
        int n7 = fr.read();
        int n8 = fr.read();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println(n8); // -1

        如果到了文件的结尾，那么读取的内容为-1
        */
        /*方式1


        int n = fr.read();
        while(n != -1)
        {
            System.out.println(n);
            n = fr.read();
        }

         */
        //方式2
        /*int n;
        while((n = fr.read()) != -1 )
        {
            System.out.println((char)n);
        }

         */

        char[] ch = new char[5];//缓冲组
        int len = fr.read(ch);

        while(len != -1)
        {
            //System.out.println(len);
            //错误方式：
           /* for(int i = 0; i < ch.length; i++)
            {
                System.out.println(ch[i]);
            }
            //正确方法：
            for(int i = 0; i< len; i++)
            {
                System.out.println(ch[i]);
            }
            */
            //方法二 将数组转为String
            String str = new String(ch,0,len);
            System.out.print(str);
            len = fr.read(ch);


        }


        fr.close();
        //管不用了就要关闭 关闭流
        //流 数据库， 网络资源，靠jvm本身没有办法帮我们关闭，必须程序员手动关闭

    }
}
