//package programmers;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class lessons67257 {
//    public static void main(String[] args) {
//        String expression ="50*6-3*2";
//        solution(expression);
//    }
//    public static long solution(String expression) {
//        long answer = 0;
//        String[] spltied = expression.split("\\*|\\+|-");
//        LinkedList<String> inputs = new LinkedList<>();
//        String num = "";
//        for(int i=0; i<expression.length(); i++){
//            char ch = expression.charAt(i);
//            if(ch == '+' || ch == '-' || ch == '*'){
//                inputs.add(num);
//                inputs.add(String.valueOf(ch));
//                num = "";
//            } else {
//                num +=ch;
//            }
//            if(expression.length()-1 == i){
//                inputs.add(num);
//            }
//        }
//
//        String[][] operators = {{"*","+","-"},{"*","-","+"},{"+","*","-"},{"+","-","*"},{"-","*","+"}, {"-","+","*"}};
//
//        for(int i=0; i<operators.length; i++){
//            long tmp = 0L;
//            for(int j=0; j<operators[i].length; j++){
//                LinkedList<String> tmpStrings = (LinkedList<String>) inputs.clone();
//                Iterator iterator = tmpStrings.iterator();
//                while (iterator.hasNext()){
//                    if(iterator.equals(operators[i][j])){
//
//                    }
//                }
//                while (tmpStrings--)
//                for(int k=0; k<tmpStrings.size(); k++){
//                    if(tmpStrings.get(k).equals(operators[i][j])){
//                       tmp = calculator(tmpStrings.get(k-1),tmpStrings.get(k+1),tmpStrings.get(k));
//                        tmpStrings.remove(k-1);
//                        tmpStrings.remove(k-1);
//                        tmpStrings.remove(k-1);
//                        tmpStrings.add(k-1,String.valueOf(tmp));
//                    }
//                }
//                answer = Math.max(answer,Math.abs(tmp));
//            }
//            System.err.println(answer);
//        }
//        return (answer);
//    }
//    public static long calculator(String prev, String next, String operator){
//       long longPrev = Long.parseLong(prev);
//       long longNext = Long.parseLong(next);
//       switch (operator){
//           case "*":
//               return longPrev*longNext;
//           case "+":
//               return longPrev+longNext;
//           case "-":
//               return longPrev-longNext;
//           default:
//               return 0L;
//       }
//    }
//}
