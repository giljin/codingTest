package Level1;

import java.util.Arrays;

public class RemoveMinNum {

    public static void main(String[] args) {
        int[] t = solution(new int[]{4,2,1,3});
        for (int i :
                t) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr){
        if (arr.length == 1){
            return new int[]{-1};
        }
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < minNum ){
                minNum = arr[i];
            }
        }

        int[] answer = new int[arr.length-1];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if( minNum == arr[i]){
                minNum = -1;
                continue;
            }
            answer[cnt++] = arr[i];
        }
        return answer;
    }
}
