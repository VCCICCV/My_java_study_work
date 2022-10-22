package Work8;

import java.io.*;
import java.util.Scanner;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/22 23:14
 */
public class Test8 {
    public static void main(String[] args) {
        try {
            //从键盘输入学生成绩并写入文档
            Scanner sc = new Scanner(System.in);
            int s;
            BufferedWriter dfout = new BufferedWriter(new FileWriter("d:\\data.txt"));
            System.out.println("请输入五个学生成绩（0-100间的整数）");
            for (int i = 0; i < 5; i++) {
                try {
                    s = sc.nextInt();
                    if (s >= 0 & s <= 100) {
                        dfout.write(s);
                    } else {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("请输入五个0-100间的整数!");
                }
            }
            dfout.flush();
            dfout.close();
            //从文件中读取学生成绩，并统计
            int score[] = new int[5];
            BufferedReader din = new BufferedReader(new FileReader("d:\\data.txt"));
            //选取与输出流配对的输入流
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                score[i] = din.read();

                System.out.print(score[i] + ",");
                sum = sum + score[i];
            }
            System.out.println();
            System.out.println("平均值为：" + sum / 5);
            din.close();//关闭输入流
            // System.out.println(score[3]);

        } catch (IOException e) {
            System.out.println("异常发生：" + e);
        }
    }
}
