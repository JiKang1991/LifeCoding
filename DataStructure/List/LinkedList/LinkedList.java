package list.linkedlist.implementation;
/**
 * LinkedList Ŭ������ �����ϴ� ����
 * @author jikang
 *
 */
public class LinkedList {
	// LinkedList ��ü�� ù��° ����� �ּҰ��� �����ϴ� �����Դϴ�.
	private Node head;
	
	// LinkedList ��ü�� ������ ����� �ּҰ��� �����ϴ� �����Դϴ�.
	private Node tail;
	
	// LinkedList ��ü�� ��� ������ �����ϴ� �����Դϴ�.
	private int size = 0;
	
	/**
	 * �Ű������� ���޹��� input���� �Ű������� Node �����ڸ� ȣ���մϴ�.
	 * ���Ӱ� ������ node�� next�������� ������ ù��° ��带 �����ϴ�
	 * head������ ���� �����մϴ�.(ù �����ÿ���  null���� ���Ե˴ϴ�.)
	 * LinkedList�� head �������� ���Ӱ� ������ node�� �ּҸ� �����մϴ�.
	 * ù ������ �ش��Ͽ� ���� head�� null�� ��� tail����
	 * ���Ӱ� ������ node�� �ּҸ� �����մϴ�.(LinkedList�� size�� 1��
	 * �ϳ��� ��尡 head�� tail�� �Բ� �ϴ� ��쿡 �ش��մϴ�.)
	 * 
	 */
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null) {
			tail = head;
		}
		
	}
	
	
	// Node �ڷ����� �����ϴ� Inner Class �Դϴ�.
	private class Node{
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		// Node ��ü�� data�� ���ڿ��� ��ȯ�ϴ� �Լ��Դϴ�.
		public String toString() {
			return String.valueOf(this.data);
		}
	}
}
