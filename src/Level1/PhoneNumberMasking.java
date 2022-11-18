package Level1;

public class PhoneNumberMasking {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }

    public static String solution(String phone_number){
        String answer = "";
        String maskingStr = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            maskingStr += "*";
        }
        answer = maskingStr + phone_number.substring(phone_number.length()-4);
        return answer;
    }
}
