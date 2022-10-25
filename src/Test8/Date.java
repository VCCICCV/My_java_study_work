package Test8;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/25 22:50
 */
public class Date {
    private int year,month,day;
    public Date(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void showTime(){
        System.out.println(year + "年" + month + "月" + day + "天");
    }
}
class Test8_3{
    public static void main(String[] args) {
        Date date = null;
        String str = "2016年10月";
        String[] days1=new String[30];
        String[] days2=new String[30];
        for (int i = 0; i <= 29; i++) {

            /**
             * 法一：new对象
             * */
            date= new Date(2016,10,i+1);
            date.showTime();
            days2[i] = str+(i+1)+"日";
        }
        for (int i = 0; i <= 29; i++) {
            // days1[i].showTime();
        }
        /**
         * 法二：字符串数组
         */
        for (String ra:days2) {
            System.out.println(ra);
        }
    }
}
