package programmers;

public class lessons43165 {
    int[] numbers;
    int target;
    int answer;
    public static void main(String[] args) {

    }

    public int solution(int[] numbers, int target) {
        numbers = this.numbers;
        target = this.target;
        answer = this.answer;


        return answer;
    }

    void dfs(int index, int sum){

       if(index == numbers.length){
           if(target == sum) answer++;
           return;
       }

        dfs(index+1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
}
