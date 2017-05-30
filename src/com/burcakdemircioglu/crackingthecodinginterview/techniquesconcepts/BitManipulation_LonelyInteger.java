package com.burcakdemircioglu.crackingthecodinginterview.techniquesconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by burcakdemircioglu on 30/05/2017.
 */
//https://www.hackerrank.com/challenges/ctci-lonely-integer
//Please do not directly copy the answer! These answers are just for educational purposes.
public class BitManipulation_LonelyInteger {

  public static int lonelyInteger(int[] a) {

    int temp[] = new int[100];

    for (int i : a) {
      if (temp[i] == 0) {
        temp[i] = 1;
      } else {
        temp[i] = 0;
      }
    }

    for (int i = 0; i < 100; i++) {
      if (temp[i] == 1) {
        return i;
      }
    }
    return -1;
  }

  public static int lonelyIntegerAlternate(int[] a) {

    HashMap<Integer, Boolean> map = new HashMap<>();

    for (int i : a) {
      Boolean isLonely = map.get(i);
      if (isLonely == null) {
        map.put(i, true);
      } else {
        map.put(i, !isLonely);
      }
    }

    for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
      if (entry.getValue()) {
        return entry.getKey();
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    System.out.println(lonelyInteger(a));
  }
}
