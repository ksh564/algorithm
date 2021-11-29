package codility;

public class Codility03 {
    public static void main(String[] args) {

    }
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count = 0;
        while(X<Y){
            X += D;
            count++;
        }
        return count;
    }
}
