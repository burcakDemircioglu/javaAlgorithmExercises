package com.burcakdemircioglu.crackingthecodinginterview.datastructures;

import java.util.HashMap;

/**
 * Created by burcakdemircioglu on 30/05/2017.
 */
//https://www.hackerrank.com/challenges/ctci-linked-list-cycle
//Please do not directly copy the answer! These answers are just for educational purposes.
public class LinkedLists_DetectACycle {

  class Node {

    int data;
    Node next;
  }

  boolean hasCycle(Node head) {
    HashMap<Node, Node> wordsMap = new HashMap<>();

    if (head == null) {
      return false;
    }

    while (head != null) {
      if (wordsMap.get(head) != null) {
        return true;
      }
      wordsMap.put(head, head);
      head = head.next;
    }

    return false;
  }

}
