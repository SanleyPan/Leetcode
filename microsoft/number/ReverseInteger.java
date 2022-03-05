package number;

public class ReverseInteger {
 /* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
 the signed 32-bit integer range [-231, 231 - 1], then return 0.

  Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

       

  Example 1:

  Input: x = 123
  Output: 321
  Example 2:

  Input: x = -123
  Output: -321
  Example 3:

  Input: x = 120
  Output: 21 */
 public static void main(String[] args) {
   System.out.println( reverse(-12));
 }

 public static int reverse(int x){
   int res = 0;
   while(x !=0){
     if (res < Integer.MIN_VALUE/10 || res > Integer.MAX_VALUE/10){
       return 0;
     }
     int digit = x % 10;
     x /= 10;
     res = res * 10 +digit;
   }
   return res;
 }
 //We use mod to  get individual num one by one ,
  // strict by Integer.maxvalue/ & Integer.minvalue/10 to control error of store integer

}
