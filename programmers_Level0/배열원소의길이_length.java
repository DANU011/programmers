package level_0;

public class �迭�����Ǳ���_length {
	static class Solution {
	    public  static int[] solution(String[] strlist) {
	        int[] answer = new int[strlist.length];
	        int len = strlist.length;
	        for (int i = 0; i < len; i++) {
	            answer[i] = strlist[i].length();
/* �־��� ���ڿ� �迭 strlist�� �� ������ ���̸� ����Ͽ� ���ο� �迭 
answer�� �����ϴ� �Լ��� �ۼ��� ��.
answer �迭�� strlist �迭�� ���̿� �����ϰ� ����.
for ������ ���� strlist �迭�� �� ���Ҹ� ���ʴ�� ����.
strlist[i]�� i��° ���Ҹ� ��Ÿ����, len() �޼ҵ�� �ش� ���ڿ��� ���̸� ��ȯ.
���� answer[i]���� strlist[i]�� ���̰� ����Ǿ�� ��.
��� ������ ���̸� ����ϰ� ������ answer �迭�� ��ȯ.*/
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
	        /*main �޼ҵ忡�� Solution.solution �޼ҵ带 ȣ���� ��, 
	         * ��ȯ�� �迭�� ����� �� �ֵ��� ���� (for ���� Ȱ��)*/
		}
	}
}
