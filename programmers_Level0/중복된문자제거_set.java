package level_0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� �ߺ��� ���ڸ� �����ϰ� 
�ϳ��� ���ڸ� ���� ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���. 
 */
public class �ߺ��ȹ�������_set {
	static class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        String[] arr = my_string.split("");
//	        //�迭�� LinkedHashSet���� ��ȯ�մϴ�.
//	        LinkedHashSet<String> linkedHashSet = 
//	          new LinkedHashSet<>( Arrays.asList(strArray) );
//
//	        //LinkedHashSet�� �迭�� ��ȯ�d�ϴ�.
//	        String[] strArrayWithoutDuplicates = 
//	          linkedHashSet.toArray(new String[] {});
	        Set<String> set = new LinkedHashSet<String>(Arrays.asList(arr));
	        String[] setarr = set.toArray(new String[] {});
	        answer = String.join("",setarr);
	        return answer;
	    }
	}

	public static void main(String[] args) {
		String my_string = "people";
		Solution sol = new Solution();
		String answer = sol.solution(my_string);
		System.out.println(answer);

	}

}
