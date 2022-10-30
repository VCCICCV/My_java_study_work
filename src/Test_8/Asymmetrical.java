package Test_8;

import java.util.Scanner;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/30 16:15
 */
public class Asymmetrical {
    public static boolean judgePalindrome(String A){
        // 存入数组
        char[] arrayA = A.toCharArray();
        // 指向头部
        int top = 0;
        // 指向尾部
        int end = arrayA.length-1;
        if(A.equals(" ") || A.equals(null))
            // 空格或无
            return false;
        while(top < end){
            // 前后比较
            if(arrayA[top++] != arrayA[end--])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("请输入字符串：");
            String str = in.nextLine();
            System.out.println(str+"是否对称"+judgePalindrome(str));
        }
    }
}
