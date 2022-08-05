package programmers;

//정수 n이 매개변수로 주어집니다. 다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터
//        반시계 방향으로 달팽이 채우기를 진행한 후,
//        첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.
//
//        examples.png
//
//        제한사항
//        n은 1 이상 1,000 이하입니다.
//        입출력 예
//        n	result
//        4	[1,2,9,3,10,8,4,5,6,7]
//        5	[1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
//        6	[1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
public class lessons68646 {
    final static int DOWN = 0, RIGHT = 1, UPPER_AND_LEFT = 2;
    public static void main(String[] args) {
       solution(7);
    }
    public static int[] solution(int n) {
        int[][] pan = new int[n][n];
        int indicator = 0;
        int checker = n-1;
        int changer = n-1;
        int maxValue = (n)*(n+1) / 2;
        int row = 0;
        int column = 0;
        for(int i=0; i<maxValue; i++) {
            pan[row][column] = i+1;

            if(checker == i && i!=0) {
                switch (indicator) {
                    case DOWN:
                        indicator = RIGHT;
                        break;
                    case RIGHT:
                        indicator = UPPER_AND_LEFT;
                        break;
                    case UPPER_AND_LEFT:
                        indicator = DOWN;
                        break;
                }
                checker += changer;
                if(i != 0)
                changer--;
            }

            if(indicator == DOWN) {
                row++;
            } else if (indicator == RIGHT) {
                column++;
            } else {
                row--;
                column--;
            }
        }
        int[] answer = new int[maxValue];
        int index = 0;
        for(int i=0; i<pan.length; i++){
            for(int j=0; j<pan[i].length; j++) {
                if(pan[i][j] == 0) {
                    continue;
                } else {
                    answer[index] = pan[i][j];
                    index++;
                }
            }
        }

        return answer;
    }
}
