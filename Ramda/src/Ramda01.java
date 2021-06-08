public class Ramda01 {
    public static void main(String[] args) {
        System.out.println("hello ramda!");

        /** 람다식 도입 전
        MyFunctionalInterface mfi = new MyFunctionalInterface() {
            @Override
            public int runSomething(int count) {
                return 0;
            }
        };
         */

        // 간소화 전
        // MyFunctionalInterface mfi = (int a) -> {return a * a;};

        // 간소화 후
        MyFunctionalInterface mfi = a -> a * a;

        // 람다식 테스트1
        int b = mfi.runSomething(5);
        System.out.println("b::" + b);

        // 람다식 테스트2
        doIt(mfi);

        // 만약, 람다식을 단 한번만 사용한다면 변수에 할당할 필요 없다.
        // 람다식 테스트3
        doIt(a -> a + a);
    }

   public static void doIt(MyFunctionalInterface mfi) {
        int b = mfi.runSomething(5);

        System.out.println(b);
    }

}
