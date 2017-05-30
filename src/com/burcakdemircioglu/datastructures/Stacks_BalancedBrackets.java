package com.burcakdemircioglu.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by burcakdemircioglu on 30/05/2017.
 */
//https://www.hackerrank.com/challenges/ctci-balanced-brackets
//Please do not directly copy the answer! These answers are just for educational purposes.
public class Stacks_BalancedBrackets {

  public static boolean isBalanced(String expression) {
    Stack<Character> openingParenthesis = new Stack<>();
    for (char c : expression.toCharArray()) {
      if (c != '}' && c != ')' && c != ']') {
        openingParenthesis.push(c);
      } else {
        if (openingParenthesis.empty()) {
          return false;
        }
        Character pop = openingParenthesis.pop();
        if (pop == '(' && c != ')') {
          return false;
        } else if (pop == '{' && c != '}') {
          return false;
        } else if (pop == '[' && c != ']') {
          return false;
        }
      }
    }
    if(!openingParenthesis.empty())
      return false;
    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      String expression = in.next();
      System.out.println((isBalanced(expression)) ? "YES" : "NO");
    }
  }
}
