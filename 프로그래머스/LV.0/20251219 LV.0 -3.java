// 홀짝에 따라 다른 값 반환하기
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 != 0) {
            for (int i = 0; i <= n;i+=2) {
                answer += (i+1);
            }    
        }
        else {
            for (int i = 0; i <= n;i+=2) {
            answer += (i*i);
            }
        }
        return answer;
    }
}

// 오답노트
// (i^2)는 제곱이 아님 -> (i*i)가 맞음

// 다른사람 풀이
// 삼항 연산자
class Solution {
    public int solution(int n) {
        int answer = 0;

            for(int i = n; i >= 0; i -= 2)
                answer += (n % 2 == 0) ? i * i : i;

        return answer;
    }
}
