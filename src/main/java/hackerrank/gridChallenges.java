package hackerrank;

import java.util.*;

public class gridChallenges {

    public static void main(String[] args) {
        String[] arr = {"ebacd", "fghij", "olmkn", "trpqs" ,"xywuv"};
        List<String> testCase = Arrays.asList(arr);

        gridChallenge(testCase);
    }

    public static String gridChallenge(List<String> grid){
        List<String> sortedList = new ArrayList<>();
        Map<Integer, Character> characterMap = new HashMap<>();

        // 정렬
        for(String str : grid){
            char[] stringToChar = str.toCharArray();
            Arrays.sort(stringToChar);
            String sortedString  = new String(stringToChar);
            sortedList.add(sortedString);
        }

        for(String str : sortedList){
            char[] stringToChar = str.toCharArray();
            for(int i=0; i<stringToChar.length; i++){
               if(characterMap.containsKey(i)){
                   if(characterMap.get(i) < stringToChar[i]){
                       characterMap.put(i,stringToChar[i]);
                   } else {
                       return "NO";
                   }
               } else {
                   characterMap.put(i,stringToChar[i]);
               }
            }
        }
        return "YES";
    }
}
