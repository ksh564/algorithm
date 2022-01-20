//package programmers;
//
//import java.util.*;
//
//public class lessons64065 {
//    public static void main(String[] args) {
//        solution("{{123}}");
//    }
//
//    public static int[] solution(String s) {
//        HashMap<Integer, List<Integer>> listHashMap = new HashMap<>();
//        List<Integer> inputList = null;
//        LinkedHashSet<Integer> integerHashSet = new LinkedHashSet<>();
//        int maxSize = 0;
//        String inputString = s.
//
//        for(int i=1; i<s.length()-1; i++){
//            char input = s.charAt(i);
//            if("{".equals(Character.toString(input))){
//                inputList = new ArrayList<>();
//            } else if ("}".equals(Character.toString(input))){
//                listHashMap.put(inputList.size(),inputList);
//                maxSize = Integer.max(maxSize, inputList.size());
//            } else if (!",".equals(Character.toString(input))){
//                inputString += input;
//            } else if(",".equals(Character.toString(input)) || i == s.length()-2) {
//                inputList.add(Integer.parseInt(inputString));
//                inputString ="";
//            }
//        }
//        for(int i=1; i<=maxSize; i++){
//            List<Integer> integers = new ArrayList<>();
//            integers = listHashMap.get(i);
//            if(integers != null){
//                for(int j=0; j<integers.size(); j++){
//                    integerHashSet.add(integers.get(j));
//                }
//            }
//        }
//        int[] result = new int[integerHashSet.size()];
//        int i=0;
//        for (int input : integerHashSet){
//            result[i++] = input;
//        }
//        return result;
//    }
//}
