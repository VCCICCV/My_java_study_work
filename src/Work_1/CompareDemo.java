package Work_1;

import java.util.Scanner;

/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/4 21:57
 */
public class CompareDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("最大值为:"+Compare.compare(a, b));
        System.out.println("请输入三个整数:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("最大值为:"+Compare.compare(a, b, c));
    }
}
class Compare{
    public static int compare(int a, int b) {
        // a > b 时返回 a ; a < b 时 返回 b
        int max1 = (a > b)? a:b;
        return max1;
    }
    public static int compare(int a,int b,int c) {
        int temp = compare(a , b);
        int max2 = (temp > c) ? temp : c;
        // if (a > b){
        //     temp = a;
        // }else{
        //     temp = b;
        // }
        // if (temp > c){
        //     return temp;
        // }else{
        //     return c;
        // }
        return max2;
    }
}