package work_7;

/**
 * 49. 两个 3*2 矩阵求和，给定两个 3*2 矩阵（利用二维数组），求和后输出。
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/18 0:32
 */
public class Array_49 {
    public static void main(String[] args) {
        SumTwoDimensionalArray();
    }
    public static void SumTwoDimensionalArray(){
        int[][] array_49_1 = {{1,2},{3,4},{5,6}};
        int[][] array_49_2 = {{7,8},{9,10},{11,12}};
        int[][] sum = {{0,0,0},{0,0,0},{0,0,0}};
        // 赋值
        for (int i = 0; i < array_49_1.length; i++){
            for (int j = 0;j < array_49_1[i].length; j++){
                // System.out.print(array_49_1[i][j]+" ");
                // System.out.println(array_49_2[i][j]);
                sum[i][j] = array_49_1[i][j]+array_49_2[i][j];
            }
        }
        // 输出
        System.out.println("矩阵求和为：");
        for (int i = 0; i < array_49_1.length; i++){
            //
            for (int j = 0;j < array_49_1[i].length; j++){
                // System.out.print(array_49_2[i][j]+" ");
                // System.out.println(array_49_2[i][j]);
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
