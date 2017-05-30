package com.burcakdemircioglu.datastructures;

import java.util.Scanner;

/**
 * Created by burcakdemircioglu on 20/04/2017.
 */
//https://www.hackerrank.com/challenges/ctci-array-left-rotation
//Please do not directly copy the answer! These answers are just for educational purposes.
public class Arrays_LeftRotation {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int a[] = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }

    int begin;
    for (int i = 0; i < k; i++) {
      begin = a[0];
      for (int j = 1; j < n; j++) {

        a[j - 1] = a[j];
      }
      a[a.length - 1] = begin;
    }

    for (int a_i = 0; a_i < n; a_i++) {
      System.out.print(a[a_i] + " ");
    }
  }
}
