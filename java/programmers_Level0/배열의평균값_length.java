package level_0;

public class 배열의평균값_length {
	
	public static double solution(int[] numbers) {
	    double answer = 0;
	    for(int i = 0; i < numbers.length; i++){
	        answer += numbers[i];
	    }
	    answer /= numbers.length;
	    return answer;
	}

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		double result = solution(n);
        System.out.println(result);
	}

}


/*Java에서 배열을 변수로 선언하는 방법
1.배열 변수 선언하기 : 데이터타입[] 배열변수이름;
2.배열 객체 생성하기 : 배열변수이름 = new 데이터타입[배열크기];
3.배열 객체 생성과 동시에 초기화하기 : 데이터타입[] 배열변수이름 = {요소1, 요소2, ..., 요소N};
위의 예시에서, 데이터타입은 배열에 저장될 요소의 데이터 타입. 
배열 변수의 이름은 개발자가 마음대로 정할 수 있음.
배열의 요소는 인덱스로 접근할 수 있으며, 첫 번째 요소의 인덱스는 0부터 시작.

ex

int[] numbers;  // 배열 변수 선언하기
numbers = new int[5];  // 배열 객체 생성하기
numbers[0] = 1;  // 배열의 첫 번째 요소에 값 할당하기
int[] numbers2 = {1, 2, 3, 4, 5};  // 배열 객체 생성과 동시에 초기화하기
위의 예시에서는 numbers 배열 변수를 먼저 선언하고, new 키워드를 사용하여 배열 객체를 생성함. 
그리고 numbers[0]의 값을 1로 할당하여 배열의 첫 번째 요소에 값을 넣음. 
또한, numbers2 배열 변수를 선언하고, 배열 객체를 생성하면서 동시에 초기화함. 
이 경우, 배열의 크기는 자동으로 요소의 개수로 지정됨.*/




