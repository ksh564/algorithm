package exam.greedy;

import java.util.Scanner;

public class BaekJoon3062 {
    public static void main(String[] args) {

        int inputNum;

        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        String n;


        for(int i=0; i<inputNum; i++){
            int result = 0;
            String reverseN = "";
            n = scanner.next();
            for(int j=n.length()-1; j>=0; j--){
                reverseN +=  n.charAt(j);
            }
            if(n.length() > 1) {
               result = Integer.parseInt(n) + Integer.parseInt(reverseN);
            } else {
                result = Integer.parseInt(n) + Integer.parseInt(n);
            }

            String strResult = String.valueOf(result);
            String strPre = "";
            String strBack = "";
            for(int k=0; k < strResult.length() / 2; k++){
                strPre += strResult.charAt(k);
            }
            if(strResult.length() % 2 == 0){
                for(int g=strResult.length()-1; g >= strResult.length() / 2; g--){
                    strBack += strResult.charAt(g);
                }
            } else {
                for(int g=strResult.length()-1; g > strResult.length() / 2; g--){
                    strBack += strResult.charAt(g);
                }
            }

            if(strPre.equals(strBack)){
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }

        }


    }
}
