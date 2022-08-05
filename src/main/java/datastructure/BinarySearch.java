package datastructure;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                end = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int result = binarySearch(arr,target,0,arr[arr.length-1]);

        if(result == -1){
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println("해당 하는 인덱스는:"+(result+1)+"번째 입니다.");
        }
    }
}
