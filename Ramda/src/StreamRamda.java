import java.util.Arrays;

public class StreamRamda {
    public static void main(String[] args) {
        Integer[] ages = {20, 25, 18, 27, 30, 21, 17};

        // 미성년자 출입 제한 for-each
        /*
        for(int age : ages) {
            if(age < 20) {
                System.out.println("20세 미만은 출입 불가합니다.");
            }
        }
        */

        // 컬렉션 스트림 이용
        Arrays.stream(ages)
                .filter(age -> age < 20)
                .forEach(age -> System.out.println("20세 미만은 출입 불가합니다."));

    }
}
