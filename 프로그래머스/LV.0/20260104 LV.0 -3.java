// 수 조작하기 2
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 0; i < (numLog.length)-1; i++){
            if (numLog[i+1] - numLog[i] == 1) {
                answer += 'w';
            } else if (numLog[i+1] - numLog[i] == -1) {
                answer += 's';
            } else if (numLog[i+1] - numLog[i] == 10) {
                answer += 'd';
            } else if (numLog[i+1] - numLog[i] == -10) {
                answer += 'a';
            }
        }
        return answer;
    }
}

// 다른 사람 풀이
// switch 문 사용
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            int j = numLog[i-1] - numLog[i];
            switch(j){
                case -1 : answer+='w'; break;
                case 1 : answer+='s'; break;
                case -10 : answer+='d'; break;
                case 10 : answer+='a'; break;
            }
        }
        return answer;
    }
}
