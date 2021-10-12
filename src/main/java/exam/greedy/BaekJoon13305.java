package exam.greedy;

import java.util.Scanner;

public class BaekJoon13305 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String  N = scanner.nextLine();
       String roads = scanner.nextLine();
       String costs = scanner.nextLine();

       String[] arrayRoads = roads.split(" ");

       String[] arrayCosts = costs.split(" ");

       long result = 0;

       long min = Long.parseLong(arrayCosts[0]);
       for(int i=0; i<arrayRoads.length; i++){

           long cost = Long.parseLong((arrayCosts[i]));
           if(min >= cost){
               min = cost;
           }
           result += min * Long.parseLong((arrayRoads[i]));
       }
       System.out.println(result);
   }
}
