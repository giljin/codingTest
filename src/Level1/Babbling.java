package Level1;

public class Babbling {
    public static void main(String[] args) {
        String[] dd = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(dd));
    }
    public static int solution(String[] babbling){
        int answer = 0;
        String[] possibleBabbling = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i] + "1";
            for (int j = 0; j < possibleBabbling.length; j++) {
                String[] splitBabbling = babbling[i].split(possibleBabbling[j]);

                for (int k = 1; k < splitBabbling.length; k++) {
                    if(!splitBabbling[k-1].isEmpty()){
                        splitBabbling[k-1] = " ";
                        splitBabbling[k] = " ";
                    }
                }
                babbling[i] = String.join("", splitBabbling);

            }

        }
        return answer;
    }
}
