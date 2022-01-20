package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lessons42888 {
    public static void main(String[] args) {
        solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
    }
    public static String[] solution(String[] record){
        Map<String, String> stringMap = new HashMap<String, String>();
        List<String> list = new ArrayList<>();
        for(String str : record){
           String[] splitedStr = str.split(" ");
           if(!"Leave".equals(splitedStr[0])){
               stringMap.put(splitedStr[1], splitedStr[2]);
           }
        }
        for(String str : record){
            String[] splitedStr = str.split(" ");
            if("Enter".equals(splitedStr[0])){
                list.add(stringMap.get(splitedStr[1])+"님이 들어왔습니다.");
            } else if ("Leave".equals(splitedStr[0])){
                list.add(stringMap.get(splitedStr[1])+"님이 나갔습니다.");
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
