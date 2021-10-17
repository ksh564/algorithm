package exam.bfsdfs;

import java.util.*;

public class Programmers43164 {

    public static void main(String[] args) {

        String[][] input = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        solution(input);
    }

    public static String[] solution(String[][] tickets) {

        maps = tickets;
        usedTickets = new boolean[maps.length];
        String[] answer = {};
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                if(o1[0].compareTo(o2[0])== 0){
                    return o1[1].compareTo(o2[1]);
                } else return o1[0].compareTo(o2[0]);
            }
        });
        check = true;
        while (check){
            count = 0;
            arrayList = new ArrayList<>();
            if(bfs(startIndex,arrayList) == maps.length+1){
              check = false;
            }
        }

        answer = new String[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    public static int bfs(int start, ArrayList<String> output){

        Queue<String> queue = new LinkedList<>();
        for(int i=start; i<maps.length; i++){
            if(maps[i][0].equals("ICN")){
                queue.offer(maps[i][1]);
                output.add(maps[i][0]);
                usedTickets[i] = true;
                startIndex = i+1;
                break;
            }
        }
        while (!queue.isEmpty()){
            String index = queue.poll();
            output.add(index);
            count++;
            for(int i=0; i<maps.length; i++){
                if(index.equals(maps[i][0]) && usedTickets[i] == false){
                    usedTickets[i] = true;
                    queue.offer(maps[i][1]);
                    break;
                }
            }
        }
        return count;
    }
    static boolean[] usedTickets;
    static String[][] maps;
    static ArrayList<String> arrayList;
    static int count, startIndex = 0;
    static boolean check;
}
