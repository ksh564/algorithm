package programmers;

import java.util.*;

//수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
// 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//        1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
//        가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//        제한 조건
//        시험은 최대 10,000 문제로 구성되어있습니다.
//        문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//        가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//        입출력 예
//        answers	return
//        [1,2,3,4,5]	[1]
//        [1,3,2,4,2]	[1,2,3]
//        입출력 예 설명
//        입출력 예 #1
//
//        수포자 1은 모든 문제를 맞혔습니다.
//        수포자 2는 모든 문제를 틀렸습니다.
//        수포자 3은 모든 문제를 틀렸습니다.
//        따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
//
//        입출력 예 #2
//
//        모든 사람이 2문제씩을 맞췄습니다.
public class lessons42840 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};

        solution(input);

    }
    public static int[] solution(int[] answers) {
        int count1 = 0, count2 = 0, count3 = 0;

        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<answers.length; i++){
            if(answers[i] == person1[i%person1.length]){
                count1++;
            }
            if(answers[i] == person2[i%person2.length]){
                count2++;
            }
            if(answers[i] == person3[i%person3.length]){
                count3++;
            }
        }
        Map<Integer,Integer> countList = new HashMap<>();
        if(count1 != 0)
            countList.put(1, count1);
        if(count2 != 0)
            countList.put(2, count2);
        if(count3 != 0)
            countList.put(3, count3);

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(countList.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        ArrayList<Integer> answerList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int i = 0;
        for(Map.Entry<Integer, Integer> input : entryList){
           i++;
           if(i == 0)
               max = input.getValue();
           if(max == input.getValue()){
               answerList.add(input.getKey());
           }
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
