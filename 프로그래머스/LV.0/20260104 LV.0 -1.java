// 마지막 두 원소
// 나의 답
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer.append(num_list);
        if (num_list[-2] < num_list[-1]) {
            answer.append(num_list[-1] - num_list[-2]);
        } else {
            answer.append(num_list[-1]*2);
        }
        return answer;
    }
}

// 정답
class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;

        // 1. 결과 배열 생성 (기존 + 1)
        int[] answer = new int[n + 1];

        // 2. 기존 값 복사
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        // 3. 마지막 두 값 비교 후 추가
        if (num_list[n - 2] < num_list[n - 1]) {
            answer[n] = num_list[n - 1] - num_list[n - 2];
        } else {
            answer[n] = num_list[n - 1] * 2;
        }

        return answer;
    }
}

// 오답노트
// 1️⃣ 자바 배열은 크기가 고정이라 append로 값을 추가할 수 없다. → append 발상 자체 차단
// 2️⃣ 자바에서는 음수 인덱스(-1, -2)로 배열에 접근할 수 없다. → 파이썬식 접근 완전 차단
// 3️⃣ 배열 문제는 결과 크기를 먼저 정하고 새 배열을 만들어 값을 복사해야 한다. → “크기 결정 → 새 배열 → 복사”
