package com.engineering.challenges.linkedlist;

class ListNode {
    int value;
    ListNode next;
    public ListNode() {
    }
    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
public class LinkedListProblems {

    static ListNode head = null;
    static ListNode tail = null;

    private static void takeInput(int value) {
        ListNode node = new ListNode(value);

        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    private static void printList() {
        ListNode current = head;

        while (current != null) {
            //System.out.println(current.value);
            current = current.next;
        }

        System.out.println(head);
    }

    private static void findMiddleOfLinkedList() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Value : " + slow.value + " & next list of nodes : " + slow.next);

        //OR
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        int i = 0;
        ListNode middle = head;
        while (i < length/2) {
            middle = middle.next;
            i++;
        }

        System.out.println(middle.value);
    }

    private static void insertInBeginning() {
        ListNode node = new ListNode(1);
        node.next = head;
        head = node;

        System.out.println(head);
    }

    private static void insertInEnd() {
        ListNode node = new ListNode(1);
        tail.next = node;
        node.next = null;

        System.out.println(head);
    }

    private static void insertInMiddle() {
        ListNode node = new ListNode(1);
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = node;
        node.next = slow;

        System.out.println(head);
    }

    private static void deleteNodeInBeginning() {
        ListNode curr = head.next;
        head = null;
        head = curr;

        System.out.println(head);
    }

    private static void deleteNodeInEnd() {
        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

        System.out.println(head);
    }

    private static void deleteNodeInMiddle() {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        slow = null;

        System.out.println(head);
    }

    private static void reverseLinkedListIterative() {
        //take 3 pointers : current, prev and next
        //1. Store the next node temporarily
        //2. Reverse the direction of the pointer
        //3. Move to the next node

        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;

        while (current != null) {

            next = current.next;            //1. Store the next node temporarily
            current.next = prev;            //2. Reverse the direction of the pointer

            prev = current;                 //3. Move to the next node
            current = next;
        }

        System.out.println(prev);           //prev is now head of linked list
    }

    private static void reverseLinkedListRecursive() {
        ListNode prev = null;
        ListNode current = head;

        System.out.println(helper(prev, current));
    }

    private static ListNode helper(ListNode prev, ListNode current) {
        if (current == null) {
            return prev;
        }

        ListNode next = current.next;
        current.next = prev;

        return helper(current, next);
    }

    private static void reverseLinkedListRecursiveAnother() {
        ListNode current = head;
        System.out.println(helperAnother(current));
        //dry run
        /*
                10 -> 20 -> 30 -> null

                node = 30
                current = 20
                20 -> 30
                current.next = 30 (current.next.next = current : makes 30 point to 20)
                current.next.next = current (30.next = 20) or 30 -> 20
                current.next = null ( 20 next is null) or 30 -> 20 -> null
                end

                node = 30
                current = 10
                10 -> 20
                current.next = 20 (current.next.next = : current makes 20 point to 10)
                current.next.next = current (20.next = 10) or 20 -> 10
                current.next = null ( 10 next is null) or 20 -> 10 -> null
                end

                now linked list becomes : 30 -> 20 -> 10 -> null with head at 30 (node : 30 is returned)
         */
    }

    private static ListNode helperAnother(ListNode current) {
        if (current == null || current.next == null) {
            return current;
        }

        ListNode node = helperAnother(current.next);

        current.next.next = current;
        current.next = null;

        return node;
    }

    private static boolean checkIfLinkedListPalindrome(ListNode head) {
        //reverse half LL and cross-check values
        if (head == null || head.next == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //serialInput();                        //input
        palindromeInput();

        //printList();                          //output

        //findMiddleOfLinkedList();             //middle element

        //insertInBeginning();                  //insert
        //insertInEnd();
        //insertInMiddle();

        //deleteNodeInBeginning();              //delete
        //deleteNodeInEnd();
        //deleteNodeInMiddle();

        //reverseLinkedListIterative();         //reverse
        //reverseLinkedListRecursive();
        //reverseLinkedListRecursiveAnother();

        checkIfLinkedListPalindrome(head);          //palindrome

    }

    private static void palindromeInput() {
        takeInput(10);
        takeInput(20);
        takeInput(20);
        takeInput(10);
    }

    private static void serialInput() {
        takeInput(10);
        takeInput(20);
        takeInput(30);
        takeInput(40);
        takeInput(50);
    }
}
