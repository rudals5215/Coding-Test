// 등차수열의 특정한 항만 더하기
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += a;
                a += d;
            } else {
                a += d;
            }
        }
        return answer;
    }
}

// 다른사람 풀이
import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }
}