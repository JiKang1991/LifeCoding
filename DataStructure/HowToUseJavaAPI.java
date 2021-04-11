package arraylist;
/**
 *  JavaAPI - ArrayList 사용법 학습 예제
 */
// ArrayList를 사용하기 위해서 java.util을 import해야 한다.
import java.util.ArrayList;
import java.util.Iterator;

public class HowToUseJavaAPI {
	
	public static void main(String[] args) {
		// 제너릭 사용이 필요합니다.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// 데이터 추가 , ArrayList.add(value) 메소드를 사용하여 마지막 index의 뒤에 데이터를 추가합니다.
		numbers.add(10);	// numbers[0] = 10 
		numbers.add(20);	// numbers[1] = 20
		numbers.add(30);	// numbers[2] = 30
		numbers.add(40);	// numbers[3] = 40
		System.out.println("add(값)");
		System.out.println(numbers);
				
		// 데이터 대입, ArrayList.add(index, value) 메소드를 사용하여 해당 인덱스에 값을 대입합니다.
		// (해당 인덱스 ~ 마지막 인덱스의 기존 value들은 인덱스가 하나씩 뒤로 밀립니다.)
		numbers.add(1,50);	// numbers[1] = 50
		// numbers = [10, 50, 20, 30, 40]
		System.out.println("\ndaa(인덱스, 값)");
		System.out.println(numbers);
		
		// 데이터 삭제, ArrayList.remove(index) 메소드를 사용하여 해당 인덱스의 value를 삭제합니다.
		// (해당 인덱스 ~ 마지막 인덱스의 기존 value들은 인덱스가 하나씩 앞으로 당겨집니다.)
		numbers.remove(2);
		// numbers = [10, 50, 30, 40]
        System.out.println("\nremove(인덱스)");
        System.out.println(numbers);
        
        // 데이터 가져오기, ArrayList.get(index) 메소드를 사용하여 해당 인덱스의 value를 리턴합니다.
        System.out.println("\nget(인덱스)");
        System.out.println(numbers.get(2));		// 50
        
        // 데이터의 사이즈 가져오기, ArrayList.size() 메소드를 사용하여 해당 ArrayList의 크기를 리턴합니다.
        System.out.println("\nsize()");
        System.out.println(numbers.size());		// 4
        
        // 데이터를 순자척으로 가져오기(iteration)
        System.out.println("\ninterator");
        // ArrayList.iterator() 메소드를 사용하여 numbers의 요소를 Iterator 자료형에 대입합니다.
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
        	// Iterator.next() 메소드를 통해 반환되는 값은 Object 타입입니다.
        	// Object 타입을 int 타입에 대입하기 위해서 '(int)'로 다운케스팅 합니다.
        	int value = (int)it.next();
        	if(value == 30) {
        		it.remove();
        	}
        	System.out.println(value);
        }
		
        System.out.println("\nfor each");
        // for each문은 numbers 객체의 요소 수 만큼 반복됩니다.
        // for each문이 한차례씩 반복될 때마다 numbers 객체의 첫 요소부터 끝 요소까지 한 개씩 순차적으로
        // int 변수에 대입됩니다.
        for(int value : numbers) {
        	System.out.println(value);
        }
        
        System.out.println("\nfor");
        for(int i = 0; i < numbers.size(); i++) {
        	System.out.println(numbers.get(i));
        }
        
        
        
	}
}
