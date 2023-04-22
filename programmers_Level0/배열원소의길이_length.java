package level_0;

public class 배열원소의길이_length {
	static class Solution {
	    public  static int[] solution(String[] strlist) {
	        int[] answer = new int[strlist.length];
	        int len = strlist.length;
	        for (int i = 0; i < len; i++) {
	            answer[i] = strlist[i].length();
/* 주어진 문자열 배열 strlist의 각 원소의 길이를 계산하여 새로운 배열 
answer에 저장하는 함수를 작성한 것.
answer 배열을 strlist 배열의 길이와 동일하게 생성.
for 루프를 통해 strlist 배열의 각 원소를 차례대로 접근.
strlist[i]는 i번째 원소를 나타내며, len() 메소드는 해당 문자열의 길이를 반환.
따라서 answer[i]에는 strlist[i]의 길이가 저장되어야 함.
모든 원소의 길이를 계산하고 저장한 answer 배열을 반환.*/
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strlist= {"ade","ro","leld"};
		int[] answer = Solution.solution(strlist);
		for (int i = 0; i < answer.length; i++) {
	        System.out.println(answer[i]);
	        /*main 메소드에서 Solution.solution 메소드를 호출한 후, 
	         * 반환된 배열을 출력할 수 있도록 변경 (for 루프 활용)*/
		}
	}
}
