package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		//주석
		/*
		 * 메모, 필기 할 수 있는 공간 / 소스코드 잠시 감추기 
		 * 
		 * 1. 문제
		 * name1, name2, name3 
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 */
		
		char name1 = '이';
		char name2 = '동';
		char name3 = '영';
		int age = 33;
		String phone = "010-0000-0000";
		String address = "부산 서구 구덕로";
		
		System.out.print("이름: ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		System.out.print("나이: ");
		System.out.println(age);
		System.out.println("나이: " + age);
		
		System.out.print("연락처: ");
		System.out.println(phone);
		
		System.out.print("주소: ");
		System.out.println(address);
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		
		System.out.println("세수의 합: " + (10 + 20 + 30));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
