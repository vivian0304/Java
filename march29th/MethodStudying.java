package march29th;

public class MethodStudying {
   
   //두 정수를 입력받고 나누는 메소드 작성하기(분모로 0이 입력될 경우는 else문으로 작성한다.)
	void divide(int num1, int num2) {
		double result = 0.0;
		if(num2 != 0) {
			
			/**
			 * String.format() 메소드 사용법
			 */
			// 방법 1 : https://blog.jiniworld.me/68
			result = Double.parseDouble(String.format("%.3f", (double)num1/num2)); //이해 안되는 부분 (1)
				// Double.parseDouble() : Double의 static 메소드인 parseDouble 메소드는 double 형식이 아닌 것을 double 형식으로 변환
				// String.format() : String의 static 메소드인 format 메소드는 문자열의 형식을 설정하는 메소드
			// 
			
			System.out.println(result);
			
			/**
			 * printf() 메소드 사용법
			 */
			// 방법 2 : https://keep-cool.tistory.com/15
			System.out.printf("%.3f\n", (double)num1/num2);
			System.out.printf("%.3f\n", (double)(num1/num2));
			System.out.printf("%.3f\n", num1/(double)num2);
			System.out.printf("%.3f\n", (double)num1/(double)num2);
				// 1. (double)num1/num2 => 
				// 2. (double)(num1/num2)
				// 3. num1/(double)num2
				// 4. (double)num1/(double)num2
         
		} else{
			System.out.println("0보다 큰 수를 입력하세요.");
		}
	}
      
	//정수를 입력받고 한글로 바꾸는 메소드 작성하기 (ex. 4->사, 1024->일공이사)
	void changeToHangle(String data) {
	  String hangle = "공일이삼사오육칠팔구";
	  String result = "";
	  
	  // String으로 되어 있는 data를 Integer로 변환
	  int num = Integer.parseInt(data); 
	  
	  for (int i = 0; i<data.length(); i++) {
		  
		  /**
		   * charAt() 메소드 사용법
		   */
		  // charAt() : https://crazykim2.tistory.com/412
		  result += hangle.charAt(num % 10);
		  	// charAt() 메소드 : String의 위치를 매개변수로 받아 해당 위치를 char로 반환
		  		// EX) char a = hangle.charAt(num % 10);
		  
		  /**
		   * 연산과정
		   */
		  // System.out.println("num % 10 = "+num % 10);
		  num /= 10;
		  // System.out.println("num = "+num);
			  // num % 10 => num의 자릿수 표현
			  // % : 나머지 연산자
			  // if) num = 123이면
				// 123 % 10 = 3		---------------------
				// 123 / 10 = 12
				// 12 % 10 = 2		---------------------
				// 12 / 10 = 1
				// 1 % 10 = 1		---------------------
				// 1 / 10 = 0
		  		// => 123 입력 시 연산이 끝나면 result = 321 <-- 한글로 변환하여 저장하기 때문에 여기서는 삼이일로 저장됨
	  }
	  
	  // 뒤에서부터 반복하여 출력
	  for(int i = data.length()-1; i>-1; i--) {
		  System.out.print(result.charAt(i));
	  }
	}
      
	public static void main(String[] args) {
		MethodStudying m = new MethodStudying(); // MethodStudying이라는 클래스의 m 객체 생성
		m.divide(5,3);
		m.changeToHangle("123");
	}

}


class Main{
	
}