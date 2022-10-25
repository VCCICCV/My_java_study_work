package Test7.Supplement;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 9:40
 */
public class CloudyDayState implements WeatherState {
    //【代码1】 //重写public void showState()

    @Override
    public void showState() {
        System.out.println("多云~");
    }
}

