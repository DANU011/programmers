package level_0;

public class �ֻ����ǰ��� {
	static class Solution {
		public static int solution(int[] box, int n) {
			int answer = 0;
/*box[0] = ������ ���� ����
box[1] = ������ ���� ����
box[2] = ������ ���� ����*/
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
