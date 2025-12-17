// 홀짝 구분하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println (n + " is even");
        } else {
            System.out.println (n + " is odd");
        }
    }
}

// 다른 사람 풀이
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.printf("%d is even",n);
        } else {
            System.out.printf("%d is odd",n);
        }
    }
}


// 삼항 연산자
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));

    }
}

