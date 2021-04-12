package list.arraylist.implemation;

public class Main {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		
		// addLast(value)는 ArrayList객체의 마지막에 element를 추가하는 메소드입니다.
		numbers.addLast(10);	// numbers[0] == 10
		numbers.addLast(20);	// numbers[1] == 20
		numbers.addLast(30);	// numbers[2] == 30
		numbers.addLast(40);	// numbers[3] == 40
		
		// [0] == 10 / [1] == 20 / [2] == 30 / [3] == 40
		System.out.println("numbers -> " + numbers);
		
		// add(index, value)는 ArrayList객체의 'index'에 해당하는 인덱스를 가진 element에
		// 'value'에 해당하는 값을 대입하는 메소드입니다.
		// ('index'에 해당하는 인덱스와 'index'보다 큰 인덱스를 가지고 있던 기존의 element들은
		// 기존의 인덱스에 1을 더한 인덱스를 가지게 됩니다. 즉, 뒤로 밀리게됩니다.)
		numbers.add(1, 15);
		
		// [0] == 10 / [1] == 15 / [2] == 20 / [3] == 30 / [4] == 40
		System.out.println("numbers.add(1, 15); -> " + numbers);
		
		// add(value)는 ArrayList객체의 0번 인덱스를 가진 element에 값에
		// 'value'값을 대입하는 메소드입니다.(0번 인덱스의 element가 추가되므로
		// 기존의 모든 element들은'기존 인덱스 + 1'의 인덱스 값을 가지게 됩니다.)
		numbers.addFirst(5);
		
		// [0] == 5 / [1] == 10 / [2] == 15 / [3] == 20 / [4] == 30 / [5] == 40
		System.out.println("numbers.addFirst(5); -> " + numbers);
	}

}
