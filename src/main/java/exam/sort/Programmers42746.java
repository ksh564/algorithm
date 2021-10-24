package exam.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Programmers42746 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] inputArr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            inputArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(inputArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(inputArr[0].equals("0")){
            return "0";
        }
        for(int i=0; i< inputArr.length; i++){
            answer += inputArr[i];
        }

        return answer;
    }
}
