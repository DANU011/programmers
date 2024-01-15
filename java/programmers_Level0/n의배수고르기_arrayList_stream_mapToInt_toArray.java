package level_0;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기_arrayList_stream_mapToInt_toArray {
	static class Solution {
	    public static int[] solution(int n, int[] numlist) {
	    	ArrayList<Integer> arrayList = new ArrayList<>();
/*ArrayList 클래스를 이용하여 numlist에서 n의 배수인 숫자들만을 선택하여 
 * 새로운 리스트인 arrayList에 추가*/
	        for (int num : numlist) {
	            if (num % n == 0) {
	                arrayList.add(num);
	            }
	        }
	    	int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
/*arrayList의 요소들을 stream() 메서드를 이용하여 mapToInt() 메서드로 
 * int형 배열로 변환한 뒤, toArray() 메서드로 배열 answer에 할당*/
/*mapToInt() 메서드는 스트림에서 int형 값으로 변환하는데 사용 
 이 메서드는 스트림의 각 요소를 인자로 전달받은 함수에 적용하여 int형 값으로 변환 
 그리고 IntStream 인스턴스를 반환*/
/*toArray() 메서드는 Stream 인터페이스에서 제공하는 메서드
스트림에서 요소를 배열로 변환하는데 사용. 스트림의 모든 요소를 포함하는 배열을 반환*/
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
