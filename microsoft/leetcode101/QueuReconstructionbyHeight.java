package leetcode101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueuReconstructionbyHeight {

  public static void main(String[] args) {
    int[][] a= {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
    reconstructQueue(a);
  }

  public static int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people, new Comparator<int[]>() {
      public int compare(int[] person1, int[] person2) {
        if (person1[0] != person2[0]) {
          return person2[0] - person1[0];
        } else {
          return person1[1] - person2[1];
        }
      }
    });
    List<int[]> result = new ArrayList<>();
    for (int[] person : people) {
        result.add(person[1],person);
    }
    return result.toArray(new int[result.size()][]);

    //We need to sort peoples by decent height,because the short one dose not influenced high,we insert higher people first.
  }
}
