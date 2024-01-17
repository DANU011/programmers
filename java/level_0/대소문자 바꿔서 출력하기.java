import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i<a.length(); i++){
            char c = a.charAt(i); 
              // charAt(i) 메서드는 문자열에서 지정된 인덱스(i)에 위치한 문자를 반환하는 메서드
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }else{
                answer += Character.toUpperCase(c);
            }
        }
       System.out.println(answer);
    }
}
