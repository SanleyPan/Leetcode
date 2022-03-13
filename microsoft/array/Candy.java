package array;

//https://leetcode-cn.com/problems/candy/


class Candy {
  public int candy(int[] ratings) {
    if(ratings.length < 2){
      return ratings.length;
    }
    int[] candy = new int[ratings.length];
    for(int i=0;i<candy.length;i++){
      candy[i]=1;
    }
    for(int i = 1;i<ratings.length;i++){
      if(ratings[i-1]<ratings[i]){
        candy[i]= candy[i-1]+1;}
    }
    for(int i = ratings.length-1;i>0;i--){
      if(ratings[i]<ratings[i-1]){
        candy[i-1] = Math.max(candy[i-1],candy[i]+1);
      }
    }
    int result = 0;
    for(int i:candy){
      result += i;
    }
    return result;
  }

  //We use two loop to compare rating and give candy to them
}