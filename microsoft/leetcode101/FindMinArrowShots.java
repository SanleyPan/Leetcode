package leetcode101;

import java.util.Arrays;

public class FindMinArrowShots {
  public int findMinArrowShots(int[][] points) {
    if(points.length == 0) return 0;
    int shot = 1;
    Arrays.sort(points,(a,b) -> Integer.compare(a[1], b[1]));
    int end = points[0][1];
    for(int i = 1; i < points.length ; i++){
      if(points [i][0] <= end){
        continue;
      }
      shot ++;
      end =  points[i][1];
    }
    return shot;
  }

  // We sort intervals by end , and compare current start of previous end, if start smaller than end , means they are overlapping, one shot is enough
}
