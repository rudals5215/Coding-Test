// 문자열 겹쳐쓰기
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for (int i = 0 ; i < my_string.length(); i++) {
            if (i < s || i >= (overwrite_string.length() + s) ) {
                answer += my_string.charAt(i);   
            }
            else if(i >= s) {
                answer += overwrite_string.charAt(i-s);
            }
        }
        return answer;
    }
}

// 다른 사람 풀이
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}