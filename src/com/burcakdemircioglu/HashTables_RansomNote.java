package com.burcakdemircioglu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by burcakdemircioglu on 20/04/2017.
 */
//https://www.hackerrank.com/challenges/ctci-ransom-note
//Please do not directly copy the answer! These answers are just for educational purposes.
public class HashTables_RansomNote {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    String magazine[] = new String[m];
    for (int magazine_i = 0; magazine_i < m; magazine_i++) {
      magazine[magazine_i] = in.next();
    }
    String ransom[] = new String[n];
    for (int ransom_i = 0; ransom_i < n; ransom_i++) {
      ransom[ransom_i] = in.next();
    }

    if (canReplicateRansom(magazine, ransom)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static boolean canReplicateRansom(String magazine[], String ransom[]) {
    // write your code here
    HashMap<String, Integer> wordsMap = new HashMap<>();
    for (String s : magazine) {
      wordsMap.merge(s, 1, (a, b) -> a + b);
    }

//    wordsMap.forEach((s, i)-> System.out.println(s+":"+i));

    for (String s : ransom) {
      Integer existsCount = wordsMap.get(s);
      if (existsCount == null || existsCount == 0) {
        return false;
      } else {
        wordsMap.merge(s, 1, (a, b) -> a - b);
      }
    }

    return true;
  }
}
