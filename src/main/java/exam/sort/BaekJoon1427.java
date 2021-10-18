package exam.sort;

import java.util.*;

public class BaekJoon1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        ArrayList<Integer> input = new ArrayList<>();

        for(int i=0; i<inputStr.length(); i++){
            input.add(inputStr.charAt(i)-'0');
        }
        Collections.sort(input, Comparator.reverseOrder());
        for(Integer element : input){
            System.out.print(element);
        }
    }
}
