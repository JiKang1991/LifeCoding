package list.linkedlist.implementation;
/**
 * LinkedList 클래스를 정의하는 예제
 * @author jikang
 *
 */
public class LinkedList {
	// LinkedList 객체의 첫번째 노드의 주소값을 대입하는 변수입니다.
	private Node head;
	
	// LinkedList 객체의 마지막 노드의 주소값을 대입하는 변수입니다.
	private Node tail;
	
	// LinkedList 객체의 노드 개수를 대입하는 변수입니다.
	private int size = 0;
	
	/**
	 * 매개변수로 전달받은 input값을 매개변수로 Node 생성자를 호출합니다.
	 * 새롭게 생성한 node의 next변수에는 기존의 첫번째 노드를 참조하는
	 * head변수의 값을 대입합니다.(첫 생성시에는  null값이 대입됩니다.)
	 * LinkedList의 head 변수에는 새롭게 생성한 node의 주소를 대입합니다.
	 * 첫 생성에 해당하여 기존 head가 null일 경우 tail에는
	 * 새롭게 생성한 node의 주소를 대입합니다.(LinkedList의 size가 1로
	 * 하나의 노드가 head와 tail을 함께 하는 경우에 해당합니다.)
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
	
	
	// Node 자료형을 정의하는 Inner Class 입니다.
	private class Node{
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		// Node 객체의 data를 문자열로 반환하는 함수입니다.
		public String toString() {
			return String.valueOf(this.data);
		}
	}
}
