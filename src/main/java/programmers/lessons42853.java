package programmers;

import java.util.Stack;

public class lessons42853 {
    static int bridgeLength , limitedWeight, sum, count;
    static java.util.Stack<Integer> onBridegeCars;
    public static void main(String[] args) {
        int[] input = {10};
        solution(100,100,input);
    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        onBridegeCars = new Stack<>();
        int answer = 0;
        bridgeLength = bridge_length;
        limitedWeight = weight;
        for(int inputTruck : truck_weights){
            compare(inputTruck);
        }
        answer = count;
        return answer;
    }

    public static void compare(int inputWeight) {

        count++;
        if(onBridegeCars.isEmpty() || sum <= limitedWeight){
            onBridegeCars.push(inputWeight);
            sum += inputWeight;
        } else {
            int weight = onBridegeCars.pop();
            sum -= weight;
            count++;
            compare(inputWeight);
        }

    }


}
