// 조건 문자열
// 나의 답
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (n &&ineq &&eq &&m) {
            answer += 1;
        }
        return answer;
    }
}

// 정답
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m) answer = 1;
        } 
        else if (ineq.equals("<") && eq.equals("!")) {
            if (n < m) answer = 1;
        } 
        else if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m) answer = 1;
        } 
        else if (ineq.equals(">") && eq.equals("!")) {
            if (n > m) answer = 1;
        }

        return answer;
    }
}

// 오답노트
// int && String 이런 비교는 불가능
// 문자열로 연산자를 받고 실제 비교는 n 과 m으로 해야 함
// 문자열 비교는 == ❌ 반드시 .equals() ⭕

// 다른 사람 풀이
// Map 사용
import java.util.Map;
import java.util.function.BiFunction;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }
}

// 삼항 연산자
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0;
    }
}
