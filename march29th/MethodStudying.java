package march29th;

public class MethodStudying {
   
   //�� ������ �Է¹ް� ������ �޼ҵ� �ۼ��ϱ�(�и�� 0�� �Էµ� ���� else������ �ۼ��Ѵ�.)
	void divide(int num1, int num2) {
		double result = 0.0;
		if(num2 != 0) {
			
			/**
			 * String.format() �޼ҵ� ����
			 */
			// ��� 1 : https://blog.jiniworld.me/68
			result = Double.parseDouble(String.format("%.3f", (double)num1/num2)); //���� �ȵǴ� �κ� (1)
				// Double.parseDouble() : Double�� static �޼ҵ��� parseDouble �޼ҵ�� double ������ �ƴ� ���� double �������� ��ȯ
				// String.format() : String�� static �޼ҵ��� format �޼ҵ�� ���ڿ��� ������ �����ϴ� �޼ҵ�
			// 
			
			System.out.println(result);
			
			/**
			 * printf() �޼ҵ� ����
			 */
			// ��� 2 : https://keep-cool.tistory.com/15
			System.out.printf("%.3f\n", (double)num1/num2);
			System.out.printf("%.3f\n", (double)(num1/num2));
			System.out.printf("%.3f\n", num1/(double)num2);
			System.out.printf("%.3f\n", (double)num1/(double)num2);
				// 1. (double)num1/num2 => 
				// 2. (double)(num1/num2)
				// 3. num1/(double)num2
				// 4. (double)num1/(double)num2
         
		} else{
			System.out.println("0���� ū ���� �Է��ϼ���.");
		}
	}
      
	//������ �Է¹ް� �ѱ۷� �ٲٴ� �޼ҵ� �ۼ��ϱ� (ex. 4->��, 1024->�ϰ��̻�)
	void changeToHangle(String data) {
	  String hangle = "�����̻�����ĥ�ȱ�";
	  String result = "";
	  
	  // String���� �Ǿ� �ִ� data�� Integer�� ��ȯ
	  int num = Integer.parseInt(data); 
	  
	  for (int i = 0; i<data.length(); i++) {
		  
		  /**
		   * charAt() �޼ҵ� ����
		   */
		  // charAt() : https://crazykim2.tistory.com/412
		  result += hangle.charAt(num % 10);
		  	// charAt() �޼ҵ� : String�� ��ġ�� �Ű������� �޾� �ش� ��ġ�� char�� ��ȯ
		  		// EX) char a = hangle.charAt(num % 10);
		  
		  /**
		   * �������
		   */
		  // System.out.println("num % 10 = "+num % 10);
		  num /= 10;
		  // System.out.println("num = "+num);
			  // num % 10 => num�� �ڸ��� ǥ��
			  // % : ������ ������
			  // if) num = 123�̸�
				// 123 % 10 = 3		---------------------
				// 123 / 10 = 12
				// 12 % 10 = 2		---------------------
				// 12 / 10 = 1
				// 1 % 10 = 1		---------------------
				// 1 / 10 = 0
		  		// => 123 �Է� �� ������ ������ result = 321 <-- �ѱ۷� ��ȯ�Ͽ� �����ϱ� ������ ���⼭�� �����Ϸ� �����
	  }
	  
	  // �ڿ������� �ݺ��Ͽ� ���
	  for(int i = data.length()-1; i>-1; i--) {
		  System.out.print(result.charAt(i));
	  }
	}
      
	public static void main(String[] args) {
		MethodStudying m = new MethodStudying(); // MethodStudying�̶�� Ŭ������ m ��ü ����
		m.divide(5,3);
		m.changeToHangle("123");
	}

}


class Main{
	
}