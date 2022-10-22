/**
 * @project_name Work_2
 * @aAUTHOR VCCICCV
 * @DATE 2022/10/17 23:22
 */
public class TestString {
    public static void compare(String str) {
        int countA = 0,counta = 0,countF= 0;
        String M = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String m = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++) {
            if(M.contains(str.substring(i,i+1)))
                countA++;
            else if(m.contains(str.substring(i,i+1))){
                counta++;
            }else{
                countF++;
            }
        }
        System.out.println("大写字符数："+countA+"\t小写字符数："+counta+"\t非英文字母字符数:"+countF);
    }

    public static void main(String[] args) {
        String str = "aWdefEhiACpqrstBDwxyz";
        compare(str);
    }
}
