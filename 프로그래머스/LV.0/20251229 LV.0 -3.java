// 주사위 게임 2
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && a != c) {
            answer += (a + b + c);
        }  else if (a == b && a == c) {
            answer += (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if (a == b || a == c || b== c) {
            answer += (a + b + c) * (a*a + b*b + c*c);
        }
        return answer;
    }
}

// 오답노트
// 조건은 세 개 다 같음 → 두 개 같음 → 전부 다름 순서로 검사
// ^는 제곱 아님 (XOR) ❌ → 제곱·세제곱은 직접 곱하기
// 자바 논리연산자는 and/or ❌ → && / || ✅
// 👉 핵심: 조건은 강한 것부터, 제곱은 곱으로 처리.


// 다른 사람 풀이
// Math.pow() 버전
class Solution {
    public int solution(int a, int b, int c) {

        int sum = a + b + c;
        int squareSum =
                (int)Math.pow(a, 2)
              + (int)Math.pow(b, 2)
              + (int)Math.pow(c, 2);

        int cubeSum =
                (int)Math.pow(a, 3)
              + (int)Math.pow(b, 3)
              + (int)Math.pow(c, 3);

        if (a == b && b == c) {
            return sum * squareSum * cubeSum;
        }
        else if (a == b || a == c || b == c) {
            return sum * squareSum;
        }
        else {
            return sum;
        }
    }
}