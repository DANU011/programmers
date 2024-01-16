#include <stdio.h>
//제한사항인 str의 길이 제한
#define LEN_INPUT 11

int main(void) {
	//문자 배열 s1 선언
    char s1[LEN_INPUT];
    //정수 a선언
    int a;
    //문자와 정수를 입력 받음
    scanf("%s %d", s1, &a);
    //입력받은 정수만큼 문자열을 반복
    for(int i = 0; i < a; i++) {
        printf(s1);
	//반복한 문자열을 화면에 출력
    }
    return 0;
}
