package Test8;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 22:41
 */
public class Test8_2 {
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        System.out.println("按行输出：");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("按列输出：");

        // for (j = 0; j < a[j].length; j++) {
        //     for (i = 0; i < a[i].length; i++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("test");
        // for (int j = 0; j < a.length; j++) {
        //     // for (int temp :a[i]) {
        //     //     System.out.println(temp);
        //     // }
        //         for (int i = 0; i < a[i].length; ++i) {
        //             System.out.print(a[i][j] + " ");
        //         }
        //     System.out.println();
        // }
        // System.out.println("test2");

        // for (int j = 0; j < 4; j++) {
        //     for (int i = 0; i < a[i].length; i++) {
        //         System.out.print(a[i][j] + " ");
        //
        //     }
        //     System.out.println();
        // }
        // int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                // temp[j] = a[j];
                // System.out.print(a[j][i] + " ");
                for (int temp2:a[j]) {
                    System.out.print(temp2+" ");
                }
            }
            System.out.println();
        }
        // System.out.println("3后面的元素："+a[0][2]);

    }
}
