package Level0;

public class decimalSum {
    /*
    * 문제 설명)
    * 첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
    * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    *
    * 제한사항)
    * 0 <denum1, num1, denum2, num2 < 1,000
    *
    * 테스트케이스)
    * 1	2	3	4	[5, 4]
    * 9 2	1	3	[29, 6]
    * */
    public static void main(String[] args) {
        int denum1 = 9;
        int num1 = 2;
        int denum2 = 1;
        int num2 = 3;
        for( int i : solution(denum1, num1, denum2, num2)){
            System.out.println(i);
        }
    }

    public static int[] solution(int denum1, int num1, int denum2, int num2){
        int[] answer = new int[2];

        int x = (denum1 * num2) + (denum2 * num1);
        int y = num1 * num2;

        int gcd = gcd(x, y);
        answer[0] = x / gcd;
        answer[1] = y / gcd;
        return answer;
    }
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}
