package level_0;

import java.util.Arrays;

public class �ִ񰪸����_1_sort {
	static class Solution {
    public static int solution(int[] numbers) {
    	int answer=0;
        Arrays.sort(numbers); // �迭 ������������ ����(������~ū��)
        answer = numbers[numbers.length-2]*numbers[numbers.length-1];
        return answer;
        //������ �迭�� ������ �� ���ڿ� ������ ���� ��
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {13,465,7897,456,45,465};
		int answer=Solution.solution(numbers);
		System.out.println(answer);
		
	}

}
