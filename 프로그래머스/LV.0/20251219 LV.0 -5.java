// flag에 따라 다른 값 반환하기
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) {
            answer += (a + b);
        }
        else {
            answer += (a - b);
        }
        return answer;
    }
}

// 다른 사람 풀이
// 삼항 연산자
class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}