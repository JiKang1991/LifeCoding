package list.arraylist.implemation;
/**
 * ArrayList 클래스를 정의하는 예제
 * @author jikang
 *
 */
public class ArrayList {
	
	// ArrayList 객체의 element 개수가 대입되는 변수입니다.
	private int size = 0;
	
	// 내부적으로 사용하는 배열입니다. 학습을 위해 이해하기 쉬운 Object[]을 이용합니다.
	// Object 데이터 타입의 배열을 생성해서 elementData라는 비공개 접근자를 가지고있는 인스턴스 변수에 할당합니다.
	private Object[] elementData = new Object[100];
	
	/**
	 * 매개변수로 전달받은 'value'값을 0번 인덱스를 가진 element의 값에 대입하는 메소드 입니다.
	 * (public boolean add(int index, Object value) 메소드를 활용합니다.)
	 */
	public boolean addFirst(Object value) {
		return add(0, value);
	}

	/**
	 * ArrayList 객체의 끝에 element를 추가하는 메소드입니다.
	 */
	public boolean addLast(Object element) {
		
		// size 인스턴스 변수의 값은 마지막 element의 인덱스 값 +1 만큼입니다.(초기값 0은 예외)
		// size 인스턴스 변수의 값을 추가되는 element의 인덱스로 설정하면
		// '마지막 element의 인덱스 + 1'에 해당하는 인덱스에 새로운 value를 대입하여
		// 마지막 element의 뒤에 새로운 element를 추가할 수 있습니다.		
		elementData[size] = element;
		
		// 새로운 element가 추가되었으므로 size를 +1 합니다.
		size++;
		return true;		
	}
	
	/**
	 * 매개변수로 전달받은 'index'에 해당하는 인덱스에 'value'값을 대입하는 메소드입니다.
	 * ('index'보다 크거나 같은 기존 인덱스의 element들은 인덱스가 1씩 증가합니다.)
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
	 * toString()은 객체를 문자열로 출력해야 하는 상황에서 자동으로 호출되는 메소드입니다.
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
	 * 매개변수로 전달받은 'index'에 해당하는 인덱스를 가진 element를 삭제하는 메소드입니다.
	 * ('index'보다 큰 인덱스를 가지고 있던 기존의 element들은 인덱스가 1씩 감소합니다.)
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
	 * 첫 번째 element를 삭제하는 메소드입니다.
	 * (모든 element들은 기존의 인덱스에 1을 뺀 인덱스를 가지게 됩니다. 즉, 앞으로 당겨지게 됩니다.)
	 */
	public Object removeFirst() {
		return remove(0);
	}
	
	/**
	 * 마지막 element를 삭제하는 메소드입니다.
	 */
	public Object removeLast() {
		return remove(size - 1);
	}
	
	/**
	 * 매개변수로 전달받은 'index'에 해당하는 인덱스를 가진 element의 값을 리턴하는 메소드 입니다.
	 */
	public Object get(int index) {
		return elementData[index];
	}
	
	/**
	 * element의 개수를 리턴하는 메소드입니다.
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 매개변수로 전달받은 'value'에 해당하는 값을 가진 element의 인덱스를 리턴하는 메소드입니다.
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
