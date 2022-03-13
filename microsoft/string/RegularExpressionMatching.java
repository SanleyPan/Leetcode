package string;


//https://leetcode-cn.com/problems/regular-expression-matching/
public class RegularExpressionMatching {

  public static void main(String[] args) {
    isMatch("a","a*");
  }
  public static boolean isMatch(String s, String p) {
    int n = s.length();
    int m = p.length();
    boolean[][] f = new boolean[n + 1][m + 1];
    f[0][0] = true;
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (p.charAt(j-1) == '*') {
          f[i][j] = f[i][j - 2];
          if (isMatch( s , p , i, j-1)){
            f[i][j] = f[i][j] || f[i-1][j];
          }
        }else {
          if (isMatch( s , p , i, j)){
            f[i][j] = f[i-1][j-1];
          }
        }
      }
    }
    boolean result = f[n][m];
    return result;
  }

  public static boolean isMatch(String s, String p, int i, int j) {
    if (i == 0) {
      return false;
    }
    if (p.charAt(j-1) == '.') {
      return true;
    }
    return s.charAt(i-1) == p.charAt(j-1);
  }

  //This answer use Dynamic programming，if pattern's char equals * , there are two answer ,one is equals index -2 or equals -1
}
