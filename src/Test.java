import java.io.*;
import java.util.Random;

/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/14 15:39
 */
public class Test {
    public static void main(String args[]) throws IOException {
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
        // 创建文件
        FileOutputStream fos = new FileOutputStream("D:\\Exercise.dat");
        // 创建数据流对象
        DataOutputStream fw = new DataOutputStream(fos);
        // 写进去
        for (int i = 0; i < all.length; i++) {
            fw.writeInt(all[i]);
        }
        FileInputStream fis = new FileInputStream("D:\\Exercise.dat");
        DataInputStream fis2 = new DataInputStream(fis);

        //每次读4个字节，放到数组里
        byte[] bytes = new byte[4];
        int c, sum65 = 0;
        System.out.println("读取的随机数据为:");
        while ((c = fis2.read(bytes)) != -1) {
            System.out.print(" " + bytes[3]);
            // 获取数据并且计算加法
            sum65 += bytes[3];
            // 测试
            // System.out.println(Arrays.toString(bytes));
        }
        System.out.println();
        System.out.println("读取后计算的结果:"+sum65);
        //关闭
        fis2.close();
        fis.close();
        fw.close();
        fos.close();
    }
}