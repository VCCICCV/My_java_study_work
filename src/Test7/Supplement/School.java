package Test7.Supplement;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 9:20
 */
public class School implements CompurerAverage{
    //【代码1】//重写public double average(double x[])方法,返回数组x[]的元素的算术平均
    @Override
    public double average(double[] x) {
        int count = x.length;
        double aver = 0, temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (x[j] < x[i]) {
                    temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
        }
        // 计算全部
        for (int i = 0; i < count; i++) {
            aver = aver + x[i];
        }
        if (count > 2)
            // 去首尾
            aver = aver / count;
        else
            // 一个或两个返回0
            aver = 0;
        return aver;
    }
}
