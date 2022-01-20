package programmers;

import datastructure.Stack;

public class lessons60058 {
    public static void main(String[] args) {

    }
    public String solution(String p) {

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<p.length(); i++){
          if(stack.isEmpty()){
              stack.push(p.charAt(i));
          } else {
              if(stack.peek().equals("(") && ")".equals(p.charAt(i))){

              }
          }
        }

        String answer = "";
        return answer;
    }

    public static boolean isCorrect(String inputs){
        boolean isCorrect = true;
        int left = 0;
        int right = 0;
        Stack<Character> characterStack = new Stack<>();
        for(int i=0; i<inputs.length(); i++){
            Character input = inputs.charAt(i);
            if("(".equals(input)){
                left++;
                characterStack.push(input);
            } else {

            }
        }

        return true;
    }
}
