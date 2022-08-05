package programmers;

public class lessons17679 {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int m, n, count, downCount;
    static char[][] inputBoard;
    static boolean[][] checkBoard;
    public static void main(String[] args) {
        String[] input = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        solution(4,5, input);
    }
    public static int solution(int m, int n, String[] board) {

        inputBoard = new char[m][n];
        checkBoard = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                inputBoard[i][j] = board[i].charAt(j);
            }
        }

        boolean isRemove = true;
        while (isRemove) {
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    checkSquare(i, j);
                }
            }
            isRemove = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    isRemove = removeSquare(i, j);
                }
            }
            boolean stillDown = true;
            downCount = 0;
            while (stillDown){
                downCount++;
                if(downCount == n){
                    stillDown = false;
                }
                for (int i = m-1; i >= 1; i--) {
                    for (int j = n - 1; j >= 0; j--) {
                        downSquare(i, j);
                    }
                }
            }
        }
        int answer = count;
        return answer;
    }

    public static void checkSquare(int m, int n) {
        char item = inputBoard[m][n];

        if(item == inputBoard[m+1][n] && item == inputBoard[m+1][n+1] && item == inputBoard[m][n+1]){
            checkBoard[m][n] = true;
            checkBoard[m+1][n+1] = true;
            checkBoard[m][n+1] = true;
            checkBoard[m+1][n] = true;
            count ++;
        }

    }

    public static boolean removeSquare(int m, int n) {
        boolean check = checkBoard[m][n];
        if(check == true) {
            inputBoard[m][n] = '#';
        }
        return false;
    }

    public static void downSquare(int m, int n) {
        char empty = inputBoard[m][n];
        if('#' == empty){
            inputBoard[m][n] = inputBoard[m-1][n];
            inputBoard[m-1][n] = '#';
        }
    }

}