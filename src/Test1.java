import java.io.*;
import java.util.Scanner;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/20 12:01
 */
public class Test1 {

    public static void main(String[] args) {//注意数据的输入流与输出流在使用上应当互相配套，

        //例如：采用数据输入流（DataInputStream）读取数据输出流（DataOutputStream）存储的数据。

        try {

            //从键盘输入学生成绩并写入文档

            Scanner sc = new Scanner(System.in);

            int s;

            // FileOutputStream fout=new FileOutputStream("d:\\data.txt");//该类对象按字节往文件中写数据


            DataOutputStream dfout = new DataOutputStream(new FileOutputStream("d:\\data.txt"));

            System.out.println("请输入五个学生成绩（0-100间的整数）");

                for (int i = 0; i < 5; i++) {
                    s = sc.nextInt();
                    if (s>=0&s<=100){
                        dfout.writeInt(s);
                    }else {
                        break;
                    }
                }

            dfout.close();

//从文件中读取学生成绩，并统计

            int score[] = new int[5];


            DataInputStream din = new DataInputStream(new FileInputStream("d:\\data.txt"));

            //选取与输出流配对的输入流
           int sum = 0;
            for (int i = 0; i < 5; i++) {
                score[i] = din.readInt();
                System.out.println(score[i]);
                sum += score[i];
            }

            System.out.println();

            System.out.println("平均值为：" + sum / 5);

            din.close();//关闭输入流

        } catch (IOException e) {

            System.out.println("异常发生：" + e);

        }

    }

}