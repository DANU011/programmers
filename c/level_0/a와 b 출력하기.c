#include <stdio.h>

int main(void) {
    // 정수형 변수 a와 b를 선언
    int a;
    int b;
    // 사용자로부터 두 정수를 입력받아 변수 a와 b에 저장
    scanf("%d %d", &a, &b);
    // 입력받은 두 정수를 포함한 문자열을 출력
    printf("a = %d\nb = %d", a, b);
    // 프로그램 종료를 나타내는 0을 반환
    return 0;
}
