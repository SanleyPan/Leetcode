package leetcode101;

import java.util.Arrays;

//605  https://leetcode.cn/problems/can-place-flowers/?utm_source=LCUS&utm_medium=ip_redirect&utm_campaign=transfer2china
public class CanPlaceFlowers {


  public boolean canPlaceFlowers(int[] flowerbed, int n) {

    int count = 1;
    for (int bed : flowerbed){
      if (bed == 0){
        count ++;
      }else {
        n -= (count - 1)/2;
        count = 0;
      }
    }
    count ++;
    n -= (count - 1)/2;
    return n <= 0;
  }


  //we can calculate the continues empty bed , if it has 5 continusely empty bed , we can plot 2 plant,so we can get the formula : plot = (count - 1)/2
}
