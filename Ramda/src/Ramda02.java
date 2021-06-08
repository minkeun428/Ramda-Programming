public class Ramda02 {
    public static void main(String[] args) {

        /** 메서드 반환 값으로 람다식 사용 **/
        MyFunctionalInterface mfi = todo();

        int result = mfi.runSomething(3);

        System.out.println(result);
    }

    // 변수에 람다식 메서드를 담을 수도 있다.
    public static MyFunctionalInterface todo() {

        return num -> num * num;
    }
}
