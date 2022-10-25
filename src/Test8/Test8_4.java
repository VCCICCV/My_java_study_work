package Test8;



/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/26 0:40
 */
import java.util.Scanner;
public class Test8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数：");
        int m = sc.nextInt();
        System.out.print("请输入列数：");
        int n = sc.nextInt();
        double[][] a = new double[m][n];
        double[] row = new double[m*n];
        System.out.println("请输入"+m+"行"+n+"列数组：");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < m; i++) {
            sum = 0;// 置零
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];;
            }
            row[i] = sum;
        }
        for (int i = 0; i < m; i++) {
            System.out.println("sum of "+i+"is "+row[i]);
        }
    }
}
