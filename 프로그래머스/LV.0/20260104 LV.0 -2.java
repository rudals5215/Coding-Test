// 수 조작하기 1
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                answer += 1;
            } else if (control.charAt(i) == 's') {
                answer -= 1;
            } else if (control.charAt(i) == 'd') {
                answer += 10;
            } else if (control.charAt(i) == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}

// 오답노트
// 1️⃣ 누적 계산 문제에서 시작값을 0으로 두면 입력값(n)이 완전히 무시된다. → “출발점이 있는 문제면 answer = n부터 시작”

// 다른 사람 풀이
// switch 문 사용
class Solution {
    public int solution(int n, String control) {
        int answer = n;

        for(char ch : control.toCharArray()) {
            switch(ch) {
                case 'w': answer += 1; break;
                case 's': answer -= 1; break;
                case 'd': answer += 10; break;
                case 'a': answer -= 10; break;
                default:break;
            }
        }

        return answer;
    }
}