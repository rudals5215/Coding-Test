// 더 크게 합치기
class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);

        return Math.max(ab, ba);
    }
}

// 오답노트
// Integer.parseInt() 사용하여 숫자를 문자로 변환
// Math.max() = 두 값 중에서 더 큰 값을 반환하는 메서드