package level_0;

import java.util.Arrays;

public class ���ڿ������ϱ�_1_IntegerParseInt_sort_replace {
	static class Solution {
	    public static int[] solution(String my_string) {
	        int[] answer = {};
	        String replace="";
	        replace=my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]","");
	        String[] str = replace.split("");
	        int[] intstr = new int[str.length];
	        for (int i = 0; i < str.length; i++) {
	            intstr[i] = Integer.parseInt(str[i]); //���� �迭 > ���� �迭
	        }
	        Arrays.sort(intstr);
	        answer=intstr;
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "hi12392";
		int[] answer = Solution.solution(my_string);
		System.out.println(Arrays.toString(answer));

	}

}
