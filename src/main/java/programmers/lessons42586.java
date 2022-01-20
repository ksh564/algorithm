package programmers;

import java.util.*;

public class lessons42586 {
    public static void main(String[] args) {
        int[] a = {93,30,55};
        int[] b = {1,30,5};
        solution(a,b);
    }
    private static Queue<Work> inProgresses;
    public static int[] solution(int[] progresses, int[] speeds) {
        inProgresses = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            Work work = new Work(progresses[i],speeds[i]);
            inProgresses.add(work);
        }
        int[] answer = checkProgress();
        return answer;
    }
    public static int[] checkProgress(){
        List<Integer> answer = new ArrayList<>();
        boolean isOperate = true;
        int day = 0;
        while (isOperate){
            day++;
            int completeWork = 0;
            boolean isPoll = true;
            while (isPoll && !inProgresses.isEmpty()){
                Work work = inProgresses.peek();
                int workRate = work.progress + work.speed * day;
                if(workRate >= 100){
                    inProgresses.poll();
                    completeWork++;
                } else {
                    isPoll = false;
                }
            }
            if(completeWork > 0){
                answer.add(completeWork);
            }
            if(inProgresses.isEmpty()){
                isOperate = false;
            }
        }
        int[] arrAnswer = new int[answer.size()];
        int i=0;
        for(int input : answer){
            arrAnswer[i] = input;
            i++;
        }
        return arrAnswer;
    }
}
class Work{
   public int progress;
   public int speed;
    Work(int progress, int speed){
       this.progress = progress;
       this.speed = speed;
   }
}
