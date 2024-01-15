package level_0;

public class 특정문자제거하기_replace {
	static class Solution {
	    public static String solution(String my_string, String letter) {
	        String answer = "";
	        answer = my_string.replace(letter, "");
	        return answer;
	    }
	}
	
/*Java에서 문자열을 다른 문자열로 교체하기 위해 replace() 메서드를 사용할 수 
있습니다. replace() 메서드는 기존 문자열의 모든 발생을 새 문자열로 교체합니다. 
메서드는 두 개의 매개변수를 받습니다. 첫 번째 매개변수는 교체 대상 문자열입니다. 
두 번째 매개변수는 교체될 문자열입니다. 예를 들어, 다음과 같은 코드를 사용하여 문자열
"Hello, world!"에서 "Hello"를 "Hi"로 교체할 수 있습니다.

---code---
String originalString = "Hello, world!";
String newString = originalString.replace("Hello", "Hi");
System.out.println(newString);
위 코드를 실행하면 출력 결과로 "Hi, world!"이 출력됩니다.
----------

replace() 메서드는 대소문자를 구분하며, 대소문자를 구분하지 않는 교체를 수행하려면 
replaceAll() 메서드를 사용해야 합니다. replaceAll() 메서드는 정규식 패턴을 
사용하여 문자열을 교체할 수 있습니다. 예를 들어, 대소문자를 구분하지 않고 "Hello"를 
"Hi"로 교체하려면 다음과 같이 코드를 작성할 수 있습니다.

---code---
String originalString = "Hello, world!";
String newString = originalString.replaceAll("(?i)Hello", "Hi");
System.out.println(newString);
위 코드를 실행하면 출력 결과로 "Hi, world!"이 출력됩니다. 
(?i)는 대소문자를 구분하지 않도록 지정하는 정규식 표현입니다.
----------*/
	
	
	public static void main(String[] args) {
		String my_string="abcdef";
		String letter="f";
		String answer=Solution.solution(my_string,letter);
		System.out.println(answer);

	}

}
