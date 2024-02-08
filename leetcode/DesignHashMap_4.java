package com.engineering.leetcode;

import java.util.Arrays;

class MyHashMap_UsingArray {           //constraints : 0 <= key, value <= 106
    int[] hashmap = new int[1000001];
    public MyHashMap_UsingArray() {
        Arrays.fill(hashmap, -1);
    }
    public void put(int key, int value) {
        hashmap[key] = value;
    }
    public int get(int key) {
        return hashmap[key];
    }
    public void remove(int key) {
        hashmap[key] = -1;
    }
}

class MyHashMap_UsingLinkedList {
    //TODO:::
    final int size = 1000001;       //biggest prime number for less hash collisions
    static class ListNode {
        int key;
        int value;
        ListNode next;
        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    public int hash(int key) {
        return key % size;
    }
    public void put(int key, int value) {
        int ind = hash(key);
    }
    public int get(int key) {
        return -1;
    }
    public void remove(int key) {

    }
}
public class DesignHashMap_4 {
    public static void main(String[] args) {
        MyHashMap_UsingArray myHashMap = new MyHashMap_UsingArray();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);

        System.out.println(myHashMap.get(1));
        myHashMap.remove(2);

        System.out.println(myHashMap.get(2));
    }
}
