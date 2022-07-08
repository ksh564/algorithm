package exam.kakao;

import java.util.Arrays;
import java.util.HashSet;

public class Kakao72411 {
    private static HashSet<String> combination;
    public static void main(String[] args) {

    }

    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        return answer;
    }

    public static void findCourse(String[] orders, int[] course){
        Arrays.sort(orders);


            for(int j=0; j<course.length; j++){
                int courseCount = course[j];
                boolean[] visted = new boolean[courseCount];
                for(int i=0; i<orders.length; i++){

                }
            }
    }
    public static void combination(String[] arr, boolean[] vistied, int start, int n, int r){
        if (r == 0){
            addCombi(arr,vistied,n);
            return;
        }
        for (int i = start; i < n; i++){
            vistied[i] = true;
            combination(arr,vistied,i+1,n,r-1);
            vistied[i] = false;
        }
    }
    static void addCombi(String[] arr, boolean[] visited, int n){
        for(int i=0; i<n; i++){
            if(visited[i]){
                combination.add(arr[i]);
            }
        }
    }
}
