package level_0;

public class �迭������_length {
	static class Solution{
		public static int[] solution(int[] num_list) {
			int[] answer = {};
			answer = new int[num_list.length];
			for (int i = 0; i < num_list.length; i++) {
				answer[i] = num_list[(num_list.length) - i - 1];
				/*
				 * answer[i] = num_list[num_list.length - i - 1]; 
				 * �κ��� �Էµ� num_list �迭�� �����
				 * answer �迭�� �����ϴ� �ڵ�. �켱, num_list.length�� 
				 * �迭 num_list�� ���� i�� 0���� �����Ͽ�
				 * num_list.length-1���� �ݺ� answer �迭�� num_list �迭�� ���� ũ�⸦ ������ 
				 * �ʱ�ȭ�Ǹ�, ���� i��° num_list ���Ҹ� answer �迭�� 
				 * (num_list.length - i - 1)��° ��ġ�� ����.
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
 * �ڵ忡�� ������ �߻��ϴ� �κ��� main �޼ҵ� main �޼ҵ忡���� Solution Ŭ������ 
 * solution �޼ҵ带 ȣ���Ͽ� ����� ��ȯ�ϴ� ���� �ʿ�. ���� �ڵ忡���� 
 * solution �޼ҵ带 ȣ������ �ʰ� �����Ƿ�, ����� �ùٸ��� ��ȯ���� �ʰ� ����. 
 * ����, main �޼ҵ带 �����Ͽ� solution �޼ҵ带 ȣ���ϵ��� �����ؾ� ��. 
 * ����, int[] answer �迭�� �����Ͽ� �ʱ�ȭ�ϰ�,
 * �̸� solution �迭�� �����ϴ� ���� �ùٸ��� ����. 
 * �̴� answer �迭�� ���� solution �迭�� �����ϴ� ���̹Ƿ�,
 * answer �迭�� ���� �������� �ʾƵ� ��. ������ �ڵ忡���� 
 * main �޼ҵ忡�� int[] num_list �迭�� �����Ͽ� �ʱ�ȭ�ϰ�,
 * �̸� Solution Ŭ������ solution �޼ҵ忡 �����Ͽ� ����� ��ȯ. 
 * ��ȯ�� ����� reversed_list �迭�� ����. ����,
 * for ���� ����Ͽ� reversed_list �迭�� ��� ���� ����ϵ��� ��.
 */
