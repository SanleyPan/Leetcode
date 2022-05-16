package leetcode101;

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
}
