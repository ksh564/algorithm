package exam;

public class Codility01 {
    public static void main(String[] args) {
        solution(15);

    }
    public static int solution(int N) {
        // write your code in Java SE 8
        String intToBinary = Integer.toBinaryString(N);

        int result = 0;
        int counter = 0;
        for(int i=0; i<intToBinary.length(); i++){
            String comparedString  = String.valueOf(intToBinary.charAt(i));
            if("0".equals(comparedString)){
                counter++;
            } else {
                result = Integer.max(result,counter);
                counter = 0;
            }
        }
        return result;
    }

}
