package com.burcakdemircioglu.crackingthecodinginterview.techniquesconcepts;

import java.util.Scanner;

/**
 * Created by burcakdemircioglu on 30/05/2017.
 */
//https://www.hackerrank.com/challenges/ctci-fibonacci-numbers
//Please do not directly copy the answer! These answers are just for educational purposes.
public class Recursion_FibonacciNumbers {

  public static int fibonacci(int n) {
    // Complete the function.
    if (n == 0 || n == 1) {
      return n;
    }

    return fibonacci(n - 2) + fibonacci(n - 1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    System.out.println(fibonacci(n));
  }
}
