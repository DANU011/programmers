package level_0;

import java.util.Arrays;

public class �迭�ڸ���_split {
	static class Solution {
	    public static int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = new int[num2-num1+1];
	        int[] subArr = Arrays.copyOfRange(numbers, num1, num2+1); 
	        //num2�� �ƴϰ� num2+1 > num2 ���� ����
	        answer = subArr; //�����׿� ���������� ���� ����
	        return answer;
	       /*split() �޼ҵ�� �־��� �����ڸ� �������� ���ڿ��� 
	        * �и��Ͽ� ���ڿ� �迭�� ��ȯ�ϴ� �޼ҵ�
	        * ex)String[] strArr = str.split(" ");*/
	            }
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;	
		int num2 = 3;
		int[] answer = Solution.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));
		// �迭 ����� ���� Arrays.toString() ���

	}

}
