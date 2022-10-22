import java.util.Scanner;

/**
 * @author VCCICCV
 * @Date 2022/10/17 1:34
 */
public class WorkArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("请输入10个数:");
        try {
            for (int i = 0; i < 10; i++) {
                a[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Err!");
        }
        WorkArray sw = new WorkArray();
        System.out.println("逆序输出:");
        for (int i = 0,j=9; i <= 5&j>=5; i++,j--) {
            sw.swap(a,i,j);
        }
        for (int i=0;i<10;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
