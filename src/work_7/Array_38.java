package work_7;

import java.util.ArrayList;
/**
 * 38.定义一个存储 9*9 乘法表的数组，赋值并输出。
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/17 23:42
 */
public class Array_38 {
    public static void main(String[] args) {
        MltiplicationTable();
    }
    public static void MltiplicationTable(){
        ///创建了一个ArrayList集合，集合的名称是list，里面装的全都是string字符串类型的数据
        //右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                //向集合添加数据
                list.add(j + "×" + i + "=" + i * j + "\t");
                System.out.print(j + "×" + i + "=" + i * j + "\t");// \t 跳到下一个TAB位置
            }
            list.add("\n");
            System.out.println();
        }
        System.out.println("储存的乘法表为：\n"+list);
    }
}
