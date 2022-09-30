package programmers;

//        과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
//        논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
//        입출력 예

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lessons42747 {
    public static void main(String[] args) {
        int[] input = {3,0,6,1,5};
        solution(input);
    }
//    public static int solution(int[] citations) {
//        int[] exposuredCitations = new int[10000];
//        int allocatedExposured = 0;
//        int answer = 0;
//        for(int i=0; i<citations.length; i++) {
//            int citation = citations[i];
//            for(int j=1; j<=citation; j++) {
//                int exposured = exposuredCitations[j]++;
//                allocatedExposured = Math.max(allocatedExposured, exposured);
//                if(exposured >= allocatedExposured){
//                    answer = j;
//                }
//            }
//        }
//        return answer;
//    }
    public static int solution(int[] citations) {

        Arrays.sort(citations);

        int index = (int) Math.ceil(citations.length / 2)-1;
        return citations[index];
    }
}
