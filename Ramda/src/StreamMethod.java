import java.util.Arrays;

public class StreamMethod {
    public static void main(String[] args) {
        Integer[] ages = {10, 20, 30, 40};

        System.out.println(Arrays.stream(ages).count());

        System.out.println(Arrays.stream(ages).mapToInt(age -> age).sum());
        System.out.println(Arrays.stream(ages).mapToInt(age -> age).average());
        System.out.println(Arrays.stream(ages).mapToInt(age -> age).min());
        System.out.println(Arrays.stream(ages).mapToInt(age -> age).max());

        System.out.println(Arrays.stream(ages).allMatch(age -> age > 20));  // 조건에 다 맞냐
        System.out.println(Arrays.stream(ages).anyMatch(age -> age > 30));  // 하나라도 맞냐

        System.out.println(Arrays.stream(ages).findFirst());
        System.out.println(Arrays.stream(ages).findAny());  // 첫 번째 요소를 찾을 가능성이 높지만, 보장 못함
    }
}
