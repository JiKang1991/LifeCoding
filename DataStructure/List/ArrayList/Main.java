package list.arraylist.implemation;

public class Main {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		
		//---------------------------------------------------------------------------
		// addLast(value)�� ArrayList��ü�� �������� element�� �߰��ϴ� �޼ҵ��Դϴ�.
		numbers.addLast(10);	// numbers[0] == 10
		numbers.addLast(20);	// numbers[1] == 20
		numbers.addLast(30);	// numbers[2] == 30
		numbers.addLast(40);	// numbers[3] == 40
		
		// [0] == 10 / [1] == 20 / [2] == 30 / [3] == 40
		System.out.println("numbers -> " + numbers);
		
		//---------------------------------------------------------------------------
		// add(index, value)�� ArrayList��ü�� 'index'�� �ش��ϴ� �ε����� ���� element��
		// 'value'�� �ش��ϴ� ���� �����ϴ� �޼ҵ��Դϴ�.
		// ('index'�� �ش��ϴ� �ε����� 'index'���� ū �ε����� ������ �ִ� ������ element����
		// ������ �ε����� 1�� ���� �ε����� ������ �˴ϴ�. ��, �ڷ� �и��Ե˴ϴ�.)
		numbers.add(1, 15);
		
		// [0] == 10 / [1] == 15 / [2] == 20 / [3] == 30 / [4] == 40
		System.out.println("numbers.add(1, 15); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// add(value)�� ArrayList��ü�� 0�� �ε����� ���� element�� ����
		// 'value'���� �����ϴ� �޼ҵ��Դϴ�.(0�� �ε����� element�� �߰��ǹǷ�
		// ������ ��� element����'���� �ε��� + 1'�� �ε��� ���� ������ �˴ϴ�.)
		numbers.addFirst(5);
		
		// [0] == 5 / [1] == 10 / [2] == 15 / [3] == 20 / [4] == 30 / [5] == 40
		System.out.println("numbers.addFirst(5); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// remove(index)�� ArrayList��ü�� 'index'�� �ش��ϴ� �ε����� ���� element��
		// �����ϴ� �޼ҵ��Դϴ�.
		// ('index'���� ū �ε����� ������ �ִ� ������ element���� ������ �ε����� 1�� ��
		// �ε����� ������ �˴ϴ�. ��, ������ ������� �˴ϴ�.)
		System.out.print("return value of numbers.remove(1) = ");
		System.out.println(numbers.remove(1));
		
		// [0] == 5 / [1] == 15 / [2] == 20 / [3] == 30 / [4] == 40 
		System.out.println("numbers.remove(1); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// removeFirst()�� ArrayList��ü�� ù ��° element�� �����ϴ� �޼ҵ��Դϴ�.
		// (��� element���� ������ �ε����� 1�� �� �ε����� ������ �˴ϴ�. ��, ������ ������� �˴ϴ�.)
		System.out.print("return value of numbers.removeFirst() = ");
		System.out.println(numbers.removeFirst());
		
		// [0] == 15 / [1] == 20 / [2] == 30 / [3] == 40 
		System.out.println("numbers.removeFirst(); -> " + numbers);

		//---------------------------------------------------------------------------
		// removeLast()�� ArrayList��ü�� ������ element�� �����ϴ� �޼ҵ��Դϴ�.
		System.out.print("return value of numbers.removeLast() = ");
		System.out.println(numbers.removeLast());
		
		// [0] == 15 / [1] == 20 / [2] == 30 
		System.out.println("numbers.removeLast(); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// get(index)�� ArrayList�� 'index'�� �ش��ϴ� �ε����� ���� element�� �����ϴ� �޼ҵ��Դϴ�.
		System.out.println("numbers.get(1); -> " + numbers.get(0));	// 15
		System.out.println("numbers.get(1); -> " + numbers.get(1));	// 20
		System.out.println("numbers.get(1); -> " + numbers.get(2));	// 30
		
		//---------------------------------------------------------------------------
		// size()�� ArrayList�� element ������ �����ϴ� �޼ҵ� �Դϴ�.
		System.out.println("numbers.size(); -> " + numbers.size());  // 3
		
		//---------------------------------------------------------------------------
		numbers.addFirst(5);
		numbers.add(2, 5);
		numbers.add(4, 5);
		numbers.addLast(5);
		
		// [0] == 5 / [1] == 15 / [2] == 5 / [3] == 20 / [4] == 5 / [5] == 30 / [6] == 5
		System.out.println("numbers -> " + numbers);
		
		
		//---------------------------------------------------------------------------
		// indexOf(value)�� 'value'�� �ش��ϴ� ���� ���� element�� �ε����� �����ϴ� �޼ҵ��Դϴ�.
		System.out.print("numbers.indexOf(5); -> ");
		printArray(numbers.indexOf(5));
				
		System.out.print("numbers.indexOf(60); -> ");
		printArray(numbers.indexOf(60));
		
		
	}
	
	public static void printArray(int[] arr) {
		if(arr.length == 0) {
			System.out.println("null");
		} else {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(", ");
			}
		}
			System.out.println();
		}
	}

}
