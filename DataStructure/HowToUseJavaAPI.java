package arraylist;
/**
 *  JavaAPI - ArrayList ���� �н� ����
 */
// ArrayList�� ����ϱ� ���ؼ� java.util�� import�ؾ� �Ѵ�.
import java.util.ArrayList;
import java.util.Iterator;

public class HowToUseJavaAPI {
	
	public static void main(String[] args) {
		// ���ʸ� ����� �ʿ��մϴ�.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// ������ �߰� , ArrayList.add(value) �޼ҵ带 ����Ͽ� ������ index�� �ڿ� �����͸� �߰��մϴ�.
		numbers.add(10);	// numbers[0] = 10 
		numbers.add(20);	// numbers[1] = 20
		numbers.add(30);	// numbers[2] = 30
		numbers.add(40);	// numbers[3] = 40
		System.out.println("add(��)");
		System.out.println(numbers);
				
		// ������ ����, ArrayList.add(index, value) �޼ҵ带 ����Ͽ� �ش� �ε����� ���� �����մϴ�.
		// (�ش� �ε��� ~ ������ �ε����� ���� value���� �ε����� �ϳ��� �ڷ� �и��ϴ�.)
		numbers.add(1,50);	// numbers[1] = 50
		// numbers = [10, 50, 20, 30, 40]
		System.out.println("\ndaa(�ε���, ��)");
		System.out.println(numbers);
		
		// ������ ����, ArrayList.remove(index) �޼ҵ带 ����Ͽ� �ش� �ε����� value�� �����մϴ�.
		// (�ش� �ε��� ~ ������ �ε����� ���� value���� �ε����� �ϳ��� ������ ������ϴ�.)
		numbers.remove(2);
		// numbers = [10, 50, 30, 40]
        System.out.println("\nremove(�ε���)");
        System.out.println(numbers);
        
        // ������ ��������, ArrayList.get(index) �޼ҵ带 ����Ͽ� �ش� �ε����� value�� �����մϴ�.
        System.out.println("\nget(�ε���)");
        System.out.println(numbers.get(2));		// 50
        
        // �������� ������ ��������, ArrayList.size() �޼ҵ带 ����Ͽ� �ش� ArrayList�� ũ�⸦ �����մϴ�.
        System.out.println("\nsize()");
        System.out.println(numbers.size());		// 4
        
        // �����͸� ����ô���� ��������(iteration)
        System.out.println("\ninterator");
        // ArrayList.iterator() �޼ҵ带 ����Ͽ� numbers�� ��Ҹ� Iterator �ڷ����� �����մϴ�.
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
        	// Iterator.next() �޼ҵ带 ���� ��ȯ�Ǵ� ���� Object Ÿ���Դϴ�.
        	// Object Ÿ���� int Ÿ�Կ� �����ϱ� ���ؼ� '(int)'�� �ٿ��ɽ��� �մϴ�.
        	int value = (int)it.next();
        	if(value == 30) {
        		it.remove();
        	}
        	System.out.println(value);
        }
		
        System.out.println("\nfor each");
        // for each���� numbers ��ü�� ��� �� ��ŭ �ݺ��˴ϴ�.
        // for each���� �����ʾ� �ݺ��� ������ numbers ��ü�� ù ��Һ��� �� ��ұ��� �� ���� ����������
        // int ������ ���Ե˴ϴ�.
        for(int value : numbers) {
        	System.out.println(value);
        }
        
        System.out.println("\nfor");
        for(int i = 0; i < numbers.size(); i++) {
        	System.out.println(numbers.get(i));
        }
        
        
        
	}
}
