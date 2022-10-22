package Work8;

import java.io.*;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/22 23:40
 */
public class Test88 {
        public static void main(String[] args) throws IOException {
            //输出流所关联的文件，如果不存在，会自动创建
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("b.txt"));
            outputStreamWriter.write("我爱学Java");
            outputStreamWriter.flush();//字符流，写入数据后，需要刷新
            outputStreamWriter.close();//刷新并关闭

            FileReader fr = new FileReader("D:\\IDEA02\\Work_2\\b.txt"); // 创建 FileReader 对象
            BufferedReader reader = new BufferedReader(fr); // 创建 BufferedReader 对象
            String strLine = null;
            while ((strLine = reader.readLine()) != null) { // 循环读取每行数据
                System.out.println(strLine);
            }
            reader.close();
        }
}
