package exam.bfsdfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1987 {
//    문제
//    세로 R칸, 가로 C칸으로 된 표 모양의 보드가 있다.
//    보드의 각 칸에는 대문자 알파벳이 하나씩 적혀 있고, 좌측 상단 칸 (1행 1열) 에는 말이 놓여 있다.
//
//    말은 상하좌우로 인접한 네 칸 중의 한 칸으로 이동할 수 있는데, 새로 이동한 칸에 적혀 있는
//    알파벳은 지금까지 지나온 모든 칸에 적혀 있는 알파벳과는 달라야 한다. 즉, 같은 알파벳이 적힌 칸을 두 번 지날 수 없다.
//
//    좌측 상단에서 시작해서, 말이 최대한 몇 칸을 지날 수 있는지를 구하는 프로그램을 작성하시오. 말이 지나는 칸은 좌측 상단의 칸도 포함된다.
//
//            입력
//    첫째 줄에 R과 C가 빈칸을 사이에 두고 주어진다. (1 ≤ R,C ≤ 20) 둘째 줄부터 R개의 줄에 걸쳐서 보드에 적혀 있는 C개의 대문자 알파벳들이 빈칸 없이 주어진다.
//
//    출력
//    첫째 줄에 말이 지날 수 있는 최대의 칸 수를 출력한다.

    static int R,C;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    static String[][] maps;
    static boolean[][] visited;
    static ArrayList<String> visitedMark;
    static int count, count2;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt(); // 세로
        C = scanner.nextInt(); // 가로
        scanner.nextLine();

        maps = new String[R][C];
        visited = new boolean[R][C];

        for(int i=0; i<R; i++){
            String str = scanner.nextLine();
            for(int j=0; j<str.length(); j++){
                maps[i][j] = Character.toString(str.charAt(j));
            }
        }

        visitedMark = new ArrayList<>();
        count = 1;
        move(0,0);

    }

    public static void move(int x, int y){
        // 지나온 모


        // 벽에 부딪히는 케이스
        if(x < 0 || y < 0 || x >= C-1 || y >= R-1){
            return;
        }

        for(int i=0; i<4; i++){

            for(int j=0; j<visitedMark.size(); j++) {
                if (x + dx[i] < 0 || y + dy[i] < 0 || x + dx[i] >= C - 1 || y + dy[i] >= R - 1) {
                    continue;
                }
                if (visitedMark.get(j).equals(maps[y + dy[i]][x + dx[i]])) {
                    visited[y + dy[i]][x + dx[i]] = true;
                    continue;
                }
            }
            visited[y+dy[i]][x + dx[i]] = true;
            visitedMark.add(maps[y+dy[i]][x + dx[i]]);
            move(x + dx[i],y+dy[i]);
            return;
        }
    }
}
