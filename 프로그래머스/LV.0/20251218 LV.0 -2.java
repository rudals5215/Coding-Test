//문자 리스트를 문자열로 변환하기
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0 ; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}

// 오답노트
// arr.append(i) 는 존재하지 않음 -> arr[i]
// arr.length() ❌ → arr.length ⭕

// 다른 사람 풀이
// String.join() 메서드 사용
class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}

// StringBuilder, append() 메서드사용
class Solution {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}