package level_0;

public class �ڸ������ϱ�_while {
	static class Solution {
	    public static int solution(int n) {
	        int answer = 0;
	    	while (n > 0) {
				answer += n % 10; // ���� �ڸ����� �ڸ��� ���ϱ�
				n /= 10;
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 930211;
		int answer = Solution.solution(n);
		System.out.println(answer);

	}

}
