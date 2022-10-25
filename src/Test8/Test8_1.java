package Test8;


/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 10:07
 */
import java.util.Scanner;
public class Test8_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入整数个数：");
        int n = scanner.nextInt();
        int array[]=new int[n];
        System.out.print("请输入要排序的数：");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int count = array.length;
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("升序结果：");
        for (int element : array) {
            System.out.print(element+" ");
        }
    }
}
