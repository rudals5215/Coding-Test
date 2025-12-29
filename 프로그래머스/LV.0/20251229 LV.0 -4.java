// 원소들의 곱과 합
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int product = 1;
        int squareSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            product *= num_list[i];
            sum += num_list[i];
          }

        squareSum += (int)Math.pow(sum, 2);

        if (product < squareSum) {
            answer = 1;
        }
        return answer;
    }
}

// 오답 노트
// 곱 누적은 반드시 1부터 시작, 0부터 하면 무조건 0
// 합의 제곱(squareSum)은 반복문 밖에서 한 번만 계산

// 다른 사람 풀이
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int sum  = 0;
        int mult = 1;

        for(int i : num_list) {
            sum += i;
            mult *= i;
        }

        answer = Math.pow(sum,2) > mult ? 1 : 0;

        return answer;
    }
}

// 다른 사람 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] numList) {
        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
    }
}