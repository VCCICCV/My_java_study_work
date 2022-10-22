package Work8;

import java.io.*;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/22 22:47
 */
public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader = null;
        int value = 0;
        BufferedReader br = null;
        String line = null;
        try {
            reader = new FileReader(InputStreamDemo.CHINESE_FILE);
            // 装饰模式
            br = new BufferedReader(reader);
            // while ((value = reader.read()) != -1) {
            //     System.out.print((char)value);
            // }
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
