package programmers;

import java.util.ArrayList;

public class lessons77485 {
    static int[][] matrix, copymatrix;
    static ArrayList<Integer> answerList;
    public static void main(String[] args) {
//        int[][] input = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[][] input = {{1,1,100,97}};
//        solution(6,6, input);
        solution(100,97,input);
    }
    public static int[] solution(int rows, int columns, int[][] queries) {
        answerList = new ArrayList<>();
        matrix = new int[rows][columns];
        int input = 1;
        for(int i=0; i < rows; i++) {
            for(int j=0; j<columns; j++) {
                matrix[i][j] = input++;
            }
        }

        for(int i=0; i< queries.length; i++){
            int[] inputArray = queries[i];
            rotate(matrix,inputArray);
        }


        int[] answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;

    }

    public static int[][] rotate(int[][] input, int[] query) {
        //행 - i와 관련
        int min = Integer.MAX_VALUE;
        // 행
        int x1 = query[0]-1;
        //열
        int y1 = query[1]-1;
        //행 100
        int x2 = query[2]-1;
        //열 97
        int y2 = query[3]-1;
        copymatrix = input;
        int[][] copy = copyArray(input);
        for(int i=x1; i<=x2; i++){
            for(int j=y1; j<=y2; j++){
                // 윗변 오른쪽 이동
                if(j-1 >= 0 && i == x1 && !(i == x1 && j == y1)) {
                    copymatrix[i][j] = copy[i][j-1];
                    min = Math.min(min, copymatrix[i][j]);
                    // 밑변 왼쪽 이동
                } else if (j+1 < input[0].length && i == x2  &&  !(i == x2 && j == y2)) {
                    copymatrix[i][j] = copy[i][j+1];
                    min = Math.min(min, copymatrix[i][j]);
                    // 아래로 이동
                } else if (i+1 < input.length && !(i == x1 && j == y2) && j == y1) {
                    copymatrix[i][j] = copy[i+1][j];
                    min = Math.min(min, copymatrix[i][j]);
                    //위로이동
                } else if (i-1 >= 0 && !(i == x2 && j == y1) && j == y2) {
                    copymatrix[i][j] = copy[i-1][j];
                    min = Math.min(min, copymatrix[i][j]);
                }
            }
        }
        answerList.add(min);
        return copymatrix;
    }
    public static int[][] copyArray(int[][] inputArray){
        int[][] result = new int[inputArray.length][inputArray[0].length];
        for(int i=0; i< inputArray.length; i++){
            result[i] = inputArray[i].clone();
        }
        return result;
    };
}
