package level_0;

import java.util.ArrayList;
import java.util.Arrays;

public class n�ǹ������_arrayList_stream_mapToInt_toArray {
	static class Solution {
	    public static int[] solution(int n, int[] numlist) {
	    	ArrayList<Integer> arrayList = new ArrayList<>();
/*ArrayList Ŭ������ �̿��Ͽ� numlist���� n�� ����� ���ڵ鸸�� �����Ͽ� 
 * ���ο� ����Ʈ�� arrayList�� �߰�*/
	        for (int num : numlist) {
	            if (num % n == 0) {
	                arrayList.add(num);
	            }
	        }
	    	int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
/*arrayList�� ��ҵ��� stream() �޼��带 �̿��Ͽ� mapToInt() �޼���� 
 * int�� �迭�� ��ȯ�� ��, toArray() �޼���� �迭 answer�� �Ҵ�*/
/*mapToInt() �޼���� ��Ʈ������ int�� ������ ��ȯ�ϴµ� ��� 
 �� �޼���� ��Ʈ���� �� ��Ҹ� ���ڷ� ���޹��� �Լ��� �����Ͽ� int�� ������ ��ȯ 
 �׸��� IntStream �ν��Ͻ��� ��ȯ*/
/*toArray() �޼���� Stream �������̽����� �����ϴ� �޼���
��Ʈ������ ��Ҹ� �迭�� ��ȯ�ϴµ� ���. ��Ʈ���� ��� ��Ҹ� �����ϴ� �迭�� ��ȯ*/
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] answer = Solution.solution(n, null);
		System.out.println(Arrays.toString(answer));

	}

}
