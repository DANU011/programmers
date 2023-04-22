package level_0;

public class 주사위의개수 {
	static class Solution {
		public static int solution(int[] box, int n) {
			int answer = 0;
/*box[0] = 상자의 가로 길이
box[1] = 상자의 세로 길이
box[2] = 상자의 높이 길이*/
			int w = box[0]/n;
			int d = box[1]/n;
			int h = box[2]/n;
			answer = w*d*h;
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] box = {10, 8, 6};
		int n = 3;
		int answer = Solution.solution(box, n);
		System.out.println(answer);

	}

}
