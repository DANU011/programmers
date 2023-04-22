package level_0;

public class 배열뒤집기_length {
	static class Solution{
		public static int[] solution(int[] num_list) {
			int[] answer = {};
			answer = new int[num_list.length];
			for (int i = 0; i < num_list.length; i++) {
				answer[i] = num_list[(num_list.length) - i - 1];
				/*
				 * answer[i] = num_list[num_list.length - i - 1]; 
				 * 부분은 입력된 num_list 배열을 뒤집어서
				 * answer 배열에 저장하는 코드. 우선, num_list.length는 
				 * 배열 num_list의 길이 i는 0부터 시작하여
				 * num_list.length-1까지 반복 answer 배열도 num_list 배열과 같은 크기를 갖도록 
				 * 초기화되며, 이후 i번째 num_list 원소를 answer 배열의 
				 * (num_list.length - i - 1)번째 위치에 저장.
				 */
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		int[] num_list = { 1, 5, 6, 7 };
		int[] answer = Solution.solution(num_list);
		for (int i = 0; i < answer.length; i++) {
		System.out.print(answer[i] + " ");
		}
	}
}

/*
 * 코드에서 문제가 발생하는 부분은 main 메소드 main 메소드에서는 Solution 클래스의 
 * solution 메소드를 호출하여 결과를 반환하는 것이 필요. 현재 코드에서는 
 * solution 메소드를 호출하지 않고 있으므로, 결과가 올바르게 반환되지 않고 있음. 
 * 따라서, main 메소드를 수정하여 solution 메소드를 호출하도록 변경해야 함. 
 * 또한, int[] answer 배열을 생성하여 초기화하고,
 * 이를 solution 배열에 대입하는 것은 올바르지 않음. 
 * 이는 answer 배열의 값을 solution 배열에 복사하는 것이므로,
 * answer 배열을 따로 생성하지 않아도 됨. 수정된 코드에서는 
 * main 메소드에서 int[] num_list 배열을 생성하여 초기화하고,
 * 이를 Solution 클래스의 solution 메소드에 전달하여 결과를 반환. 
 * 반환된 결과는 reversed_list 배열에 저장. 이후,
 * for 문을 사용하여 reversed_list 배열의 모든 값을 출력하도록 함.
 */
