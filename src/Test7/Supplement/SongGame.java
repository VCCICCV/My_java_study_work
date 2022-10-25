package Test7.Supplement;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 9:20
 */
public class SongGame implements CompurerAverage {
    @Override
    public double average(double x[]) {
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
        // 去掉最高和最低
        for (int i = 1; i < count - 1; i++) {
            aver = aver + x[i];
        }
        if (count > 2)
            // 去首尾
            aver = aver / (count - 2);
        else
            // 一个或两个返回0
            aver = 0;
        return aver;
    }
}
