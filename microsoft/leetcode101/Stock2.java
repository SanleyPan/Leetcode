package leetcode101;

import java.util.ArrayList;
import java.util.List;

public class Stock2 {
  public int maxProfit(int[] prices) {
    int output = 0;
    if(prices.length == 0){
      return output;
    }
    for(int i = 1; i < prices.length ;i++){
      output += Math.max(0, prices[i] - prices[i-1]);
    }
    return output;
  }
  //compare current to previous ,if previous smaller than current , calculate the gap,its profit


  public static void main(String[] args) {
    ArrayList<String>  list= new ArrayList<>();
    list.add(0,"Zero");
    list.add(0,"one");
    list.add(0,"two");
    list.add(0,"three");
    System.out.printf(String.valueOf(list));
  }
}
