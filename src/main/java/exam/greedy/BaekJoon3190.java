//package exam.greedy;
//
//import java.util.*;
//
//public class BaekJoon3190 {
//    static int[][]  movement = {{1,0},{-1,0},{0,-1},{1,1}};
//    public static final int EAST = 0, WEST = 1, SOUTH = 2, NORTH = 3;
//    public static Queue<SnakePoint> snakeInfo = new ArrayDeque<>();
//    static int currnetPostion = EAST;
//    static int N;
//    static int time = 0;
//    static boolean[][] appleMap;
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        N = scanner.nextInt();
//        int appleNum = scanner.nextInt();
//        appleMap = new boolean[N][N];
//        Arrays.fill(appleMap,Boolean.FALSE);
//
//
//        for(int i=0; i<appleNum; i++){
//           int a = scanner.nextInt();
//           int b= scanner.nextInt();
//           appleMap[a][b] = true;
//        }
//        int directIndex = scanner.nextInt();
//        String[][] direction = new String[directIndex][2];
//        for(int j=0; j<directIndex; j++){
//            direction[j][0] = scanner.next();
//            direction[j][1] = scanner.next();
//        }
//
//        for(int i=0; i<direction.length; i++){
//            int moveNum = Integer.parseInt(direction[i][0]);
//        }
//
//    }
//
//    public static boolean isFinish(){
//
//        int xPosition = snakeInfo.peek().x;
//        int yPosition = snakeInfo.peek().y;
//
//        if(xPosition < 0 && yPosition < 0 &&  xPosition > N && yPosition > N){
//            return false;
//        }
//        Queue<SnakePoint> tmpSnake = snakeInfo;
//        tmpSnake.poll();
//
//        Iterator iterator = tmpSnake.iterator();
//        while (iterator.hasNext()){
//           SnakePoint snakePoint = (SnakePoint) iterator.next();
//           if(snakePoint.x == xPosition && snakePoint.y == yPosition);
//           return false;
//        }
//        return true;
//    }
//
//    public static void move( String direct, int moveNum){
//        ArrayList<Integer> removeItem = new ArrayList<>();
//        for(int i=0; i<moveNum; i++){
//            // 이동
//
//            int tmpX = snakeInfo.peek().x + movement[currnetPostion][0];;
//            int tmpY = snakeInfo.peek().y + movement[currnetPostion][1];;
//
//            SnakePoint movedSnakePoint = new SnakePoint(tmpX,tmpY);
//
//            snakeInfo.add(movedSnakePoint);
//
//            time ++;
//            if(isFinish() == false){
//                break;
//            }
//            //사과를 먹었어
//            if(appleMap[sna])
//            for(int j=0; j<apple.size(); j++){
//                if(postion[0][0] == apple.get(j)[0][0] && postion[0][1] == apple.get(j)[0][1]){// 사과먹기
//                    removeItem.add(j);
//                    //남아있는 길이에 의해서
//                    //머리부터 - 다시 돌아가서 체크 - 사과먹었으면 -> 길이 체크 해서 -> 몸의 길이만큼 돌아왔던 방향대로 움직일 수 없는 맵 체크
//                } else {
//
//                }
//            }
//        }
//        for(int k=0; k<removeItem.size(); k++){
//            apple.remove(removeItem.get(k));
//        }
//        //
//        if("L".equals(direct)){
//            // L 일때 왼쪽90도 회전
//            switch (currnetPostion){
//                case EAST:
//                    currnetPostion = SOUTH;
//                    break;
//                case WEST:
//                    currnetPostion = NORTH;
//                    break;
//                case SOUTH:
//                    currnetPostion = WEST;
//                    break;
//                case NORTH:
//                    currnetPostion = EAST;
//                    break;
//            }
//        } else {
//            //  D  일때 오른쪽 90도 회전
//            switch (currnetPostion){
//                case EAST:
//                    currnetPostion = NORTH;
//                    break;
//                case WEST:
//                    currnetPostion = SOUTH;
//                    break;
//                case SOUTH:
//                    currnetPostion = EAST;
//                    break;
//                case NORTH:
//                    currnetPostion = WEST;
//                    break;
//            }
//        }
//        // 시간증가
//
//    }
//
//}
//class SnakePoint {
//    int x,y;
//    SnakePoint(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//
//}
//
