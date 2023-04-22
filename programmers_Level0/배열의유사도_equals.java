package level_0;

public class 배열의유사도_equals {
	static class Solution {
		public static int solution(String[] s1, String[] s2) {
			int answer = 0;
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					if (s1[i].equals(s2[j])) {
						/*equals() 메소드를 사용하여 문자열이 동일한지를 
						 * 확인 Java에서는 == 연산자를 사용하여 두 개의 
						 * 문자열을 비교할 때, 두 문자열이
						 * 정확히 같은 객체인 경우에만 true를 반환*/
						answer++;
						break;
		/*break 문을 사용하여, s1 배열의 각 문자열이 s2 배열의 모든 문자열과 
		 * 비교할 때, 이미 같은 문자열이 발견되었다면 더 이상
		 * 비교하지 않고 다음 문자열로 넘어가는 것을 의미 이중 반복문에서는 
		 * 내부 반복문의 실행이 완료될 때까지 외부 반복문이 종료되지 않음.
		 * 따라서, 내부 반복문에서 break 문을 사용하여 종료시키면, 
		 * 외부 반복문에서 다음 반복을 실행할 수 있다. 내부 반복문에서 문자열이
		 * 일치하는 경우 break 문을 사용하여 반복문을 종료시키고, 
		 * 외부 반복문에서 다음 문자열을 비교할 수 있도록 한다. 이렇게 하면, 같은
		 * 문자열을 찾았을 때 불필요한 반복을 줄일 수 있어서 실행 속도를 높일 수 있다.*/
					}
				}
			}
			return answer;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] s1 = { "a", "b", "c" };
			String[] s2 = { "com", "b", "d", "p", "c" };
			int answer = Solution.solution(s1, s2);
			System.out.println(answer);
		}

	}
}
