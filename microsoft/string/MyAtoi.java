package string;

public class MyAtoi {
  //https://leetcode-cn.com/problems/string-to-integer-atoi/
  public int myAtoi(String s) {
    s = s.trim();
    if(s.length() == 0) return 0;
    if(!Character.isDigit(s.charAt(0)) && s.charAt(0) != '-' && s.charAt(0) != '+' ){
      return 0;
    }
    Long res = 0L;
    boolean neg = s.charAt(0) == '-';
    int index = !Character.isDigit(s.charAt(0)) ? 1 : 0;
    while( index < s.length() && Character.isDigit(s.charAt(index))){
      res  = res * 10 + (s.charAt(index ++)- '0');
      if(!neg && res >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if(neg && res > 1L +  Integer.MAX_VALUE) {
        return - (Integer.MAX_VALUE + 1);
      }
    }
    return neg ? (int) -res : (int)+res;
  }
  //the key of this answer is loop the string one by one and find the edge case
}
