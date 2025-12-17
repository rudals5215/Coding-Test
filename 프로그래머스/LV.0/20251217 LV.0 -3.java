// 문자열 돌리기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i = 0;
        while(i < a.length()) {
            System.out.println(a.charAt(i));
            i++;
        }
    }
}

// 오답노트
// a.length가 아니라 a.length()이다. -> 메서드이기 때문에
// a[i]가 아니라 a.charAt(i)이다. -> a[i]는 배열에서 사용하는 방법이고 String은 객체라서 a.charAt(i)로 사용.