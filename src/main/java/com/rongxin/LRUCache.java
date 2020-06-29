package com.rongxin;

public class LRUCache<K, V> {
    public static void main(String[] args) {
        LRUCache<String, String> lru = new LRUCache<>(5);
        lru.put("1", "1");
        lru.put("2", "2");
        lru.put("3", "3");
        lru.put("4", "4");
        lru.put("5", "5");
        System.out.println(lru.get("1"));
        lru.put("6", "6");
        System.out.println(lru.get("2"));
    }


    Node head = new Node();
    Node tail;

    int max;
    int size = 0;

    public LRUCache(int max) {
        this.max = max;
        tail = head;
    }

    public void put(K key, V value) {
        if (get(key) == null) {
            tail.next = new Node(key, value);
            tail = tail.next;

            if (size == max) {
                head.next = head.next.next;
            } else {
                size++;
            }
        } else {
            Node temp = head;
            while (temp.next.key != key) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail.next = new Node(key, value);
        }
    }

    public V get(K key) {
        V v = null;
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.key.equals(key)) {
                v = (V) temp.next.value;
                temp.next = temp.next.next;
                tail.next = new Node(key, v);
                tail = tail.next;
                break;
            }
            temp = temp.next;
        }
        return v;
    }

    public boolean delete(K key) {
        if (get(key) == null) {
            return false;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.key.equals(key)) {
                    temp.next = temp.next.next;
                    size--;
                    break;
                }
            }
        }
        return true;
    }

    class Node<K, V> {
        K key;
        V value;
        Node next;

        public Node() {
            key = (K) new Object();
            value = (V) new Object();
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
