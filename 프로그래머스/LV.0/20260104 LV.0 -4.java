// 수열과 구간 쿼리 3
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp;
        for (int k = 0; k < queries.length; k++) {
            int i = queries[k][0];
            int j = queries[k][1];
            
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}

// 오답 노트
// 1️⃣ swap은 배열이 아니라 값(int) 하나를 임시 저장한다
// 2️⃣ queries의 값은 직접 꺼내서 i, j로 선언해야 한다