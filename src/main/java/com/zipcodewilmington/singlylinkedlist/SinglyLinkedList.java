package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <T extends Comparable<T>> {

    public class ListNode {
        T data;
        ListNode next;

        public ListNode(T item) {
            data = item;
        }
    }

    ListNode head;
    ListNode tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public class LinkedList {
        ListNode head;

        public LinkedList(T item) {
            head = new ListNode(item);
        }
    }


    public void add(T item) {
        ListNode newNode = new ListNode(item);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

    //remove -- remove an element (specified by numeric index) from the list
    public boolean remove(T item) {
        if(head == null) return false;
        if(head.data.equals(item)){
            head = head.next;
            if(head == null) tail = null;
            return  true;
        }

        ListNode current = head;
        while (current.next != null){
            if(current.next.data.equals(item)){
                current.next = current.next.next;
                if(current.next == null) tail = current;
                return true;
            }
            current = current.next;
        }
        return false;
    }


    //contains -- returns true if the element is in the list, false otherwise
    public boolean contains(T item) {

        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(item)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
//    size -- returns the current size of the list

    public int size(){
        int count = 0;
        ListNode current = head;

        while (current != null){
            count++;
            current = current.next;
        }
        return  count;
    }

//    find -- returns the element's index if it is in the list, -1 otherwise
    public  int find(T item){
        int index = 0;
        ListNode current = head;
        while (current != null){
            if(current.data.equals(item)){
                return index;
            }
            index++;
            current = current.next;
        }
        return  -1;
    }
//    get -- returns the element at the specified index
    public T get (int indx){
        int current = 0;
        ListNode currentInd = head;

        while (currentInd != null){
            if(current == indx){
                return  currentInd.data;
            }
            current++;
            currentInd = currentInd.next;
        }
        throw new IndexOutOfBoundsException(("Index: " + indx + " Size: " + size()));
    }
//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> copiedList = new SinglyLinkedList<>();

        ListNode current = head;

        while(current != null){
            copiedList.add(current.data);
            current = current.next;
        }
        return copiedList;
    }

//    sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    public void sort(){
        if(head == null || head.next == null) return;

        boolean sorted;
        do{
            sorted = false;
            ListNode current = head;
            while (current.next != null) {
                if(current.data.compareTo(current.next.data) > 0){
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    sorted = true;
                }
                current = current.next;
            }
        }while (sorted);
    }
}

