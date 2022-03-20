package array;
//https://leetcode-cn.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
      int l = 0;
      int r = height.length-1;
      int maxArea = 0 ;
      while(l<r){
        int area = Math.min(height[l],height[r])*(r-l);
        maxArea = Math.max(area,maxArea);
        if(height[l] <= height[r]){
          l++;
        }else{
          r--;
        }
      }
      return maxArea;
    }

    //The key of this answer is use double index , one loop is enough;
}
