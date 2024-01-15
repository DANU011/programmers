package level_0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 
하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요. 
 */
public class 중복된문자제거_set {
	static class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        String[] arr = my_string.split("");
//	        //배열을 LinkedHashSet으로 변환합니다.
//	        LinkedHashSet<String> linkedHashSet = 
//	          new LinkedHashSet<>( Arrays.asList(strArray) );
//
//	        //LinkedHashSet을 배열로 변환홥니다.
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
