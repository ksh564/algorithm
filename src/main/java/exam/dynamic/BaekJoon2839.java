package exam.dynamic;

import java.util.Scanner;

public class BaekJoon2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(countSugar(N));
    }

    public static int countSugar(int input){
        int answer = 0;
        while (true){
            if(input % 5 == 0){
                answer = input / 5 + answer;
                return answer;
            } else if(input < 0){
                return -1;
            }
            // 5부터 나누고  답이 안나오면 -> 3으로 나누고
            // 6 / 5 = 몫  = 1 나머지 = 1
            // 6 / 3 = 몫  = 2 나머지  = 0
            // 11 / 3 = 몫 = 2 나머지 5  예제출력 = 3 ( 3 3 5)
            input = input-3;
            answer++;
        }
    }
}
