// 코드 처리하기
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++){
            if (mode == 0) {
                if (code.charAt(i) != '1') {
                    if (i % 2 == 0) {
                        answer += code.charAt(i);
                    }
                } else if (code.charAt(i) == '1'){
                    mode = 1;
                }
            } else if (mode == 1) {
                if (code.charAt(i) != '1') {
                    if (i % 2 == 1) {
                        answer += code.charAt(i);
                    }
                } else if(code.charAt(i)== '1'){
                    mode = 0;
                }
            }
        }
        if (answer == ""){
                return "EMPTY";
            }
        else {
            return answer;            
        }
    }
}

// 오답 노트
// '1' 과 1 은 완전히 다르다
// answer == "" 비교는 틀림
// "EMPTY" 반환 위치가 잘못됨

// GPT 답
class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                mode = 1 - mode; // 0 ↔ 1 토글
            } else {
                if (mode == 0 && i % 2 == 0) {
                    answer.append(c);
                }
                if (mode == 1 && i % 2 == 1) {
                    answer.append(c);
                }
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}