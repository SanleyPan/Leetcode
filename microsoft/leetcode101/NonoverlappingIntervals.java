package leetcode101;

import java.lang.reflect.Array;
import java.util.Arrays;

//435 https://leetcode-cn.com/problems/non-overlapping-intervals/
public class NonoverlappingIntervals {

  public int eraseOverlapIntervals(int[][] intervals) {
    if(intervals.length == 0){
      return 0;
    }
    Arrays.sort(intervals,(a,b) -> a[1] - b[1]);
    int ans = 1;
    int end = intervals[0][1];

    for (int i = 1; i < intervals.length ;i ++){
      if (end <= intervals[i][0]){
        ans ++;
        end = intervals[i][1];
      }
    }
    return intervals.length - ans;
  }

}

//We need sort the arrays first , and compare the previous end  of  current start , if start equals or bigger than end ,prove two intervals are not  overlapping
