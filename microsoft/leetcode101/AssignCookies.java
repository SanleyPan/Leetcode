package leetcode101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AssignCookies {

//  有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。每个孩子只能吃 最多一个饼干，且只有饼干的大小大于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩 子可以吃饱。
//  输入输出样例
//  输入两个数组，分别代表孩子的饥饿度和饼干的大小。输出最多有多少孩子可以吃饱的数 量。
/*
  Input: [1,2], [1,2,3]
  Output: 2*/


  public static void main(String[] args) {
    ArrayList<Integer> children = new ArrayList<>();
    ArrayList<Integer> cookies = new ArrayList<>();
    children.add(1);
    children.add(2);
    cookies.add(1);
    cookies.add(2);
    cookies.add(3);

    System.out.println(assign(children,cookies));
  }

  public static int assign(ArrayList<Integer> children, ArrayList<Integer> cookies) {
    Collections.sort(children);
    Collections.sort(children);
    int childrenIndex = 0;
    int cookiesIndex = 0;
    while(childrenIndex < children.size() && cookiesIndex < cookies.size()){
      if (children.get(childrenIndex) <= cookies.get(cookiesIndex)){
        childrenIndex ++;
      }
      cookiesIndex ++;
    }
    return childrenIndex;
  }

  //We use Greedy algorithm to solve this one;
}
