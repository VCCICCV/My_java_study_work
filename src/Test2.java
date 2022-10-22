/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/21 23:03
 */
public class Test2

{

    public static void mb_method(StringBuffer x,StringBuffer y)

    {

        x.append(y);

        y=x;

    }//方法 mb_method 结束

    public static void main(String[] args){

        StringBuffer a=new StringBuffer("A");

        StringBuffer b=new StringBuffer("B");

        mb_method(a,b);

        System.out.println(a+","+b);

    }//方法 main 结束

}