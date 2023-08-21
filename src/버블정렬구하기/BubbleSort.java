package 버블정렬구하기;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 1, 3, 6, 10};
        // O(n2) 걸리는 시간

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for(int e : arr) System.out.print(e + " ");
    }
}
