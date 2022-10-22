package work_7;

/**
 * 42.定义一个数组 int [][]a，初始化元素为 {{1,2},{3,4,5},{6,7,8,9}}，按数组的行和列输出每个元素。
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/18 0:20
 */
public class Array_42 {
    public static void main(String[] args) {
        Traverse();
    }
    public static void Traverse(){
        int [][] a42= {{1,2},{3,4,5},{6,7,8,9}};
        //for-each遍历二维数组
        // 把一组分配给数组
        for (int[] arr1 : a42) {
            // 把组元素分别给arr2
            for (int arr2 : arr1) {
                System.out.print(arr2+"\t");
            }
            System.out.println();
        }
    }
}
