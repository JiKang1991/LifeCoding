package list.arraylist.implemation;

public class Main {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		
		// addLast(value)�� ArrayList��ü�� �������� element�� �߰��ϴ� �޼ҵ��Դϴ�.
		numbers.addLast(10);	// numbers[0] == 10
		numbers.addLast(20);	// numbers[1] == 20
		numbers.addLast(30);	// numbers[2] == 30
		numbers.addLast(40);	// numbers[3] == 40
		
		// [0] == 10 / [1] == 20 / [2] == 30 / [3] == 40
		System.out.println("numbers -> " + numbers);
		
		// add(index, value)�� ArrayList��ü�� 'index'�� �ش��ϴ� �ε����� ���� element��
		// 'value'�� �ش��ϴ� ���� �����ϴ� �޼ҵ��Դϴ�.
		// ('index'�� �ش��ϴ� �ε����� 'index'���� ū �ε����� ������ �ִ� ������ element����
		// ������ �ε����� 1�� ���� �ε����� ������ �˴ϴ�. ��, �ڷ� �и��Ե˴ϴ�.)
		numbers.add(1, 15);
		
		// [0] == 10 / [1] == 15 / [2] == 20 / [3] == 30 / [4] == 40
		System.out.println("numbers.add(1, 15); -> " + numbers);
		
		// add(value)�� ArrayList��ü�� 0�� �ε����� ���� element�� ����
		// 'value'���� �����ϴ� �޼ҵ��Դϴ�.(0�� �ε����� element�� �߰��ǹǷ�
		// ������ ��� element����'���� �ε��� + 1'�� �ε��� ���� ������ �˴ϴ�.)
		numbers.addFirst(5);
		
		// [0] == 5 / [1] == 10 / [2] == 15 / [3] == 20 / [4] == 30 / [5] == 40
		System.out.println("numbers.addFirst(5); -> " + numbers);
	}

}