package com.burcakdemircioglu.crackingthecodinginterview.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by burcakdemircioglu on 30/05/2017.
 */
//https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
//Please do not directly copy the answer! These answers are just for educational purposes.
public class Queues_ATaleOfTwoStacks {

  public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue<>();

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      int operation = scan.nextInt();
      if (operation == 1) { // enqueue
        queue.enqueue(scan.nextInt());
      } else if (operation == 2) { // dequeue
        queue.dequeue();
      } else if (operation == 3) { // print/peek
        System.out.println(queue.peek());
      }
    }
    scan.close();
  }

  public static class MyQueue<T> {

    Stack<T> straight;
    Stack<T> reverse;

    public MyQueue() {
      straight = new Stack<>();
      reverse = new Stack<>();
    }

    public void dequeue() {
      if (reverse.empty()) {
        transfer();
      }
      reverse.pop();
    }

    public void enqueue(T i) {
      straight.push(i);
    }

    public T peek() {
      if (reverse.empty()) {
        return straight.firstElement();
      }
      return reverse.peek();
    }

    public void transfer() {
      while (!straight.empty()) {
        reverse.push(straight.pop());
      }
    }
  }
}
