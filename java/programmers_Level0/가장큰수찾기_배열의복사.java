package level_0;

import java.util.Arrays;

public class 가장큰수찾기_배열의복사 {
	static class Solution {
	    public static int[] solution(int[] array) {
	        int[] answer = new int[2];
	        int[] rep = new int[array.length];
//	        rep = array;
/*arr1 = arr2 형태로 배열을 할당하면 arr1 변수가 arr2 변수가 가리키는 배열을 
 참조하게 된다. 즉, arr1과 arr2는 같은 배열을 가리키게 된다. 이러한 배열 할당 방식은 
 배열이 복사되는 것이 아니므로, arr1의 값을 바꾸면 arr2의 값도 같이 바뀌게 된다.*/
	        for(int i=0; i<array.length; i++) {
	        	rep[i]=array[i];
	        }
	        Arrays.sort(rep);
	        answer[0]=rep[rep.length-1];
	        for(int i=0; i<array.length; i++) {
	        	if(answer[0]==array[i]) { 
	        		answer[1]=i; 
	        		break;}//break 위치 확인
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
