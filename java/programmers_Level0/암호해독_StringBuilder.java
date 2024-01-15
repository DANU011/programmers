package level_0;

public class 암호해독_StringBuilder {
	static class Solution {
	    public static String solution(String cipher, int code) {
	        String answer = "";
	                StringBuilder sb = new StringBuilder();
	                String[] cipherArray = cipher.split("");
	                for (int i = 0; i < cipherArray.length; i++) {
	                    if ((i + 1) % code == 0) sb.append(cipherArray[i]);
	                    answer=sb.toString();
	                }
	                return answer;
	            }
	        }
/*위 코드는 주어진 문자열(cipher)에서 일정한 간격(code)으로 문자를 추출하는 
메소드입니다. 예를 들어, "HelloWorld" 문자열에서 간격 2로 추출하면 
"elWrd" 문자열이 반환됩니다. 설명을 자세히 하면 다음과 같습니다.
StringBuilder sb = new StringBuilder();
: 문자열을 동적으로 추가하고변경할 수 있는 StringBuilder 객체를 생성합니다.
String[] cipherArray = cipher.split("");
: cipher 문자열을 한 글자씩 분리하여 문자열 배열(cipherArray)에 저장합니다.
for (int i = 0; i < cipherArray.length; i++) {
: 문자열 배열(cipherArray)을 반복하여 처리합니다.
if ((i + 1) % code == 0) sb.append(cipherArray[i]);
: 현재 인덱스(i)를 1씩 증가시키면서, 간격(code)으로 나눈 나머지가 0이면
((i+1)%code==0), StringBuilder 객체(sb)에 해당 문자(cipherArray[i])를 
추가합니다.
return sb.toString();
: StringBuilder 객체(sb)를 문자열(String)으로 변환하여 반환합니다.
따라서, 위 코드는 주어진 문자열(cipher)에서 일정한 간격(code)으로 문자를 추출하는 
메소드입니다. 반환된 문자열은 간격(code)으로 나눈 나머지가 0인 문자들로 
이루어진 문자열입니다.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String answer = Solution.solution(cipher, code);
		System.out.println(answer);

	}

}
