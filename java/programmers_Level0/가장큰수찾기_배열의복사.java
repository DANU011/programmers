package level_0;

import java.util.Arrays;

public class ����ū��ã��_�迭�Ǻ��� {
	static class Solution {
	    public static int[] solution(int[] array) {
	        int[] answer = new int[2];
	        int[] rep = new int[array.length];
//	        rep = array;
/*arr1 = arr2 ���·� �迭�� �Ҵ��ϸ� arr1 ������ arr2 ������ ����Ű�� �迭�� 
 �����ϰ� �ȴ�. ��, arr1�� arr2�� ���� �迭�� ����Ű�� �ȴ�. �̷��� �迭 �Ҵ� ����� 
 �迭�� ����Ǵ� ���� �ƴϹǷ�, arr1�� ���� �ٲٸ� arr2�� ���� ���� �ٲ�� �ȴ�.*/
	        for(int i=0; i<array.length; i++) {
	        	rep[i]=array[i];
	        }
	        Arrays.sort(rep);
	        answer[0]=rep[rep.length-1];
	        for(int i=0; i<array.length; i++) {
	        	if(answer[0]==array[i]) { 
	        		answer[1]=i; 
	        		break;}//break ��ġ Ȯ��
	        	}
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9, 10, 11, 8};
		int[] answer = Solution.solution(array);
		System.out.println(Arrays.toString(answer));

	}

}
