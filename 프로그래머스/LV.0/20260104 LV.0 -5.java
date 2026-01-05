// 수열과 구간 쿼리 2
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            int min = Integer.MAX_VALUE;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    min = Math.min(min, arr[i]);
                }
            }

            if (min == Integer.MAX_VALUE) {
                answer[q] = -1;
            } else {
                answer[q] = min;
            }
        }

        return answer;
    }
}

// 오답 노트
// 1️⃣ 쿼리 문제는 바깥 for = 쿼리 / 안쪽 for = 배열 탐색 구조다. → 쿼리 하나당 arr의 특정 구간을 다시 순회해야 한다.
// 2️⃣ queries의 한 원소는 [s, e, k]이며, 각 값을 직접 변수로 꺼내야 한다. → int s = queries[q][0]; int e = queries[q][1]; int k = queries[q][2];
// 3️⃣ 결과 배열(answer)의 크기는 쿼리 개수로 미리 결정해야 한다. → int[] answer = new int[queries.length]; → {}로 시작하거나 append하려는 발상은 틀림.
// 4️⃣ “k보다 크면서 가장 작은 값”은 최소값 변수(min)를 두고 비교로 갱신한다. → 최소값 문제는 항상 Integer.MAX_VALUE로 시작.
// 5️⃣ 조건을 만족하는 값이 하나도 없을 수 있다는 경우를 반드시 고려해야 한다. → min이 끝까지 바뀌지 않으면 -1을 저장.
// 6️⃣ 이 문제는 배열을 수정하는 문제가 아니라 값을 “찾아서 저장”하는 문제다. → arr는 건드리지 않고 answer에만 결과를 넣는다.
// 7️⃣ 한 쿼리의 결과는 answer의 같은 인덱스에 저장해야 한다. → answer[q] = 결과값;
