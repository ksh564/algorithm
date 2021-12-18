package codility;

import java.util.Stack;

public class Codility07 {
    public int solution(String S) {
        // write your code in Java SE 8
        if(S.length() == 0){
            return 1;
        }
        return findNested(S);
    }
    public static int findNested(String input){
        Stack<String> stack = new Stack();
        for(int i=0; i<input.length(); i++){
            String inputStr = String.valueOf(input.charAt(i));
            if(stack.isEmpty()){
                stack.push(inputStr);
                continue;
            }
            if(")".equals(inputStr)){
                if("(".equals(stack.peek())){
                    stack.pop();
                } else {
                    stack.push(inputStr);
                }
            } else {
                stack.push(inputStr);
            }
        }
        if(stack.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }

    public static int countBlock(int[] blocks){
        Stack<Integer> blockStack = new Stack();
        int count = 0;
        for(int block : blocks){
            while(!blockStack.isEmpty() && blockStack.peek() > block){
                blockStack.pop();
            }
            if(blockStack.isEmpty() || blockStack.peek() < block){
                blockStack.push(block);
                count++;
            }
        }
        return count;
    }
    public int checkFish(int[] A, int[] B){
        int count = 0;

        return count;
    }
}
// you can also use imports, for example:
