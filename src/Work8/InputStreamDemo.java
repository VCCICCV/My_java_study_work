package Work8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/22 22:24
 */
public class InputStreamDemo {
    public static final String ENGLISH_FILE ="D:\\Test.txt";
    public static final String CHINESE_FILE ="D:\\books.xml";

    public static void main(String[] args) {
        InputStream fis = null;
        int value;
        try {
            fis = new FileInputStream(ENGLISH_FILE);
            while ((value = fis.read()) != -1) {
                // if (value != -1) {
                    System.out.print((char)value);
                // }
                // else break;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
