package Test7.Supplement;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 9:39
 */
public class WeatherForecast {  //主类
    public static void main(String args[]) {
        Weather weatherBeijing =new Weather();
        System.out.print("\n今天白天:");
        weatherBeijing.setState(new CloudyDayState());
        weatherBeijing.show();
        System.out.print("\n今天夜间:");
        weatherBeijing.setState(new LightRainState());
        weatherBeijing.show();
        System.out.print("转:");
        weatherBeijing.setState(new HeavyRainState());
        weatherBeijing.show();
        System.out.print("\n明天白天:");
        weatherBeijing.setState(new LightRainState());
        weatherBeijing.show();
        System.out.print("\n明天夜间:");
        weatherBeijing.setState(new CloudyLittleState());
        weatherBeijing.show();
    }
}
