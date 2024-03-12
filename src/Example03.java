
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 6;
		short s = 2;
		int i = 12;
		long l = 123456789012345L;
		
		char c = 'Y';
		char c2 = 88; //ASCII 코드 
		String sr = "Do you like pizza?";
		
		float f = 12.3456789f;
		double d = 1234567890.123456789; //d는 선택
		
		boolean bool = true; // 소문자로부터 시작
		
		// 출력하기
		System.out.println(str);
		System.out.print(bool);;
		System.out.print(" " + c );
		System.out.println(); //다음 줄로 가기
		System.out.print("Numbers: ");
	    System.out.print("\tByte: " + b);
	    System.out.print("\tShort: " + s);
	    System.out.print("\tInt: " + i);
	    System.out.print("\tLong: " + l);
	    System.out.print("\tFloat: " + f);
	    System.out.print("\tDouble: " + d);
	    //Double: 1.2345678901234567E9
	    
	    System.out.println("\nChar2: " + c2);
	    char c3 = 89;
	    System.out.println("\nChar3: " +c3);

	}

}
