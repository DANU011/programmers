package level_0;

public class Ư�����������ϱ�_replace {
	static class Solution {
	    public static String solution(String my_string, String letter) {
	        String answer = "";
	        answer = my_string.replace(letter, "");
	        return answer;
	    }
	}
	
/*Java���� ���ڿ��� �ٸ� ���ڿ��� ��ü�ϱ� ���� replace() �޼��带 ����� �� 
�ֽ��ϴ�. replace() �޼���� ���� ���ڿ��� ��� �߻��� �� ���ڿ��� ��ü�մϴ�. 
�޼���� �� ���� �Ű������� �޽��ϴ�. ù ��° �Ű������� ��ü ��� ���ڿ��Դϴ�. 
�� ��° �Ű������� ��ü�� ���ڿ��Դϴ�. ���� ���, ������ ���� �ڵ带 ����Ͽ� ���ڿ�
"Hello, world!"���� "Hello"�� "Hi"�� ��ü�� �� �ֽ��ϴ�.

---code---
String originalString = "Hello, world!";
String newString = originalString.replace("Hello", "Hi");
System.out.println(newString);
�� �ڵ带 �����ϸ� ��� ����� "Hi, world!"�� ��µ˴ϴ�.
----------

replace() �޼���� ��ҹ��ڸ� �����ϸ�, ��ҹ��ڸ� �������� �ʴ� ��ü�� �����Ϸ��� 
replaceAll() �޼��带 ����ؾ� �մϴ�. replaceAll() �޼���� ���Խ� ������ 
����Ͽ� ���ڿ��� ��ü�� �� �ֽ��ϴ�. ���� ���, ��ҹ��ڸ� �������� �ʰ� "Hello"�� 
"Hi"�� ��ü�Ϸ��� ������ ���� �ڵ带 �ۼ��� �� �ֽ��ϴ�.

---code---
String originalString = "Hello, world!";
String newString = originalString.replaceAll("(?i)Hello", "Hi");
System.out.println(newString);
�� �ڵ带 �����ϸ� ��� ����� "Hi, world!"�� ��µ˴ϴ�. 
(?i)�� ��ҹ��ڸ� �������� �ʵ��� �����ϴ� ���Խ� ǥ���Դϴ�.
----------*/
	
	
	public static void main(String[] args) {
		String my_string="abcdef";
		String letter="f";
		String answer=Solution.solution(my_string,letter);
		System.out.println(answer);

	}

}
