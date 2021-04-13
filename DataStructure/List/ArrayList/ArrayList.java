package list.arraylist.implemation;
/**
 * ArrayList Ŭ������ �����ϴ� ����
 * @author jikang
 *
 */
public class ArrayList {
	
	// ArrayList ��ü�� element ������ ���ԵǴ� �����Դϴ�.
	private int size = 0;
	
	// ���������� ����ϴ� �迭�Դϴ�. �н��� ���� �����ϱ� ���� Object[]�� �̿��մϴ�.
	// Object ������ Ÿ���� �迭�� �����ؼ� elementData��� ����� �����ڸ� �������ִ� �ν��Ͻ� ������ �Ҵ��մϴ�.
	private Object[] elementData = new Object[100];
	
	/**
	 * �Ű������� ���޹��� 'value'���� 0�� �ε����� ���� element�� ���� �����ϴ� �޼ҵ� �Դϴ�.
	 * (public boolean add(int index, Object value) �޼ҵ带 Ȱ���մϴ�.)
	 */
	public boolean addFirst(Object value) {
		return add(0, value);
	}

	/**
	 * ArrayList ��ü�� ���� element�� �߰��ϴ� �޼ҵ��Դϴ�.
	 */
	public boolean addLast(Object element) {
		
		// size �ν��Ͻ� ������ ���� ������ element�� �ε��� �� +1 ��ŭ�Դϴ�.(�ʱⰪ 0�� ����)
		// size �ν��Ͻ� ������ ���� �߰��Ǵ� element�� �ε����� �����ϸ�
		// '������ element�� �ε��� + 1'�� �ش��ϴ� �ε����� ���ο� value�� �����Ͽ�
		// ������ element�� �ڿ� ���ο� element�� �߰��� �� �ֽ��ϴ�.		
		elementData[size] = element;
		
		// ���ο� element�� �߰��Ǿ����Ƿ� size�� +1 �մϴ�.
		size++;
		return true;		
	}
	
	/**
	 * �Ű������� ���޹��� 'index'�� �ش��ϴ� �ε����� 'value'���� �����ϴ� �޼ҵ��Դϴ�.
	 * ('index'���� ũ�ų� ���� ���� �ε����� element���� �ε����� 1�� �����մϴ�.)
	 */
	public boolean add(int index, Object value) {
		for(int i = size - 1; i >= index ; i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = value;
		size++;
		return true;
	}
	
	/**
	 * toString()�� ��ü�� ���ڿ��� ����ؾ� �ϴ� ��Ȳ���� �ڵ����� ȣ��Ǵ� �޼ҵ��Դϴ�.
	 */
	public String toString() {
		String str = "[";
		
		for(int i = 0; i < size; i++) {
			str += elementData[i];
			if(i < size - 1) {
				str += ", ";
			}
		}		
		return str + "]";
	}
	
	/*
	 * �Ű������� ���޹��� 'index'�� �ش��ϴ� �ε����� ���� element�� �����ϴ� �޼ҵ��Դϴ�.
	 * ('index'���� ū �ε����� ������ �ִ� ������ element���� �ε����� 1�� �����մϴ�.)
	 */
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i = index + 1; i <= size - 1; i++) {
			elementData[i - 1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}
	
	/**
	 * ù ��° element�� �����ϴ� �޼ҵ��Դϴ�.
	 * (��� element���� ������ �ε����� 1�� �� �ε����� ������ �˴ϴ�. ��, ������ ������� �˴ϴ�.)
	 */
	public Object removeFirst() {
		return remove(0);
	}
	
	/**
	 * ������ element�� �����ϴ� �޼ҵ��Դϴ�.
	 */
	public Object removeLast() {
		return remove(size - 1);
	}
	
	/**
	 * �Ű������� ���޹��� 'index'�� �ش��ϴ� �ε����� ���� element�� ���� �����ϴ� �޼ҵ� �Դϴ�.
	 */
	public Object get(int index) {
		return elementData[index];
	}
	
	/**
	 * element�� ������ �����ϴ� �޼ҵ��Դϴ�.
	 */
	public int size() {
		return size;
	}
	
	/**
	 * �Ű������� ���޹��� 'value'�� �ش��ϴ� ���� ���� element�� �ε����� �����ϴ� �޼ҵ��Դϴ�.
	 */
	public int[] indexOf(Object value) {
		int[] tempArr = new int[size];
		int count = 0;
		for(int i = 0; i <= size - 1; i++) {
			if(value.equals(elementData[i])) {
				count++;
				tempArr[count - 1] = i;
			}
		}		
		int[] indexArr = new int[count];
		for(int i = 0; i < count; i++) {
			indexArr[i] = tempArr[i];
		}
		return indexArr;
	}
}
