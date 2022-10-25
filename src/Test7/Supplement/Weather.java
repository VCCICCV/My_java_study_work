package Test7.Supplement;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 9:38
 */
public class Weather {
    WeatherState  state;
    public void show() {
        state.showState();
    }
    public void setState(WeatherState s) {
        state = s;
    }
}

