package level_0;

public class 짝수는싫어요_삼항연산 {
	static class Solution {
		public static int[] solution(int n) {
			int n2 = n % 2 == 0 ? n / 2 : n / 2 + 1;
			// n이 짝수인 경우와 홀수인 경우를 구분하여 n2 변수 초기화
			int[] answer = new int[n2]; // 배열 크기를 n2로 초기화
			for (int i = 0; i < n2; i++) {
				answer[i] = 2 * i + 1;
				// 1부터 n까지의 홀수를 차례대로 저장
			}

			return answer;
		}
	}
/* if 조건문은 조건식의 결과에 따라 실행할 코드를 선택할 때 사용. 
따라서, n2 변수를 초기화할 때 삼항 연산자 ?:를 사용하여 n이 짝수인 경우와 
홀수인 경우를 구분할 수 있다. int 자료형이므로 .length 속성을 사용할 수 없다.
answer 배열을 초기화할 때 배열 크기를 정의해줘야한다. 
for 루프에서는 int[i]와 같이 배열의 이름과 인덱스를 함께 사용하여 원소를 참조하려고 
했다. 이는 잘못된 문법이며, answer[i]와 같이 배열 이름과 인덱스를 함께 사용하여 원소를 
참조해야 한다. for 루프에서 인덱스를 갱신할 때 2*i+1을 사용하여 홀수 인덱스를 참조하려고 
했지만, 이는 잘못된 문법이다. 올바른 문법은 i++ 또는 i += 1과 같이 사용하여 인덱스를 
증가시켜야 한다.solution 메소드에서는 주어진 수 n에 따라 1부터 n까지의 홀수를 차례대로 
저장한 배열 answer를 반환하도록 코드를 수정할 수 있다.*/

	public static void main(String[] args) {
		int n = 7; // 1,3,5,7
		int[] answer = Solution.solution(n);
		System.out.print("{ ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println("}");
	}
}