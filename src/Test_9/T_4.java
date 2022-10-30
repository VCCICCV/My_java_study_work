package Test_9;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/30 16:35
 */
public class T_4 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("abcd");
        System.out.println("大小"+buffer.length());
        System.out.println("容量"+buffer.capacity());
        buffer.append("efgh");
        System.out.println("大小"+buffer.length());
        System.out.println("容量"+buffer.capacity());
        buffer.append("adef");
        System.out.println("大小"+buffer.length());
        System.out.println("容量"+buffer.capacity());
        buffer.append("1234");
        System.out.println("大小"+buffer.length());
        System.out.println("容量"+buffer.capacity());
        // 删除指定第五个位置的字符
        System.out.println("原字符串对象："+buffer);
        buffer.deleteCharAt(5);
        System.out.println("删除第五个位置的字符后："+buffer);
        // 插入一个字符‘a’到第三个位置
        buffer.insert(3,'a');
        System.out.println("插入一个字符‘a’到第三个位置:"+buffer);
        // 对串进行反转操作
        System.out.println("对串进行反转："+buffer.reverse());
    }
}
