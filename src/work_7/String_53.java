package work_7;

import java.util.Scanner;

/**
 * 53.编写一个程序，判断一个字符串是否是回文串（palindrome），如果一个字符串从前往后，以及从后往前是一个样的，那么它就是一个回文。例如，level, noon，dad。
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/18 1:01
 */
public class String_53 {
    public static boolean JudgePalindrome(String A){
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
            System.out.println(str+"是否为回文串"+JudgePalindrome(str));
        }

    }

}
