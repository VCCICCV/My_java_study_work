package Work_1;

/**
 * @author VCCICCV
 * @project_name Work_2
 * @date 2022/10/4 20:58
 */
public class Date {
    public int year;
    public int month;
    public int day;
    public Date(int year){

    }
    public Date(int year, int month){

    }
    public Date(int year, int month,int day){

    }


    public static void main(String[] args) {
        Date date1= new Date(2016);
        Date date2 = new Date(2016,10);
        Date date3 = new Date(2016,10,1);
    }
}
