// 두 수의 연산값 비교하기
class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int c = 2*a*b;
        
        return Math.max(ab, c);
    }
}