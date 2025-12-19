// 공배수
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        }
        return answer;
    }
}

// 다른사람 풀이
// 삼항 연산자
class Solution {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}