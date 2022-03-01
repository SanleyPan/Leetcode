package string;

public class Zigzag {


    public static void main(String[] args) {
        convert("PAYPALISHIRING",3);
    }
   public static String convert(String s, int numRows) {
        int n = s.length(), r = numRows;
        if (r == 1 || r >= n) {
            return s;
        }
        String ans = "";
        int t = r * 2 - 2;
        for (int i = 0; i < r; ++i) { // 枚举矩阵的行
            for (int j = 0; j + i < n; j += t) { // 枚举每个周期的起始下标
                ans += s.charAt(j + i); // 当前周期的第一个字符
                if (0 < i && i < r - 1 && j + t - i < n) {
                    ans += s.charAt(j + t - i); // 当前周期的第二个字符
                }
            }
        }
        return ans;
    }
    //the key of this answer is first we need to find the row num and use double loop to simulate two dimensional array
    // and find logic of alphabet one by one
    
}
