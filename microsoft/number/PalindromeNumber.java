package number;

public class PalindromeNumber {

  //https://leetcode-cn.com/problems/palindrome-number/
  public static boolean isPalindrome(int x) {
    if(x >= Integer.MAX_VALUE || x < 0){
      return false;
    }
    String s = x + "";
    StringBuilder sb =new StringBuilder("");
    for(int i = s.length()-1;i>=0;i--){
      sb.append(s.charAt(i));
    }
    return Integer.parseInt(sb.toString())==x;
  }

  //There is two method to solve this question , the one is convert int to string and loop by two sides , and another is
  //converse the number , but the second one will overflow when the converse num bigger than Integer.maxvalue ,so we can
  // conversed half of this num, and compare with the left.
}
