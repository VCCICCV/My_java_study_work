package Test_8;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/30 15:25
 */
public class StringUtilTest {
    public static void main(String[] args) {
        /**
         * 方法一
         */
        // 指定字符串
        String str = "abcdefghijklmnopqrstuvwxyz";
        // 存入字符数组
        char[] charArray = str.toCharArray();
        for (int i = charArray.length-1; i >= 0; i--){
            // 倒序输出数组的元素
            System.out.print(charArray[i]);
        }
        System.out.println();
        /**
         * 方法二
         */
        // 转换为Buffer对象
        StringBuffer buff = new StringBuffer(str);
        // 重写reverse()，调用AbstractStringBuilder reverse()
        buff.reverse();
        // 转换为字符串输出
        System.out.println(buff.toString());
    }
}
