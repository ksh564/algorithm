package programmers;

import java.util.*;

public class lessons92334 {
    private static LinkedHashMap<String,User> users;

    public static void main(String[] args) {
        String[] idlist = {"con", "ryan"};
        String[] reportList = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        solution(idlist,reportList,k);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        users = new LinkedHashMap<>();
        for(String inputUser : id_list){
            User user = new User(inputUser);
            users.put(inputUser,user);
        }
        report(users,report);
        calculateReport(users,k);
        int[] answer = new int[id_list.length];
        Iterator iterator = users.values().iterator();
        int i = 0;
        while (iterator.hasNext()){
            User user = (User) iterator.next();
            answer[i] = user.reportNumber;
            i++;
        }
        return answer;
    }

    public static void report(LinkedHashMap<String,User> idList, String[] report){
        for(String inputUsers : report){
          String[] users = inputUsers.split(" ");
          String reporter = users[0];
          String reported = users[1];
          User user = idList.get(reported);
          user.report(reporter);
        }
    }
    public static void calculateReport(LinkedHashMap<String,User> idList, int k){
        Iterator iterator = idList.values().iterator();
        while (iterator.hasNext()){
           User user= (User) iterator.next();
           HashSet<String> reports = user.result(k);
           if(reports.size() < k){
               return;
           }
           if(reports != null){
               Iterator reportsIterator = reports.iterator();
               while (reportsIterator.hasNext()){
                   String userId = (String) reportsIterator.next();
                   idList.get(userId).report();
               }
           }
        }
    }
}

class User {
    public String name;
    private HashSet<String> reporters;
    private int penaltyNumber;
    public int reportNumber;

    User(String name){
        this.name = name;
        reporters = new HashSet<>();
        penaltyNumber = 0;
    }
    public void report(String id){
        if(!reporters.contains(id)){
            reporters.add(id);
        }
    }
    public HashSet<String> result(int number){
        if(penaltyNumber >= number){
          return reporters;
        } else {
            return null;
        }
    }
    public void report(){
        reportNumber++;
    }
}