package com.rongxin.extra;

class KVCache<K, V> {
	Node head = new Node();
	Node tail;
	int max;
	int size = 0;

	public KVCache(int n) {
		max = n;
		tail = head;
	}

	public void put(K key, V value) {
		Node temp = get(key);
		if (temp != null) {
			temp.value = value;
		} else {
			size++;
			tail.next = new Node(key, value);
			tail = tail.next;
			if (size > max) {
				size--;
				if (size != 0) {
					head.next = head.next.next;
				}
			}
		}
	}

	public void delete(V key) {
		Node pre = head;
		Node cur = head.next;
		while (cur != null) {
			if (key.equals(cur.key)) {
				pre.next = cur.next;
				size--;
				break;
			}
		}
		pre = cur;
		cur = cur.next;
	}

	public Node get(K key) {
		Node cur = head;
		while (cur != null) {
			if (key.equals(cur.key)) {
				return cur;
			}
			cur = cur.next;
		}
		return null;
	}


	class Node<K, V> {
		K key;
		V value;
		Node next;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public Node() {
			this.key = (K) new Object();
			this.value = (V) new Object();
		}
	}

}
