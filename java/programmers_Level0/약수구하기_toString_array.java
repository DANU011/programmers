package programmers_Level0;

import java.util.Arrays;
/*
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
n을 i로 나누었을 때 나머지가 0이면 약수
출력할 때 배열의 범위와 순서를 저장 -> index
*/
public class 약수구하기_toString_array {
	static class Solution {
	    public int[] solution(int n) {
	        int[] arr = new int[10000];
	        int index =0;
	       
	        for(int i = 1; i<=n; i++) {
				if(n%i == 0) {
					arr[index] = i;
					index++;
				}
			}
			int[] answer = new int [index];
			for(int i = 0; i<index; i++) {
				if(arr[i] != 0) {
					answer[i] = arr[i];
				}
			}
	        return answer;
	    }
	}
	public static void main(String[] args) {
	int n = 24; // [1, 2, 3, 4, 6, 8, 12, 24]
	Solution s = new Solution();
	int[] answer = s.solution(n);
	System.out.println(Arrays.toString(answer));
	}
}
