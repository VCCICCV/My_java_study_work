package ALotOfQuestions;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/14 14:26
 */

public class Work {
    /**
     * 1.编写程序显示 100 到 1000 之间能被 5 和 6 整除的数。
     *
     * @return
     */
    public static void CanBeDividedExactlyBy5And6() {
        System.out.println("100 到 1000 之间能被 5 和 6 整除的数:");
        for (int i1 = 100; i1 < 1000; i1++) {
            if (i1 % 5 == 0 & i1 % 6 == 0) {
                System.out.print(" " + i1);
            }
        }
    }

    /**
     * 4.通过键盘输入一个数控制输出星的行数，例如输入4则打印以下图形
     */
    public static void stars() {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入星星行数：");
        int n4 = scan.nextInt();
        // 控制行
        for (int i4 = 0; i4 < n4; i4++) {
            // 输出空格
            for (int j4 = 0; j4 < n4 - i4 - 1; j4++) {
                System.out.print(" ");
            }
            // 输出*
            for (int k4 = 0; k4 <= i4 * 2; k4++) {
                System.out.print("*");
            }
            // 输出换行
            System.out.println();
        }
    }

    /**
     * 10.给定一个正整数 n (n<50)， 求斐波那契数列中的第 n 个数的值。
     * （注：求斐波那契数列为 0、1、1、2、3、5、8、13、21、34、……）
     */
    public static int fibo(int n10) {
        if (n10 <= 2) {
            return n10 - 1;
        } else {
            return fibo(n10 - 1) + fibo(n10 - 2);
        }
    }
    public static void FibonacciSequence() {
        Scanner sc10 = new Scanner(System.in);
        System.out.print("请给定一个正整数 n (n<50):");
        int n10 = 0;
        try {
            n10 = sc10.nextInt();
        } catch (Exception e) {
            System.out.println("请输入数字!");
        }
        if (n10 < 50 & n10 >= 1) {
            int number = fibo(n10);
            System.out.println("第" + n10 + "个数为" + number);
        }else{
            System.out.println("给定一个正整数 n (n<50)!");
            FibonacciSequence();
        }
    }
    /**
     * 51.创建一个 stringbuffer 对象，添加字符串"abcd","efgh","adef","1234"到对象中，测试对象大小和容量的变化及元素的遍历，删除指定第 5 个位置的字符，插入一个字符'a'到第 3 个位置，对串进行反转操作。
     * */
    public static void TestStringBuffer(){
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("abcd");
        stringbuffer.append("efgh");
        stringbuffer.append("adef");
        stringbuffer.append("1234");
        //
        System.out.println("StringBuffer大小:"+stringbuffer.length());
        System.out.println("StringBuffer容量:"+stringbuffer.capacity());
        // 元素的遍历
        System.out.println("遍历元素:"+stringbuffer);
        // 删除指定第 5 个位置的字符
        stringbuffer.deleteCharAt(5);
        System.out.println("删除指定第 5 个位置的字符:\t"+stringbuffer);
        // 插入一个字符'a'到第 3 个位置
        stringbuffer.insert(3,'a');
        System.out.println("插入一个字符'a'到第 3 个位置:\t"+stringbuffer);
        // 对串进行反转操作
        System.out.println("对串进行反转操作:\t"+stringbuffer.reverse());

    }
    /**
     * 65.使用 DataOutputStream 中的 writeInt(int)方法创建一个名为 Exercise.dat 的二进制数据文件，将 100 个随机生成的整数写入这个文件，然后再从文件中读取这些整数，并计算它们的总和。要求：加入相应的异常处理。
     *
     */
    public static void TestDataOutputStream() throws IOException {
        int[] all = new int[100];//保存100个数据
        Random random = new Random();
        System.out.print("原数据:\n");
        int sum1=0;
        for (int i65 = 0; i65 < 100; i65++) {
            int x65 = random.nextInt(101);//0~100范围内的随机数
            System.out.print(" "+x65);
            all[i65] = x65;//存入数组
            sum1 += x65;
        }
        System.out.println();
        System.out.println("最初结果:"+sum1);
        FileOutputStream fos = null;
        DataOutputStream fw = null;
        FileInputStream fis = null;
        DataInputStream fis2 = null;
        int c, sum65 = 0;
        // 可能读溢出
        try {
            // 创建文件
            fos = new FileOutputStream("D:\\IDEA02\\Work_2\\src\\ALotOfQuestions\\Exercise.dat");
            // 创建数据流对象
            fw = new DataOutputStream(fos);
            // 写进去
            for (int i = 0; i < all.length; i++) {
                fw.writeInt(all[i]);
            }
            fis = new FileInputStream("D:\\IDEA02\\Work_2\\src\\ALotOfQuestions\\Exercise.dat");
            fis2 = new DataInputStream(fis);

            //每次读4个字节，放到数组里
            byte[] bytes = new byte[4];
            sum65 = 0;
            System.out.println("读取的随机数据为:");
            while ((c = fis2.read(bytes)) != -1) {
                System.out.print(" " + bytes[3]);
                // 获取数据并且计算加法
                sum65 += bytes[3];
                // 测试
                // System.out.println(Arrays.toString(bytes));
            }
        } catch (IOException e) {
            System.out.println("出错啦！");
        }
        System.out.println();
        System.out.println("读取后计算的结果:"+sum65);
        //关闭
        fis2.close();
        fis.close();
        fw.close();
        fos.close();
    }
    public static void main(String[] args) {
        /**1.编写程序显示 100 到 1000 之间能被 5 和 6 整除的数。*/
        // CanBeDividedExactlyBy5And6();

        /**4.通过键盘输入一个数控制输出星的行数，例如输入4则打印以下图形*/
        // stars();

        /**10.给定一个正整数 n (n<50)， 求斐波那契数列中的第 n 个数的值。*/
        // （注：求斐波那契数列为 0、1、1、2、3、5、8、13、21、34、……）
        // FibonacciSequence();

        /***/
        TestStringBuffer();
        /**65.使用 DataOutputStream 中的 writeInt(int)方法创建一个名为 Exercise.dat 的二进制数据文件，将 100 个随机生成的整数写入这个文件，然后再从文件中读取这些整数，并计算它们的总和。要求：加入相应的异常处理。*/
        // try {
        //     TestDataOutputStream();
        // } catch (IOException e) {
        //     System.out.println("调用地报错！ ");
        // }
    }
}
