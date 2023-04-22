package level_0;

public class 옷가게할인받기_단순연산 {
	static class Solution {
	    public static int solution(int price) {
	        int answer = 0;
	        if(price >= 100000 &&  price < 300000 ) answer = (int)(price-price*0.05);
	        else if(price >= 300000 && price < 500000) answer=(int)(price-price*0.1);
	        else if(price >= 500000) answer=(int) (price-price*0.2);
	        else answer=price;
	        return answer;
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 580000;
		int answer=Solution.solution(price);
		System.out.println(answer);
	}

}
