package Test_8;

/**
 * @PROJECT_NAME Work_2
 * @AUTHOR VCCICCV
 * @DATE 2022/10/30 16:07
 */
public class CapitalAndLowercaseLetters {
    public static void main(String[] args) {
        String str = "aWdefEhiACpqrstBDwxyz";
        int big = 0;
        int small = 0;
        for (int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>'A' && c<'Z'){
                big++;
            }
            if(c>'a' && c<'z'){
                small++;
            }
        }
        System.out.println("大写字母的个数为" + big + "\n小写字母的个数为" + small);
    }
}
